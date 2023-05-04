package org.example.Ejercicio2;

public class InputDeviceFactory implements ComponentFactory {
    public CentralUnit createCentralUnit() {
        return new BasicCentralUnit();
    }

    @Override
    public InputDevice createInputDevice() {
        return null;
    }

    @Override
    public OutputDevice createOutputDevice() {
        return null;
    }

    public InputDevice createInputDevice(String connectorType, int[] validPorts) {
        return new BasicInputDevice(connectorType, validPorts);
    }
    public OutputDevice createOutputDevice(int[] validPorts) {
        return null;
    }
}
