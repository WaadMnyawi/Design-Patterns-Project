/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designpatternsproject;

/**
 *
 * @author waadl
 */
public class TourPackage {
    private String packageName;
    private String description;
    private double price;

    public TourPackage(String packageName, String description, double price) {
        this.packageName = packageName;
        this.description = description;
        this.price = price;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    // Override toString() method to display package details
    @Override
    public String toString() {
        return "Package: " + packageName + "\nDescription: " + description + 
                "\nPrice: $" + price;
    }
}