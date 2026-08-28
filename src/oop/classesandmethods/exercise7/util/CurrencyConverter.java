package oop.classesandmethods.exercise7.util;

public class CurrencyConverter {

    public static final double IOF = 0.06; // 6% tax

    public static double converter(double amount, double dollarPrice) {
        return amount * dollarPrice * (1.0 + IOF);
    }
}