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
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManajemenPerpustakaan {
    private List<Buku> koleksiBuku;
    private List<Anggota> daftarAnggota; 
    private List<Peminjaman> riwayatPeminjaman;
    
    private final String FILE_NAME = "data_perpustakaan.ser";

    public ManajemenPerpustakaan() {
        koleksiBuku = new ArrayList<>();
        daftarAnggota = new ArrayList<>();
        riwayatPeminjaman = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) { koleksiBuku.add(buku); }

    public void daftarAnggota(Anggota anggota) { 
        daftarAnggota.add(anggota); 
    } 

    public void prosesPeminjaman(Peminjaman p) { riwayatPeminjaman.add(p); }

    public void tampilkanSemuaBuku() {
        System.out.println("\n[Koleksi Perpustakaan]");
        if (koleksiBuku.isEmpty()) System.out.println("(Kosong)");
        for (Buku b : koleksiBuku) b.tampilkanInfo();
    }

    public Buku cariBuku(String judul) {
        for (Buku b : koleksiBuku) if (b.getJudul().equalsIgnoreCase(judul)) return b;
        return null;
    }

    public Anggota cariAnggota(String nama) {
        for (Anggota a : daftarAnggota) if (a.getNama().equalsIgnoreCase(nama)) return a;
        return null;
    }

    // --- Serialisasi untuk Menyimpan Data ---
    public void simpanData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(koleksiBuku);
            oos.writeObject(daftarAnggota);
            oos.writeObject(riwayatPeminjaman);
            System.out.println(">> Data berhasil disimpan.");
        } catch (IOException e) {
            System.err.println(">> Gagal menyimpan data: " + e.getMessage());
        }
    }

    // --- Deserialisasi untuk Memuat Data ---
    @SuppressWarnings("unchecked")
    public void muatData() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            koleksiBuku = (List<Buku>) ois.readObject();
            daftarAnggota = (List<Anggota>) ois.readObject();
            riwayatPeminjaman = (List<Peminjaman>) ois.readObject();
            System.out.println(">> Data berhasil dimuat.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(">> Gagal memuat data (Format file mungkin berbeda).");
        }
    }
}
