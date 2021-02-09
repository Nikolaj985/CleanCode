package calculator.operations;

import calculator.exceptions.ErrorInputException;

public class OperationFactory {
    final private String ADDITION = "+";
    final private String SUBTRACTION = "-";
    final private String MULTIPLY = "*";
    final private String DIVISION = "/";

    public Operation getOperation(String operation) {

        switch (operation) {
            case ADDITION:
                return new AddOperation();
            case SUBTRACTION:
                return new SubtractOperation();
            case MULTIPLY:
                return new MultiplyOperation();
            case DIVISION:
                return new DivideOperation();
        }
        throw new ErrorInputException("Wrong operational input");
    }
}
