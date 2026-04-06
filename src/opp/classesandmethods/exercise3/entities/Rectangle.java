package opp.classesandmethods.exercise3.entities;

public class Rectangle {
    public double width;
    public double height;

    public double calculateArea(){
        return width * height;
    }

    public double calculatePerimeter(){
        return (2*width)+(2*height);
    }

    public double calculateDiagonal(){
        return Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
    }

    @Override
    public String toString() {
        return "AREA = " + String.format("%.2f",calculateArea() ) + "\nPERIMETER = " + String.format("%.2f", calculatePerimeter()) + "\nDIAGONAL = " + String.format("%.2f",calculateDiagonal() );
    }
}
