/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum11_47;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan_Tugas {
    private List<Buku_Tugas> daftarBuku;

    public Perpustakaan_Tugas() {
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku_Tugas buku) {
        daftarBuku.add(buku);
    }

    public void infoPerpustakaan() {
        System.out.println("Daftar Buku di Perpustakaan:");
        if (daftarBuku.isEmpty()) {
            System.out.println("(Kosong)");
        } else {
            for (Buku_Tugas buku : daftarBuku) {
                buku.infoBuku();
                System.out.println("---"); 
            }
        }
    }
}
