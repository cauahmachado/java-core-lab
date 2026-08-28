package oop.classesandmethods.exercise5.entities;

public class Student {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calculateFinalGrade(){
        return nota1+nota2+nota3 ;
    }

    public double missingPoints(){
        if (calculateFinalGrade() < 60.0){
            return 60.0 - calculateFinalGrade();
        }
        else {
            return 0.0;
        }
    }
}
