package calculator.operations;

public class DivideOperation implements Operation {

    @Override
    public double calculate(double first, double second) {
        return first / second;
    }
}
