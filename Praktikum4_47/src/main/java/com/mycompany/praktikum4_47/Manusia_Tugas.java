/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4_47;

/**
 *
 * @author user
 */
public class Manusia_Tugas {
    
    private String nama;
    protected int usia;
    public String pekerjaan;
    
    // Konstruktor untuk inisialisasi atribut
    public Manusia_Tugas(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }
    
    // Getter untuk atribut 'nama'
    public String getNama() {
        return nama;
    }
    
    // Setter untuk atribut 'nama'
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public String toString() {
        return "Nama: " + this.nama + ", Usia: " + this.usia + ", Pekerjaan: " + this.pekerjaan;
    }
}
