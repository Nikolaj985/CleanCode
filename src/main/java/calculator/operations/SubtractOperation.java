package calculator.operations;

public class SubtractOperation implements Operation {
    @Override
    public double calculate(double first, double second) {
        return first - second;
    }
}
