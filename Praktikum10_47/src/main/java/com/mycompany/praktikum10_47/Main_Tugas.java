/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum10_47;

/**
 *
 * @author user
 */
public class Main_Tugas {
    public static void main(String[] args) {
        
        double hargaTV = 5000000;
        Pembayaran_Tugas tv = new Elektronik_Tugas();
        double pajakTV = tv.hitungPajak(hargaTV);
        
        System.out.println("--- Produk Elektronik (TV) ---");
        System.out.println("Harga Asli: Rp" + hargaTV);
        System.out.println("Pajak (10%): Rp" + pajakTV);
        System.out.println("Total Harga: Rp" + (hargaTV + pajakTV));
        
        System.out.println(); 
        
        double hargaRoti = 20000;
        Pembayaran_Tugas roti = new Makanan_Tugas();
        double pajakRoti = roti.hitungPajak(hargaRoti);
        
        System.out.println("--- Produk Makanan (Roti) ---");
        System.out.println("Harga Asli: Rp" + hargaRoti);
        System.out.println("Pajak (5%): Rp" + pajakRoti);
        System.out.println("Total Harga: Rp" + (hargaRoti + pajakRoti));
    }
}

