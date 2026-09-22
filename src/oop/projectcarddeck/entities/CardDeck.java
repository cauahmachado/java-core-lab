package oop.projectcarddeck.entities;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class CardDeck {
    private List<Card> cards = new ArrayList<>();

    public CardDeck() {
        for (Naipe naipe : Naipe.values()) {
            for (Value value : Value.values()) {
                Card card = new Card(value, naipe);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void showOff() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public Card mostValueCard(Card card1, Card card2) {
        if (card1.getValue() == card2.getValue()) {
            if (card1.getNaipe().ordinal() > card2.getNaipe().ordinal()) {
                return card1;
            } else {
                return card2;
            }
        } else {
            if (card1.getValue().ordinal() > card2.getValue().ordinal()) {
                return card1;
            } else {
                return card2;
            }
        }
    }

    public Card dealCard(){
        Card removedCard = cards.getFirst();
        cards.removeFirst();
        return removedCard;
    }


}

