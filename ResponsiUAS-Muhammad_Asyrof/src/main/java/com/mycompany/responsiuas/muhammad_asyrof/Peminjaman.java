/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuas.muhammad_asyrof;

/**
 *
 * @author user
 */
import com.mycompany.responsiuas.muhammad_asyrof.Buku;
import com.mycompany.responsiuas.muhammad_asyrof.Anggota;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Peminjaman implements Serializable {
    private String kodeTransaksi;
    private Anggota peminjam;
    private List<Buku> daftarBukuPinjaman;

    public Peminjaman(String kodeTransaksi, Anggota peminjam) {
        this.kodeTransaksi = kodeTransaksi;
        this.peminjam = peminjam;
        this.daftarBukuPinjaman = new ArrayList<>(); 
    }

    public void tambahBuku(Buku buku) {
        if (buku.isTersedia()) {
            buku.pinjam(); 
            daftarBukuPinjaman.add(buku);
        } else {
            System.out.println("Gagal: Buku '" + buku.getJudul() + "' sedang dipinjam.");
        }
    }

    public void cetakStruk() {
        System.out.println("\n=== STRUK PEMINJAMAN ===");
        System.out.println("Kode: " + kodeTransaksi);
        System.out.println("Peminjam: " + peminjam.getNama());
        System.out.println("Daftar Buku:");
        for (Buku b : daftarBukuPinjaman) {
            System.out.println("- " + b.getJudul());
        }
        System.out.println("========================");
    }
}
