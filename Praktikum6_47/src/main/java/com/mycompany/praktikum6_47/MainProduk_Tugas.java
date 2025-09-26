/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum6_47;

/**
 *
 * @author user
 */
public class MainProduk_Tugas {
    public static void main(String[] args) {
        KeranjangBelanja_Tugas keranjang = new KeranjangBelanja_Tugas();

        keranjang.tambahProduk(new Buku_Tugas("Animal Farm", 100000));
        keranjang.tambahProduk(new Elektronik_Tugas("Headphone", 250000));
        keranjang.tambahProduk(new Pakaian_Tugas("Kaos", 75000));

        System.out.println("Total harga setelah diskon: " + keranjang.hitungTotal());
    }
}
