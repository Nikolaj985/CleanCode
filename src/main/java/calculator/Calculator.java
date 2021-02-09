package calculator;

import calculator.inputreader.ReadUserInput;
import calculator.iterator.CalculationIterator;

import java.util.Scanner;

/**
 * A bit simplified version than the original
 */
public class Calculator {


    public static void main(String[] args) {

        CalculationIterator calculationIterator = new CalculationIterator();
        calculationIterator.startCalculation();
    }
}
