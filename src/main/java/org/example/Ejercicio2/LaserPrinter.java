package org.example.Ejercicio2;
// LaserPrinter: representa una impresora láser
public class LaserPrinter implements OutputDevice {
    private String manufacturer;
    private String model;
    private double price;
    private int[] validPorts;
    private String cartridgeType;
    private int pagesPrintedSinceLastChange;
    public LaserPrinter(int[] validPorts, String cartridgeType) {
        this.manufacturer = "Default manufacturer";
        this.model = "Laser printer";
        this.price = 200.0;
        this.validPorts = validPorts;
        this.cartridgeType = cartridgeType;
        this.pagesPrintedSinceLastChange = 0;
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
    public String getCartridgeType() {
        return this.cartridgeType;
    }
    public int getPagesPrintedSinceLastChange() {
        return this.pagesPrintedSinceLastChange;
    }
    public void setPagesPrintedSinceLastChange(int pagesPrinted) {
        this.pagesPrintedSinceLastChange = pagesPrinted;
    }
}
