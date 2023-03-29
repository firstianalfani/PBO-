/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum4;
import java.util.Scanner;
/**
 *
 * @author Firstian Alfani
 */
public class Praktikum4 {

    public static void main(String[] args) {
        String nama;
        int anak, gaji, tanak, total;
        
        Scanner oscan01 = new Scanner(System.in);
        
        System.out.println("Hitung Tunj. anak");
        System.out.println("=========================");
        System.out.print("Nama        : ");
        nama = oscan01.nextLine();
        System.out.print("Anak        : ");
        anak = oscan01.nextInt();
        System.out.print("Gaji        : ");
        gaji = oscan01.nextInt();
        
        //hitung tunj. anak..............
        if (anak > 3)
            tanak = 3 * 200000;
        else
            tanak = anak * 200000;
        
        total = gaji + tanak;
        
        System.out.println("Tunj anak   : " + tanak);
        System.out.println("Total       : " + total);
    }
}
