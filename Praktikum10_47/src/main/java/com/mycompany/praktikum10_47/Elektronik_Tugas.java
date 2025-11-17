/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum10_47;

/**
 *
 * @author user
 */
public class Elektronik_Tugas implements Pembayaran_Tugas {
    @Override
    public double hitungPajak(double harga) {
        // 10% dari harga
        return harga * 0.10;
    }
}
