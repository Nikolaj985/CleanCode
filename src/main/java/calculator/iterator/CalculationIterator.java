package calculator.iterator;

import calculator.exceptions.ErrorInputException;
import calculator.inputreader.ReadUserInput;
import calculator.operations.Operation;
import calculator.operations.OperationFactory;
import calculator.parsers.UserInputParser;

public class CalculationIterator implements Iterator {
    private boolean iterate = true;

    @Override
    public void startCalculation() {

        while (iterate) {
            System.out.println("Enter input:");
            try {
                String userInput = ReadUserInput.readInput();
                UserInputParser userInputParser = new UserInputParser();
                String[] parsedInput = userInputParser.parseExpression(userInput);
                Operation operation = new OperationFactory().getOperation(parsedInput[1]);
                System.out.println(operation.calculate(Double.parseDouble(parsedInput[0]), Double.parseDouble(parsedInput[2])));
            } catch (ErrorInputException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            iterate = calcAgain();
        }
    }

    public boolean calcAgain() {
        System.out.println("Calculate Again? Yes/No");
        String answer = ReadUserInput.readInput();
        if (answer.equalsIgnoreCase("NO")) {
            System.out.println("Bye!");
            return false;
        }
        return true;
    }
}
