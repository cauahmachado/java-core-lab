package oop.projectvolumesphere.entities;

public class Sphere {
    private double radius;


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateVolume(){
        return (4/3.0) * Math.PI * Math.pow(radius,3);
    }
}
