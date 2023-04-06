/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan5;

/**
 *
 * @author Firstian Alfani
 */
 public class Latihan5 
 {
        private String nama;
        private String jenis;
        private int kecepatan;
        private final int kecepatanmax = 170;
        
    public Latihan5 (String nama, String jenis, int kecepatan) 
    {
        this.nama = nama;
        this.jenis = jenis;
        this.kecepatan = kecepatan;
    }
    
    public void tambahKecepatan() 
    {
        this.kecepatan += 15;
        if (this.kecepatan > kecepatanmax) {
            this.kecepatan = kecepatanmax;
        System.out.println("Anda telah melampaui batas maksimum kecepatan!");
        }
    }
    
    public void kurangiKecepatan() 
    {
        this.kecepatan -= 15;
        if (this.kecepatan < 0) {
        this.kecepatan = 0;
        System.out.println("Kendaraan Berhenti");
        }
    }
    
    public void display() 
    {
        System.out.println("Kendaraan : " + this.nama);
        System.out.println("Jenis     : " + this.jenis);
        System.out.println("Kecepatan : " + this.kecepatan + " km/h");
    }
 }
