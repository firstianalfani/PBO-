/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;
import java.util.Scanner;
/**
 *
 * @author Firstian Alfani
 */
public class Main {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Nama        : ");
    String nama = input.nextLine();
    System.out.print("Masukkan NIM         : ");
    String nim = input.nextLine();
    System.out.print("Masukkan Umur        : ");
    int umur = input.nextInt();
    System.out.print("Masukkan Asal Sekolah       : ");
    String asalSekolah = input.next();
    MahasiswaBaru mahasiswabaru = new MahasiswaBaru (nama, nim, umur, asalSekolah);
    mahasiswabaru.display();
 }
}
