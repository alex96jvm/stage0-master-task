package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {

        int result = 1;

        if (power < 0) {
            System.out.println("Negative power of number are not supported");
            return;
        }

        for (int i = 0; i < power; i++){
            result *= numberToPrint;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
