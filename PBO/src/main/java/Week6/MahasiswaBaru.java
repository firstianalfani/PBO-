/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;

/**
 *
 * @author Firstian Alfani
 */
public class MahasiswaBaru extends Mahasiswa {
    private String asalSekolah;
    
    public MahasiswaBaru(String nama, String nim, int umur, String asalSekolah)
    {
        super (nama, nim, umur);
        this.asalSekolah = asalSekolah;
    }
    
    public String getasalSekolah(){
        return asalSekolah;
    }
    
    public void setasalSekolah(){
        this.asalSekolah = asalSekolah;
    }
             
    public void display() 
    {
        System.out.println("Nama : " + super.getNama());
        System.out.println("NIM  : " + super.getNim());
        System.out.println("Umur : " + super.getUmur());
        System.out.println("Asal Sekolah : " + asalSekolah);
    }
    
}
