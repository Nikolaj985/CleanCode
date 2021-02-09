package calculator.operations;

public class MultiplyOperation implements Operation {

    @Override
    public double calculate(double first, double second) {
        return first * second;
    }
}
