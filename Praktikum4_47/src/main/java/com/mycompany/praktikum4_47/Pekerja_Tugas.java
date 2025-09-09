/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4_47;

/**
 *
 * @author user
 */
public class Pekerja_Tugas extends Manusia_Tugas {
    private double gaji;

    public Pekerja_Tugas(String nama, int usia, String pekerjaan, double gaji) {
        // Memanggil konstruktor dari kelas induk (Manusia)
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    
    // Getter untuk atribut 'gaji'
    public double getGaji() {
        return gaji;
    }
    
    // Setter untuk atribut 'gaji'
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    // Override metode toString() untuk menampilkan informasi lengkap Pekerja
    @Override
    public String toString() {
        // Menggunakan toString() dari kelas induk dan menambahkan informasi gaji
        return super.toString() + ", Gaji: " + this.gaji;
    }
}