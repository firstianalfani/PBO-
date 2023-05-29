/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum9;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Firstian Alfani
 */
public class VivoMain {
    public static void main(String[] args) {
        VivoPhone myPhone = new VivoPhone();
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
             System.out.println("1. Hidupkan HP");
            System.out.println("2. Matikan HP");
            System.out.println("3. Naikan Volume");
            System.out.println("4. Turunkan Volume");
            System.out.println("5. Top up Pulsa");
            System.out.println("6. Saldo Pulsa");
            System.out.println("7. Tambah Kontak");
            System.out.println("8. Liat Kontak");
            System.out.println("9. Cari Kontak");
            System.out.println("10. Keluar");
            System.out.print("Pilih Menu : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    myPhone.powerOn();
                    break;
                case 2:
                    myPhone.powerOff();
                    break;
                case 3:
                    myPhone.increaseVolume();
                    break;
                case 4:
                    myPhone.decreaseVolume();
                    break;
                case 5:
                    System.out.print("Masukan Nominal Top Up: Rp");
                    double amount = scanner.nextDouble();
                    myPhone.topUpBalance(amount);
                    break;
                case 6:
                    System.out.println("Saldo Pulsa: Rp" + myPhone.getBalance());
                    break;
                case 7:
                    System.out.print("Masukan Nama: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.print("Masukan NO HP: ");
                    String phoneNumber = scanner.nextLine();
                    myPhone.addContact(name, phoneNumber);
                    break;
                case 8:
                    myPhone.viewAllContacts();
                    break;
                case 9:
                    System.out.print("Masukan Nama Kontak: ");
                    scanner.nextLine();
                    String searchName = scanner.nextLine();
                    myPhone.searchContact(searchName);
                    break;
                case 10:
                    isRunning = false;
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak ada!");
                    break;
            }
            System.out.println();
        }

        scanner.close();
    }
}

 

