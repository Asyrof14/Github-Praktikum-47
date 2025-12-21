/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuas.muhammad_asyrof;

/**
 *
 * @author user
 */
public class Buku extends ItemPerpustakaan implements DapatDipinjam {
    private String pengarang;
    private boolean isTersedia;

    public Buku(String id, String judul, String pengarang) {
        super(id, judul);
        this.pengarang = pengarang;
        this.isTersedia = true;
    }

    @Override
    public void tampilkanInfo() {
        String status = isTersedia ? "Tersedia" : "Dipinjam";
        System.out.println("ID: " + id + " | Judul: " + judul + " | Pengarang: " + pengarang + " | Status: " + status);
    }

    @Override
    public void pinjam() {
        if (isTersedia) {
            isTersedia = false;
        } else {
            System.out.println("Buku " + judul + " sedang tidak tersedia.");
        }
    }

    @Override
    public void kembalikan() {
        isTersedia = true;
    }
    
    public boolean isTersedia() { return isTersedia; }
}

