package oop.projectcarddeck.app;

import oop.projectcarddeck.entities.Card;
import oop.projectcarddeck.entities.CardDeck;

public class CardDeckTest {
    public static void main(String[] args) {
        CardDeck baralho = new CardDeck();
        baralho.showOff();
        System.out.println("================ embaralhado ============");
        baralho.shuffle();
        baralho.showOff();
        Card carta1 = baralho.dealCard();
        Card carta2 = baralho.dealCard();
        System.out.println("============= cartas retridas ============");
        System.out.println(carta1);
        System.out.println(carta2);
        System.out.println("======= Maior das duas cartas ============");
        System.out.println(baralho.mostValueCard(carta1, carta2));
    }
}
