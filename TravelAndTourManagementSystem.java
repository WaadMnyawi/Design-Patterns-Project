/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designpatternsproject;

/**
 *
 * @author waadl
 */
public class TravelAndTourManagementSystem {
    
    public static void main(String[] args) {
        
        TourPackage package1 = new TourPackage("Package 1", "Description 1", 1000);
        TourPackage package2 = new TourPackage("Package 2", "Description 2", 1500);

        Customer customer1 = new Customer("John Doe", "john@example.com", "1234567890");
        Customer customer2 = new Customer("Jane Smith", "jane@example.com", "0987654321");

        Booking booking1 = new Booking(customer1, package1, "2024-05-01", 2);
        Booking booking2 = new Booking(customer2, package2, "2024-06-01", 3);

        System.out.println("Booking Details:");
        System.out.println(booking1);
        System.out.println(booking2);
 }
}
 