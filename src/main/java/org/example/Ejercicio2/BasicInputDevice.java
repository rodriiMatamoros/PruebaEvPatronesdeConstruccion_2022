package org.example.Ejercicio2;

public class BasicInputDevice implements InputDevice {
    private String manufacturer;
    private String model;
    private double price;
    private String connectorType;
    private int[] validPorts;
    public BasicInputDevice(String connectorType, int[] validPorts) {
        this.manufacturer = "Default manufacturer";
        this.model = "Basic model";
        this.price = 50.0;
        this.connectorType = connectorType;
        this.validPorts = validPorts;
    }
    public String getManufacturer() {
        return
                this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }
    public double getPrice() {
        return this.price;
    }
    public String getConnectorType() {
        return this.connectorType;
    }
    public int[] getValidPorts() {
        return this.validPorts;
    }
}