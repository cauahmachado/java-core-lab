package oop.classesandmethods.exercise1.entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double calcArea(/*n precisa receber parametros pq ja ira utilizar a, b, c*/){
        double p = (a+b+c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }
}
