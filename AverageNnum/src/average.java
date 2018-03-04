import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class average {
    public static void main(String[] args) {
        Scanner scanner;// = new Scanner(System.in);
        String tempEquals = "";
        double sum = 0, tempDoubl;
        List<Double> list = new ArrayList();
        int count = 0;


        do {
            System.out.println("input " + (count + 1) + " number or N to exit");
            scanner = new Scanner(System.in);

            if (scanner.hasNextDouble()) {
                tempDoubl = scanner.nextDouble();
                list.add(tempDoubl);
                count++;
            } else {
                tempEquals = scanner.next();
            }
        } while (!tempEquals.equals("N"));

        int i=0;
        double average;
        for (; i < list.size(); i++) {
            sum+=list.get(i);
        }
        average=sum/i;
        System.out.println("average= "+average);
    }
}
