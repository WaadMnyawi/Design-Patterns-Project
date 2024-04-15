/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternsproject;

/**
 *
 * @author waadl
 */
public class Payment {
    private Booking booking;
    private double amount;

    public Payment(Booking booking, double amount) {
        this.booking = booking;
        this.amount = amount;
    }

    public Booking getBooking() {
        return booking;
    }

    public double getAmount() {
        return amount;
    }
}