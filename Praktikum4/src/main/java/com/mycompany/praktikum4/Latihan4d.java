/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4;

import java.util.Scanner;

/**
 *
 * @author Firstian Alfani
 */
public class Latihan4d {
    
    public static void main(String[] args) {
        String nama, noplg = null;
        int air, biayapakai;
        
        Scanner oscan01 = new Scanner(System.in);
        
        System.out.println("Perhitungan Biaya Pemakaian Air ");
        System.out.println("=================================");
        System.out.print("Nama              : "); 
        nama = oscan01.nextLine();
        System.out.print("No Pelanggan      : ");
        noplg = oscan01.nextLine();
        System.out.print("Pemakaian Air     : " );
        air = oscan01.nextInt();
        
        //nilai............
        if (air <= 10) {
            biayapakai = air * 1000;
        } else if (air <= 20) {
            biayapakai = 10 * 1000 + (air - 10) * 2000;
        } else {
            biayapakai= 10 * 1000 + 10 * 2000 + (air - 20) * 5000;
        }
    
        System.out.println("Biaya Pakai       : " + biayapakai);
        System.out.print("=================================");
}
}
