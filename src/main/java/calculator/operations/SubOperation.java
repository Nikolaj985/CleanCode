package calculator.operations;

public class SubOperation implements Operation {
    @Override
    public double calculate(double first, double second) {
        return first - second;
    }
}
