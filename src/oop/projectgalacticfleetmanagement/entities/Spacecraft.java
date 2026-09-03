package oop.projectgalacticfleetmanagement.entities;

import java.time.LocalDate;

public class Spacecraft {
    private String name;
    private String classSpaceship;
    private int yearManufacture;
    private double firePower;

    public String toString() {
        return "===SPACESHIP INFORMATION===\n" +
                "Name: " + name + "\n" +
                "Class Spaceship: " + classSpaceship + "\n" +
                "Year of manufacture: " + yearManufacture + "\n" +
                "Fire power: " + firePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassSpaceship() {
        return classSpaceship;
    }

    public void setClassSpaceship(String classSpaceship) {
        this.classSpaceship = classSpaceship;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(int yearManufacture) {
        if (yearManufacture < 1700 || yearManufacture > LocalDate.now().getYear()){
            throw new IllegalArgumentException("Invalid manufacture year: " + yearManufacture);
        }
        this.yearManufacture = yearManufacture;
    }

    public double getFirePower() {
        if (firePower < 0) {
            throw new IllegalArgumentException("Fire power cannot be negative: " + firePower);
        }
        return firePower;
    }

    public void setFirePower(double firePower) {
        this.firePower = firePower;
    }
}
