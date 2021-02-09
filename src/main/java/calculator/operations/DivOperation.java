package calculator.operations;

public class DivOperation implements Operation {

    @Override
    public double calculate(double first, double second) {
        return first / second;
    }
}
