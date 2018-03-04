import java.util.Scanner;
public class SumNumber {
    public static void main(String[] args) {
        int sum=0,inputNumber,temp;

        System.out.println("input number");
        Scanner in = new Scanner(System.in);

        while (!in.hasNextInt()) {

            System.out.println("input number");
            in=new Scanner(System.in);
        }

        inputNumber=in.nextInt();


        while (inputNumber>0){
            sum+=inputNumber%10;
            inputNumber=inputNumber/10;
        }
        System.out.println("Sum of numbers= "+sum);
    }
}
