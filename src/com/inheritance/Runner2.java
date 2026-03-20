package com.inheritance;

public class Runner2 {
    static void main() {
        Manager manager = new Manager("Jalaj",700,80000,4);
        Developer developer = new Developer("Bhushan",711,85000,"Java");
        Intern intern = new Intern("Shlok",101,15000,"Jain Deemed University");

        System.out.println("++++++++ Manager Details Are As Follows++++++++");
        manager.DisplayInfo();

        System.out.println("++++++++ Developer Details Are As Follows++++++++");
        developer.DisplayInfo();

        System.out.println("++++++++ Intern Details Are As Follows++++++++");
        intern.DisplayInfo();
    }
}
