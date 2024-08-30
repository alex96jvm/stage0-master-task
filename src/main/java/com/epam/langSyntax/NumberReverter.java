package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int revertedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            revertedNumber = revertedNumber * 10 + digit;
            number /= 10;
        }
        System.out.println(revertedNumber);
    }
}