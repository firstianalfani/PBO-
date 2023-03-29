package com.mycompany.praktikum4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Firstian Alfani
 */
public class Praktikum4b {
    public static void main(String[] args){
        String nama;
        int a=1, anak, gaji, penjualan;
        double bonus, total=0, terima;
        
        Scanner oscan01 = new Scanner(System.in);
        
        System.out.println("Hitung Total Penjualan ");
        System.out.println("=========================");
        System.out.print("Nama        : ");
        nama = oscan01.nextLine();
        System.out.print("Bulan       : ");
        nama = oscan01.nextLine();
        System.out.println("\nTotal Penjualan");
        while (a<5)
        {
            System.out.print("Minggu ke-" + a + " : ");
            penjualan = oscan01.nextInt();
            total += penjualan;
            a++;
        }
        
        //hitung bonus..............
        if (total > 5000000)
            bonus = 0.1 * total;
        else
            bonus  = 0.05 * total;
        
        terima = total + bonus;
        System.out.println("======================");
        System.out.println("Total       : " + total);
        System.out.println("Bonus       : " + bonus);
        System.out.println("Terima      : " + terima);
    }
    
}
