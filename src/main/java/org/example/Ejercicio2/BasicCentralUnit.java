package org.example.Ejercicio2;

public class BasicCentralUnit implements CentralUnit {
    private String manufacturer;
    private String model;
    private double price;
    public BasicCentralUnit() {
        this.manufacturer = "Default manufacturer";
        this.model = "Basic model";
        this.price = 100.0;
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

    @Override
    public int getProcessorSpeed() {
        return 0;
    }

    @Override
    public int getRAMSize() {
        return 0;
    }
}