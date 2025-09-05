/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum3_47;

/**
 *
 * @author user
 */
public class Main_Tugas {
    public static void main(String[] args) {
        Mobil_Tugas mobil1 = new Mobil_Tugas("Lamborghini", "Temerario", 2025, "Biru");
        Mobil_Tugas mobil2 = new Mobil_Tugas("BMW", "i7", 2022, "Abu-abu");
        Mobil_Tugas mobil3 = new Mobil_Tugas("Ferrari", "F80", 2024, "Merah");

        mobil1.displayInfo();
        System.out.println();
        mobil2.displayInfo();
        System.out.println();
        mobil3.displayInfo();
        System.out.println();

        mobil1.startEngine();
        mobil2.startEngine();
        mobil3.startEngine();
        System.out.println();

        System.out.println("Ubah warna mobil menjadi hijau.");
        mobil1.setWarna("Hijau");
        
        System.out.println("Ubah tahun rilis mobil menjadi 2023.");
        mobil1.setTahun(2023);

        mobil1.displayInfo();
    }
}
