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
public class Latihan4c {
    
    public static void main(String[] args) {
        String nama, nilaihuruf = null;
        int nilai;
        
        Scanner oscan01 = new Scanner(System.in);
        
        System.out.println("Data Test ");
        System.out.println("=================================");
        System.out.print("Nama              : "); 
        nama = oscan01.nextLine();
        System.out.print("Program Studi     : ");
        nama = oscan01.nextLine();
        System.out.print("Nilai             : " );
        nilai = oscan01.nextInt();
        
        //nilai............
       if (nilai >= 85 && nilai <= 100) {
            nilaihuruf = "A";
        } else if (nilai >= 70 && nilai < 85) {
          nilaihuruf = "B";
        } else if (nilai >= 60 && nilai < 70) {
            nilaihuruf = "C";
        } else if (nilai >= 50 && nilai < 60) {
            nilaihuruf = "D";
        } else if (nilai >= 0 && nilai < 50) {
            nilaihuruf = "E";
    }
        System.out.println("Nilai Huruf       : " + nilaihuruf);
        System.out.print("=================================");
}
}
