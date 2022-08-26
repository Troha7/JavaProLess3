package com.less3;

public class Car {
    public Car() {
    }

    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Car is ready!");
    }
    private void startElectricity(){
        System.out.println("Electricity is started!");
    }
    private void startCommand(){
        System.out.println("Command is started!");
    }
    private void startFuelSystem(){
        System.out.println("Fuel system is started!");
    }
}
