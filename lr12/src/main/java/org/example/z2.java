package org.example;

public class z2 {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    // Конструкторы
    public z2() {
        this("", "", 0, "", 0.0);
    }

    public z2(String name, String surname) {
        this(name, surname, 0, "", 0.0);
    }

    public z2(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Experience in years: " + experienceInYears);
        System.out.println("English level: " + englishLevel);
        System.out.println("Salary: " + salary);
    }

    public void printInfo(String prefix) {
        System.out.println(prefix + " " + name + " " + surname);
    }

    public void printInfo(String prefix, String postfix) {
        System.out.println(prefix + " " + name + " " + surname + " " + postfix);
    }

    public static void Primer() {
        System.out.println("Primer");
    }

}