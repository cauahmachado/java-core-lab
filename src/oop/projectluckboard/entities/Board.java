package oop.projectluckboard.entities;

import java.util.Random;

public class Board {
    private static final int SIZE = 10;
    private static final int MAX_NUMBER = 100;
    private static final int MIN_HITS_TO_WIN = 3;
    private static final double PRIZE_PER_HIT = 1000.0;

    private final int[][] bodyBoard = new int[SIZE][SIZE];

    public Board() {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bodyBoard[i][j] = random.nextInt(MAX_NUMBER + 1);
            }
        }
    }

    public double play(int firstPrediction, int secondPrediction) {
        validate(firstPrediction);
        validate(secondPrediction);
        if (firstPrediction == secondPrediction) {
            throw new IllegalArgumentException("Os dois palpites devem ser diferentes.");
        }

        int hits1 = countOccurrences(firstPrediction);
        int hits2 = countOccurrences(secondPrediction);

        display(firstPrediction, secondPrediction);
        System.out.printf("O palpite 1 (%d) apareceu %d vez(es).%n", firstPrediction, hits1);
        System.out.printf("O palpite 2 (%d) apareceu %d vez(es).%n", secondPrediction, hits2);

        return calculatePrize(hits1) + calculatePrize(hits2);
    }

    private double calculatePrize(int hits) {
        return hits >= MIN_HITS_TO_WIN ? hits * PRIZE_PER_HIT : 0.0;
    }

    private int countOccurrences(int number) {
        int count = 0;
        for (int[] row : bodyBoard) {
            for (int value : row) {
                if (value == number) count++;
            }
        }
        return count;
    }

    private void validate(int number) {
        if (number < 0 || number > MAX_NUMBER) {
            throw new IllegalArgumentException("O número deve estar entre 0 e " + MAX_NUMBER + ".");
        }
    }

    private void display(int first, int second) {
        for (int[] row : bodyBoard) {
            for (int value : row) {
                String mark = (value == first || value == second) ? "*" : " ";
                System.out.printf("[%3d%s]", value, mark);
            }
            System.out.println();
        }
    }
}