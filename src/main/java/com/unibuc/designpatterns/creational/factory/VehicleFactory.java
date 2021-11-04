package com.unibuc.designpatterns.creational.factory;

// TODO: make it a singleton!
public class VehicleFactory {

    public static Vehicle getVehicle(String criteria) {
        if ("C".equals(criteria)) {
            return new Car();
        }
        if ("B".equals(criteria)) {
            return new Bus();
        }

        if ("M".equals(criteria)) {
            return new Moto();
        }

        throw new IllegalArgumentException();
    }
}

class MainVehicleFactory {

    public static void main(String[] args) {
        System.out.println(VehicleFactory.getVehicle("C").getType()); // M
        System.out.println(VehicleFactory.getVehicle("B").getType()); // L
        System.out.println(VehicleFactory.getVehicle("M").getType()); // S
        System.out.println(VehicleFactory.getVehicle("T").getType());
    }
}
