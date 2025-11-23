/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum11_47;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Pengujian Komposisi
        System.out.println("=== KOMPOSISI (PERPUSTAKAAN) ===");
        Perpustakaan perpustakaan = new Perpustakaan();
        Buku buku1 = new Buku("Pemrograman Java");
        Buku buku2 = new Buku("Algoritma dan Struktur Data");
        
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.infoPerpustakaan();

        // Pengujian Agregasi
        System.out.println("\n=== AGREGASI (KLUB) ===");
        Klub klubBola = new Klub("Klub Sepak Bola");
        Anggota anggota1 = new Anggota("Budi");
        Anggota anggota2 = new Anggota("Ani");
        
        klubBola.tambahAnggota(anggota1);
        klubBola.tambahAnggota(anggota2);
        klubBola.infoKlub();
    }
}

