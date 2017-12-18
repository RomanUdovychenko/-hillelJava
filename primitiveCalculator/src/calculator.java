import java.util.Scanner;

public class calculator {

    public static void main(String[] args){

        double sum,difference ,multiplication ,division;
        Scanner in = new Scanner(System.in);

        System.out.print("Please input first number: ");
        double num1 =in.nextDouble();

        System.out.print("Please input second number: ");
        double num2 =in.nextDouble();
        sum=num1+num2;
        difference=num1-num2;
        multiplication=num1*num2;
        division=num1/num2;

        System.out.println("sum="+sum);
        System.out.println("difference="+difference);
        System.out.println("multiplication="+multiplication);
        System.out.println("division="+division);

    }
}
