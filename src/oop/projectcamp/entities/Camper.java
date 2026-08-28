package oop.projectcamp.entities;

public class Camper {

    private String name;
    private Team team;
    private int age;

    public Camper(String name, int age) {
        this.name = name;
        if (age < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa: " + age);
        }
        this.age = age;
    }
    public enum Team{
        A, B, C, NA
    }

    public void separateGroup(){
        if (getAge() < 6){
            team = Team.NA;
        } else if (getAge() < 11) {
            team = Team.A;
        }else if (getAge() < 21){
            team = Team.B;
        }else{
            team = Team.C;
        }
    }

    @Override
    public String toString() {
        return "CamperService{" +
                "name='" + name + '\'' +
                ", team=" + team +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public Team getTeam() {
        return team;
    }

    public int getAge() {
        return age;
    }
}
