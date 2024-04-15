/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternsproject;

/**
 *
 * @author waadl
 */
public class Booking {
    private Customer customer;
    private TourPackage tourPackage;
    private String date;
    private int duration;

    public Booking(Customer customer, TourPackage tourPackage, String date, int duration) {
        this.customer = customer;
        this.tourPackage = tourPackage;
        this.date = date;
        this.duration = duration;
    }

    public Customer getCustomer() {
        return customer;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public String getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    // Override toString() method to display booking details
    @Override
    public String toString() {
        return customer.toString() + "\n" + tourPackage.toString() + "\nDate: " 
                + date + "\nDuration: " + duration + " days";
    }
}