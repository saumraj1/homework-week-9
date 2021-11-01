package calculate;

import java.util.Scanner;

public class MainQ1 {
    public static void main(String[] args)
    {
        CalculatorQ1 cal = new CalculatorQ1();
        char ch;
        do
        {
            //getting user input using scanner
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first Number : ");
            int a = scanner.nextInt();
            System.out.print("Enter second Number : ");
            int b = scanner.nextInt();

            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter one of symbol +,-,*, / : ");
            String s = sc.nextLine();


            //Convert string to char
            char symbol = s.charAt(0);

            cal.calculateResult(a,b,symbol);
            System.out.print("“Would you like to do more calculation Please enter “Y” or “N” : ");
            String x = sc.nextLine();
            ch = x.charAt(0);
            sc.close();

        }while (ch == 'Y' || ch == 'N');

    }
}
