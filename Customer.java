/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designpatternsproject;

/**
 *
 * @author waadl
 */
public class Customer {
    
    private String name;
    private String email;
    private String phoneNumber;

    public Customer(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Override toString() method to display customer details
   @Override
    public String toString() {
        return "Name: " + name + "\nEmail: " + email + "\nPhone: " + phoneNumber;
    }
}