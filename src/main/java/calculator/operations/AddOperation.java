package calculator.operations;

public class AddOperation implements Operation {
    @Override
    public double calculate(double first, double second) {
        return first + second;
    }
}
