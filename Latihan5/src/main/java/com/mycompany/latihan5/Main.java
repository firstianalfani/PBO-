/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan5;
import java.util.Scanner;
/**
 *
 * @author Firstian Alfani
 */
public class Main {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Masukkan nama kendaraan           : ");
 String nama = input.nextLine();
 System.out.print("Masukkan jenis kendaraan          : ");
 String jenis = input.nextLine();
 System.out.print("Masukkan kecepatan awal kendaraan : ");
 int kecepatan = input.nextInt();
 Latihan5 kendaraan = new Latihan5 (nama, jenis, kecepatan);
 int pilihan;
 do {
 System.out.println("\nMenu:");
 System.out.println("1. Tambah kecepatan");
 System.out.println("2. Kurangi kecepatan");
 System.out.println("3. Keluar");
 System.out.print("Pilihan anda: ");
 pilihan = input.nextInt();
 
 switch (pilihan) {
 case 1:
 kendaraan.tambahKecepatan();
 kendaraan.display();
 break;
 case 2:
 kendaraan.kurangiKecepatan();
 kendaraan.display();
 break;
 case 3:
 System.out.println("Anda Telah Keluar");
 break;
 default:
 System.out.println("Pilihan Salah!");
 break;
 }
 } while (pilihan != 3);
 }
}