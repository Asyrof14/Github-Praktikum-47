/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum3_47;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Stalin", 3);
        kucing.suara();
        kucing.info();
        kucing.berlari();
        
        Hewan anjing = new Hewan("Hector", 4);
        anjing.suara();
        anjing.info();
        anjing.berlari();
    }
}
