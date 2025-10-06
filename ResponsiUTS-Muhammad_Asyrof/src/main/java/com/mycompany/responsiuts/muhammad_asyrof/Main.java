/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts.muhammad_asyrof;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Output Produk");
        Elektronik laptop = new Elektronik();
        laptop.setNamaProduk("Laptop");
        laptop.setHarga(15000000);
        laptop.setGaransi(2);
        laptop.tampilkanInfo();

        System.out.println("\nOutput Pegawai");
        PegawaiTetap pegawaiBudi = new PegawaiTetap();
        pegawaiBudi.setNamaPegawai("Asyrof"); 
        pegawaiBudi.setGaji(5000000);
        pegawaiBudi.setTunjangan(1000000);
        pegawaiBudi.tampilkanInfo();

        System.out.println("\nPolimorfisme");

        Produk produkPolimorfis = new Makanan();
        produkPolimorfis.setNamaProduk("Snack");
        produkPolimorfis.setHarga(15000);
        ((Makanan) produkPolimorfis).setTanggalKadaluarsa("2023-12-30");
        
        Pegawai pegawaiPolimorfis = new PegawaiKontrak();
        pegawaiPolimorfis.setNamaPegawai("Andi");
        pegawaiPolimorfis.setGaji(3000000);
        ((PegawaiKontrak) pegawaiPolimorfis).setLamaKontrak(12);

        produkPolimorfis.tampilkanInfo();
        System.out.println(); // Memberi jarak
        pegawaiPolimorfis.tampilkanInfo();
    }
}
