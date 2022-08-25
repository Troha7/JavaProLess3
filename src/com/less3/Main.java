package com.less3;

import com.less3.sameName.SameName;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee
                ("Dmytro Trotsenko","Software developer","trohae7@gmail.com","123",32);

        SameName sameName1 = new SameName();
        SameName sameName2 = new SameName();

        Car car = new Car();
        car.start();
    }
}
