/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Praktikum9;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Firstian Alfani
 */
public interface Phone {
    void powerOn();
    void powerOff();
    void increaseVolume();
    void decreaseVolume();
    void topUpBalance(double amount);
    double getBalance();
    void addContact(String name, String phoneNumber);
    void viewAllContacts();
    void searchContact(String name);

}   

