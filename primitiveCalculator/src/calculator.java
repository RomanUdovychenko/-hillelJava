import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        double sum, difference, multiplication, division;

        Scanner in = new Scanner(System.in);

        double num1 = inputNumber(in, "Please input first number");

        in = new Scanner(System.in);
        double num2 = inputNumber(in, "Please input second number");

        System.out.println("check operator(+,-,*,/)");
        in = new Scanner(System.in);
        String operation = in.nextLine();

        switch (operation) {
            case "+":
                sum = num1 + num2;
                System.out.println("sum=" + sum);
                break;


            case "-":
                difference = num1 - num2;
                System.out.println("difference=" + difference);
                break;
            case "*":
                multiplication = num1 * num2;
                System.out.println("multiplication=" + multiplication);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("delit' na 0 nel'za");
                } else {
                    division = num1 / num2;
                    System.out.println("division=" + division);
                }
                break;

            default:
                System.out.println("Operation not found:" + operation);
        }

    }
    public static double inputNumber(Scanner scanner, String string) {
        double result = 0;

        do{
            System.out.println(string);
            scanner=new Scanner(System.in);
        }while (!(scanner.hasNextDouble()));

        result=scanner.nextDouble();
        return result;
    }

}






