/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum5_47;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.nama = "Honda Civic";
        m.kecepatan = 200;
        m.jumlahRoda = 4;
        m.jumlahPintu = 4;
        m.tampilkanInfo();

        SepedaMotor sm = new SepedaMotor();
        sm.nama = "Kawasaki Ninja";
        sm.kecepatan = 180;
        sm.jumlahRoda = 2;
        sm.jenisMesin = "4-tak";
        sm.tampilkanInfo();
    }
}

