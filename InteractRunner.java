

import java.util.Scanner;

/**
 * Created by Homesys on 26.06.2015.
 */
public class InteractRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calc = new Calculator();
        String exit = "no";
		String clear = "no";
		String choose = "0";
        while(!exit.equals("yes")) {
            System.out.println("Enter your first arg");
            String first = scanner.next();
            System.out.println("Enter your second arg");
            String second = scanner.next();
			System.out.println("What do you want to do with this");
			System.out.println("1 - summ ");
			System.out.println("2 - minus ");
			System.out.println("3 - decart ");
			System.out.println("4 - devision ");
			System.out.println("5 - pow ");
			choose = scanner.next();
						
									if(choose.equals("1")){
            calc.addSumm(Integer.valueOf(first), Integer.valueOf(second));
			}
			
							if(choose.equals("2")){
            calc.addMinus(Integer.valueOf(first), Integer.valueOf(second));
			}
			
										if(choose.equals("3")){
            calc.addDecart(Integer.valueOf(first), Integer.valueOf(second));
			}
			
										if(choose.equals("4")){
            calc.addDevision(Integer.valueOf(first), Integer.valueOf(second));
			}
			
													if(choose.equals("5")){
            calc.addPow(Integer.valueOf(first), Integer.valueOf(second));
			}
			
			System.out.println("results: " + calc.getResult());

			System.out.println("Clear result yes/no ?");
			clear = scanner.next();
			if(clear.equals("yes")){
			calc.clearResult();	
			System.out.println("Result is cleaned");
			}
            System.out.println("Exit yes/no ?");
            exit = scanner.next();
        }
    }
}
