/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum12_47;

/**
 *
 * @author user
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main_Tugas {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku_Tugas> daftarBuku = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== Sistem Manajemen Buku ===");
            System.out.println("1. Tambah Buku Baru");
            System.out.println("2. Simpan ke File Teks (buku.txt)");
            System.out.println("3. Simpan Objek ke File Serial (buku.ser)");
            System.out.println("4. Tampilkan Daftar Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 
            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> tampilkanDaftarBuku();
                case 5 -> {
                    System.out.println("Keluar dari sistem.");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan Judul Buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan Pengarang: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan Tahun Terbit: ");
        int tahun = scanner.nextInt();
        daftarBuku.add(new Buku_Tugas(judul, pengarang, tahun));
        System.out.println("Buku berhasil ditambahkan ke daftar sementara.");
    }
    private static void simpanKeFileTeks() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Buku_Tugas buku : daftarBuku) {
                writer.write(buku.toString() + "\n");
            }
            System.out.println("Data berhasil disimpan ke " + TEXT_FILE);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke file teks.");
            e.printStackTrace();
        }
    }
    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(daftarBuku);
            System.out.println("Objek berhasil diserialisasi ke " + SERIAL_FILE);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke file serial.");
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    private static void tampilkanDaftarBuku() {
        System.out.println("\n--- Daftar Buku (dari Memori) ---");
        for (Buku_Tugas buku : daftarBuku) {
            buku.tampilkanInfo();
        }
        System.out.println("\n--- Membaca dari File Serial (Deserialisasi) ---");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            List<Buku_Tugas> bukuDariFile = (List<Buku_Tugas>) ois.readObject();
            for (Buku_Tugas buku : bukuDariFile) {
                buku.tampilkanInfo();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Tidak dapat membaca file serial (mungkin file belum ada).");
        }
    }
}
