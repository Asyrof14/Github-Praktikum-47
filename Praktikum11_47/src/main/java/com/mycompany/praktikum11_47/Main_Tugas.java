/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum11_47;

/**
 *
 * @author user
 */
public class Main_Tugas {
    public static void main(String[] args) {
        Pengarang_Tugas pengarang1 = new Pengarang_Tugas("J.K. Rowling");
        Pengarang_Tugas pengarang2 = new Pengarang_Tugas("Tere Liye");

        Buku_Tugas buku1 = new Buku_Tugas("Harry Potter", pengarang1);
        Buku_Tugas buku2 = new Buku_Tugas("Bumi", pengarang2);
        Buku_Tugas buku3 = new Buku_Tugas("Bulan", pengarang2);

        Perpustakaan_Tugas perpusKota = new Perpustakaan_Tugas();

        perpusKota.tambahBuku(buku1);
        perpusKota.tambahBuku(buku2);
        perpusKota.tambahBuku(buku3);

        perpusKota.infoPerpustakaan();
    }
}
