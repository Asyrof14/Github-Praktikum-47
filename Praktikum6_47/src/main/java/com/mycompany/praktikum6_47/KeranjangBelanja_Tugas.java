/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum6_47;

/**
 *
 * @author user
 */
import java.util.ArrayList;

class KeranjangBelanja_Tugas {
    ArrayList<Produk_Tugas> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk_Tugas p) {
        daftarProduk.add(p);
    }

    public double hitungTotal() {
        double total = 0;
        for (Produk_Tugas p : daftarProduk) {
            total += p.harga - p.hitungDiskon();
        }
        return total;
    }
}

