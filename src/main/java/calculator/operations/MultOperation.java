package calculator.operations;

public class MultOperation implements Operation {

    @Override
    public double calculate(double first, double second) {
        return first * second;
    }
}
