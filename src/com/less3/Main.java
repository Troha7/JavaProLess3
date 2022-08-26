package com.less3;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setFullName("Dmytro Trotsenko");
        employee.setPosition("Software developer");
        employee.setEmail("trohae7@gmail.com");
        employee.setPhone("123");
        employee.setAge(32);

        System.out.println("Full name: " + employee.getFullName());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Phone: " + employee.getPhone());
        System.out.println("Age: " + employee.getAge());

        SameName sameName1 = new SameName();
        com.less3.sameName.SameName sameName2 = new com.less3.sameName.SameName();

        Car car = new Car();
        car.start();
    }
}
