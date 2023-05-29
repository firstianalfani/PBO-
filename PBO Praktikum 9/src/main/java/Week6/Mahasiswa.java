/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;

/**
 *
 * @author Firstian Alfani
 */
public class Mahasiswa {
    private char nama;
    private String nim;
    private int umur;
    
    public Mahasiswa(char nama, String nim, int umur){
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }
    
    public char getNama () {
        return nama;
    }
    
    public String getNim() {
       return nim; 
    }
    public int getUmur () {
        return umur;
    }
    
    public void setNama (char nama){
       this.nama = nama; 
    }
    public void setNim (String nim) {
       this.nim = nim;  
    }
    public void setUmur (int umur) {
        this.umur = umur;
    }


public void display() 
    {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.nim);
        System.out.println("Umur : " + this.umur);
    }
}

