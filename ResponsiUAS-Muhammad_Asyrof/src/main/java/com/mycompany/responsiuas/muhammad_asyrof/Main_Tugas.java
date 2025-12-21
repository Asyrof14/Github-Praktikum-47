/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuas.muhammad_asyrof;

/**
 *
 * @author user
 */
import com.mycompany.responsiuas.muhammad_asyrof.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main_Tugas {
    public static void main(String[] args) {
        ManajemenPerpustakaan sistem = new ManajemenPerpustakaan();
        Scanner scanner = new Scanner(System.in);

        sistem.muatData();

        while (true) {
            System.out.println("\n=== PERPUSTAKAAN DIGITAL ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Daftar Anggota");
            System.out.println("3. Lihat Katalog");
            System.out.println("4. Transaksi Peminjaman");
            System.out.println("5. Simpan & Keluar");
            System.out.print("Pilihan: ");

            try {
                int pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.print("ID Buku: "); String idB = scanner.nextLine();
                        System.out.print("Judul: "); String judul = scanner.nextLine();
                        System.out.print("Pengarang: "); String pengarang = scanner.nextLine(); 
                        sistem.tambahBuku(new Buku(idB, judul, pengarang));
                        break;
                    case 2:
                        System.out.print("ID Anggota: "); String idA = scanner.nextLine();
                        System.out.print("Nama: "); String nama = scanner.nextLine();
                        sistem.daftarAnggota(new Anggota(idA, nama));
                        break;
                    case 3:
                        sistem.tampilkanSemuaBuku();
                        break;
                    case 4:
                        System.out.print("Nama Peminjam: "); String namaPeminjam = scanner.nextLine();
                        Anggota a = sistem.cariAnggota(namaPeminjam);
                        if (a != null) {
                            // Membuat Transaksi baru
                            Peminjaman trans = new Peminjaman("TRX-" + System.currentTimeMillis(), a);
                            while(true) {
                                System.out.print("Judul Buku (ketik 'selesai' utk stop): ");
                                String judulBuku = scanner.nextLine();
                                if(judulBuku.equalsIgnoreCase("selesai")) break;
                                
                                Buku b = sistem.cariBuku(judulBuku);
                                if (b != null) trans.tambahBuku(b);
                                else System.out.println("Buku tidak ditemukan.");
                            }
                            sistem.prosesPeminjaman(trans);
                            trans.cetakStruk();
                        } else System.out.println("Anggota tidak ditemukan.");
                        break;
                    case 5:
                        sistem.simpanData();
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (InputMismatchException e) {
                // Menangani error jika user menginput huruf saat diminta angka
                System.out.println("Error: Input harus berupa angka!");
                scanner.nextLine();
            }
        }
    }
}

