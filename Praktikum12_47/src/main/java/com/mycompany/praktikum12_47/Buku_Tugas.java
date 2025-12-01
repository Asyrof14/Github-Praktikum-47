/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum12_47;

/**
 *
 * @author user
 */
import java.io.Serializable;
public class Buku_Tugas implements Serializable {
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    public Buku_Tugas(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun: " + tahunTerbit);
    }
    @Override
    public String toString() {
        return "Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun: " + tahunTerbit;
    }
}
