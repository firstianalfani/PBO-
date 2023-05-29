/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum9;

import java.util.ArrayList;

/**
 *
 * @author Firstian Alfani
 */
public class VivoPhone implements Phone {
   private boolean status;
    private int volume;
    private double pulsa;
    private ArrayList<Contact> contacts;

    public VivoPhone() {
        status = false;
        volume = 0;
        pulsa = 0.0;
        contacts = new ArrayList<>();
    }

    @Override
    public void powerOn() {
        status = true;
        System.out.println("HP Hidup");
    }

    @Override
    public void powerOff() {
        status = false;
        System.out.println("HP Mati");
    }

    @Override
    public void increaseVolume() {
        if (status) {
            volume++;
            System.out.println("Volume Meningkat: " + volume);
        } else {
            System.out.println("Hidupkan HP Terlebih Dahulu");
        }
    }

    @Override
    public void decreaseVolume() {
        if (status) {
            volume--;
            System.out.println("Volume Berkurang: " + volume);
        } else {
            System.out.println("Hidupkan HP Terlebih Dahulu");
        }
    }

    @Override
    public void topUpBalance(double amount) {
        if (status) {
            pulsa += amount;
            System.out.println("Top Up Pulsa: Rp" + amount);
        } else {
            System.out.println("Hidupkan HP Terlebih Dahulu");
        }
    }

    @Override
    public double getBalance() {
        return pulsa;
    }

    @Override
    public void addContact(String name, String phoneNumber) {
        if (status) {
            Contact contact = new Contact(name, phoneNumber);
            contacts.add(contact);
            System.out.println("Kontak ditambahkan: " + name + " - " + phoneNumber);
        } else {
            System.out.println("Hidupkan HP Terlebih Dahulu");
        }
    }

    @Override
    public void viewAllContacts() {
        if (status) {
            if (contacts.isEmpty()) {
                System.out.println("Kontak Tidak Ditemukan");
            } else {
                System.out.println("Semua Kontak:");
                for (Contact contact : contacts) {
                    System.out.println(contact.getName() + " - " + contact.getPhoneNumber());
                }
            }
        } else {
            System.out.println("Hidupkan HP Terlebih Dahulu");
        }
    }

    @Override
    public void searchContact(String name) {
        if (status) {
            boolean found = false;
            for (Contact contact : contacts) {
                if (contact.getName().equalsIgnoreCase(name)) {
                    System.out.println("Kontak Ditemukan:");
                    System.out.println(contact.getName() + " - " + contact.getPhoneNumber());
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Kontak Tidak Ditemukan");
            }
        } else {
            System.out.println("Hidupkan HP Terlebih Dahulu");
        }
    }
}
 

