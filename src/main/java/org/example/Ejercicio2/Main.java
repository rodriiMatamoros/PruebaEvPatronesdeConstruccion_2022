package org.example.Ejercicio2;
//error en la linea 6
public class Main {
   /* public static void main(String[] args) {
        // Crear una fábrica concreta para crear los componentes
        ComponentFactory factory = new OutputDeviceFactory();

        // Crear los componentes mínimos del ordenador
        CentralUnit centralUnit = factory.createCentralUnit();
        InputDevice inputDevice = factory.createInputDevice();
        OutputDevice outputDevice = factory.createOutputDevice();

        // Mostrar los componentes creados
        System.out.println("Central Unit:");
        System.out.println("Manufacturer: " + centralUnit.getManufacturer());
        System.out.println("Model: " + centralUnit.getModel());
        System.out.println("Price: " + centralUnit.getPrice());
        System.out.println("Processor Speed: " + centralUnit.getProcessorSpeed());
        System.out.println("RAM Size: " + centralUnit.getRAMSize());
        System.out.println();

        System.out.println("Input Device:");
        System.out.println("Manufacturer: " + inputDevice.getManufacturer());
        System.out.println("Model: " + inputDevice.getModel());
        System.out.println("Price: " + inputDevice.getPrice());
        System.out.println("Connector Type: " + inputDevice.getConnectorType());
        System.out.print("Valid Ports: ");
        for (int i = 0; i < inputDevice.getValidPorts().length; i++) {
            System.out.print(inputDevice.getValidPorts()[i]);
            if (i < inputDevice.getValidPorts().length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Output Device:");
        System.out.println("Manufacturer: " + outputDevice.getManufacturer());
        System.out.println("Model: " + outputDevice.getModel());
        System.out.println("Price: " + outputDevice.getPrice());
        System.out.print("Valid Ports: ");
        for (int i = 0; i < outputDevice.getValidPorts().length; i++) {
            System.out.print(outputDevice.getValidPorts()[i]);
            if (i < outputDevice.getValidPorts().length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        // Calcular el precio total del ordenador
        double totalPrice = centralUnit.getPrice() + inputDevice.getPrice() + outputDevice.getPrice();
        System.out.println("Total Price: " + totalPrice);
    }*/
}