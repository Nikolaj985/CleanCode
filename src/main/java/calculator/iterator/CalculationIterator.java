package calculator.iterator;

import calculator.inputreader.ReadUserInput;
import calculator.inputreader.UserInputReader;
import calculator.parsers.UserInputParser;

public class CalculationIterator implements UserInputIterator {
    private boolean iterate = true;

    @Override
    public void startCalculation() {

        while(iterate){
            System.out.println("Enter input:");
            String userInput = ReadUserInput.readInput();
            UserInputParser.parseExpression(userInput);
            iterate = calcAgain();
        }
    }

    public boolean calcAgain(){
        System.out.println("Calculate Again? Yes/No");
        String answer = ReadUserInput.readInput();
        if(answer.equalsIgnoreCase("NO")){
            System.out.println("Bye!");
            return false;
        }
        return true;
    }
}
