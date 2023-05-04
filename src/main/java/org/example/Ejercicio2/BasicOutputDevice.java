package org.example.Ejercicio2;

public class BasicOutputDevice implements OutputDevice {
    private String manufacturer;
    private String model;
    private double price;
    private int[] validPorts;
    public BasicOutputDevice(int[] validPorts) {
        this.manufacturer = "Default manufacturer";
        this.model = "Basic model";
        this.price = 80.0;
        this.validPorts = validPorts;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }
    public String getModel() {
        return this.model;
    }
    public double getPrice() {
        return this.price;
    }
    public int[] getValidPorts() {
        return this.validPorts;
    }
}
