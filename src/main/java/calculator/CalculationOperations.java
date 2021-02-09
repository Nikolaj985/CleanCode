package calculator;

import calculator.exceptions.ErrorInputException;

public class CalculationOperations implements Calculations {
    final private String ADDITION = "+";
    final private String SUBTRACTION = "-";
    final private String MULTIPLY = "*";
    final private String DIVISION = "/";

    public double calculate( double firstNumber, String operation, double secondNumber) {


        switch (operation) {
            case ADDITION:
                return addNumbers(firstNumber, secondNumber);
            case SUBTRACTION:
                return subNumbers(firstNumber, secondNumber);
            case MULTIPLY:
                return multiplyNumbers(firstNumber, secondNumber);
            case DIVISION:
                return divideNumbers(firstNumber, secondNumber);
        }
        throw new ErrorInputException("Wrong Inputs!");
    }

    private double addNumbers(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    private double subNumbers(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    private double multiplyNumbers(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    private double divideNumbers(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}
