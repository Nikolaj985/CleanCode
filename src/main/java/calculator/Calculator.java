package calculator;

import calculator.iterator.ConsoleUserInputReader;


/**
 * A bit simplified version than the original
 */
public class Calculator {

    public static void main(String[] args) {

        ConsoleUserInputReader calculationIterator = new ConsoleUserInputReader();
        calculationIterator.startCalculation();
    }
}
