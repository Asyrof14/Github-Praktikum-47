/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum5_47;

/**
 *
 * @author user
 */
class Anjing_Tugas extends Hewan_Tugas {
    String suara = "Guk Guk";

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara: " + suara);
    }
}

