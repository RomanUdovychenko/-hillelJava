import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number1=inputNumber(scanner,"input first number");

        double number2=inputNumber(scanner,"input second number");

        double average;
        average=(number1+number2)/2;
        System.out.println("Average 2 number is:"+average);

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
