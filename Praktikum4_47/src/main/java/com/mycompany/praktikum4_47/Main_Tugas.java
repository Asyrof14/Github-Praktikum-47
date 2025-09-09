/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4_47;

/**
 *
 * @author user
 */
public class Main_Tugas {
    public static void main(String[] args) {
        // Membuat objek dari kelas Pekerja
        Pekerja_Tugas pekerja1 = new Pekerja_Tugas("Raya Fitri", 20, "Software Engineer", 5000000.0);
        
        // Menampilkan informasi pekerja dengan toString()
        System.out.println("Informasi Awal:");
        System.out.println(pekerja1);
        System.out.println();
        
        // Mengubah nama pekerja menggunakan metode setter
        System.out.println("Informasi Nama, Gaji berubah");
        pekerja1.setNama("Raya Fitri Nirmala");
        pekerja1.setGaji(7000000.0);
        
        // Menampilkan ulang informasi pekerja setelah perubahan
        System.out.println("Setelah Perubahan:");
        System.out.println(pekerja1);
        System.out.println();
        
        /*
        System.out.println("Nama: " + pekerja1.nama);
        System.out.println("Usia: " + pekerja1.usia);
        System.out.println("Gaji: " + pekerja1.gaji);
        */
    }
}
