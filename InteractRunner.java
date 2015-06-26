package GHHTP1;

import java.util.Scanner;

/**
 * Created by Homesys on 26.06.2015.
 */
public class InteractRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calc = new Calculator();
        String exit = "no";
        while(!exit.equals("yes")) {
            System.out.println("Enter your first arg");
            String first = scanner.next();
            System.out.println("Enter your second arg");
            String second = scanner.next();
            calc.add(Integer.valueOf(first), Integer.valueOf(second));
            System.out.println("results: " + calc.getResult());
            calc.clearResult();
            System.out.println("Exit yes/no ?");
            exit = scanner.next();
        }
    }
}
