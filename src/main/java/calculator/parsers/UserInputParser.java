package calculator.parsers;

import calculator.CalculationOperations;
import calculator.exceptions.ErrorInputException;

public class UserInputParser implements InputParser{
    public static void parseExpression(String input) {

        try {
            String[] expression = input.split(" ");
            if (expression.length != 3) {
                throw new ErrorInputException("Wrong Input!!!");
            }
            CalculationOperations calculationOperations = new CalculationOperations();
            System.out.println(calculationOperations.calculate(Double.parseDouble(expression[0]), expression[1], Double.parseDouble(expression[2])));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
