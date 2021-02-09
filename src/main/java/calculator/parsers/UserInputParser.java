package calculator.parsers;

import calculator.exceptions.ErrorInputException;
import org.apache.commons.lang3.StringUtils;

public class UserInputParser implements InputParser {
    final private String ADDITION = "+";
    final private String SUBTRACTION = "-";
    final private String MULTIPLY = "*";
    final private String DIVISION = "/";

    public String[] parseExpression(String input) {
        if (!StringUtils.isNotBlank(input) || !StringUtils.isNotEmpty(input)) {
            throw new ErrorInputException("Input can't be empty!");
        }
        String[] expression = checkInputs(input.split(" "));
        return expression;
    }

    public String[] checkInputs(String[] userInput) {


        if (userInput.length != 3) {
            throw new ErrorInputException("Incorrect number of input data!!!");
        }
        try {

            Double.parseDouble(userInput[0]);
            Double.parseDouble(userInput[2]);

        } catch (NumberFormatException nfe) {
            throw new ErrorInputException("Wrong inputs: " + nfe.getMessage());
        }

        return userInput;
    }
}
