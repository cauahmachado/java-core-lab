package oop.projectcarddeck.entities;

public class Card {
    private Naipe naipe;
    private Value value;


    public Card(Value value, Naipe naipe) {
        this.value = value;
        this.naipe = naipe;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public Value getValue() {
        return value;
    }


    @Override
    public String toString() {
        return value + " de " + naipe;
    }
}
