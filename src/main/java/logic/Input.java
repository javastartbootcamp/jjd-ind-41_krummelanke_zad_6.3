package logic;

import java.util.Scanner;

public class Input {
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 100;

    public int declareRows() {
        System.out.println("Podaj liczbę wierszy: ");
        int rowsNumber = checkNumber();
        return rowsNumber;
    }

    public int declareColumns() {
        System.out.println("Podaj liczbę kolumn: ");
        int columnsNumber = checkNumber();
        return columnsNumber;
    }

    private int checkNumber() {
        int number;
        Scanner reader = new Scanner(System.in);
        do {
            number = reader.nextInt();
        } while (!isCorrect(number));
        return number;
    }

    private  boolean isCorrect(int number) {
        if (number > MAX_NUM) {
            System.out.println("Podana liczba jest za duża. Spróbuj ponownie:");
            return false;
        }

        if (number < MIN_NUM) {
            System.out.println("Podana liczba jest za mała. Spróbuj ponownie:");
            return false;
        }
        return true;
    }
}
