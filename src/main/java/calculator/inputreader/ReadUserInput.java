package calculator.inputreader;

import calculator.CalculationOperations;
import calculator.Calculator;
import calculator.exceptions.ErrorInputException;

import java.util.Scanner;

public class ReadUserInput implements UserInputReader {




    public static String readInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print(">");
        String input = sc.nextLine().trim();
        //sc.close();
        return input;
    }
}
