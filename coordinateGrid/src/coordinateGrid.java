import java.util.Scanner;
public class coordinateGrid {
    public static void main(String[] args) {
        int xBegin=inputNumber("xBegin=");
        int yBegi=inputNumber("yBegin=");
        int xEnd=inputNumber("xEnd=");
        int yEnd=inputNumber("yEnd=");
        int xInput=inputNumber("xInput=");
        int yInput=inputNumber("yInput=");


        if(xInput>=xBegin&&xInput<=xEnd&&yInput>=yBegi&&yInput<=yEnd){
            System.out.println("xInput and yInput it's true");
        }else {
            System.out.println("xInput and yInput it's false");
        }


    }

    public static int inputNumber(String string){
        System.out.print(string);
        Scanner scanner= new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.print(string);
            scanner=new Scanner(System.in);
        }

        return scanner.nextInt();
    }
}
