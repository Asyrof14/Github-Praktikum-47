/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum11_47;

/**
 *
 * @author user
 */
public class Buku_Tugas {
    private String judul;
    private Pengarang_Tugas pengarang;

    public Buku_Tugas(String judul, Pengarang_Tugas pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        if (pengarang != null) {
            pengarang.infoPengarang();
        }
    }
}
