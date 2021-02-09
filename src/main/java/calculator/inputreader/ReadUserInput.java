package calculator.inputreader;

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
