import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_height = inputNumber(scanner, "input Height");
        int input_width = inputNumber(scanner, "input Width");

        int[][] graphics = new int[input_height][input_width];
        clearMas(graphics, input_height, input_width);
        showMas(graphics, input_height, input_width);
        System.out.println();

        //          rectangle
        rectangle(graphics, input_height, input_width);
        showMas(graphics, input_height, input_width);
        clearMas(graphics, input_height, input_width);
        System.out.println();

        //chess order

        chessOrder(graphics, input_height, input_width);
        showMas(graphics, input_height, input_width);
        clearMas(graphics, input_height, input_width);
        System.out.println();

        //envelope

        envelope(graphics, input_height, input_width);
        showMas(graphics, input_height, input_width);


    }

    public static int[][] envelope(int[][] mas, int h, int w) {
        if (h == w) {
            rectangle(mas, h, w);
            for (int i = 0; i < h; i++) {
                mas[i][i] = 1;
            }
            for (int i = 0, j = (h - 1); j > 0; j--, i++) {
                mas[i][j] = 1;
            }
        }else{
            System.out.println("envelope error");
        }

        return mas;
    }

    public static int[][] chessOrder(int[][] mas, int h, int w) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {

            if((i+j)%2==0){
                mas[i][j]=1;
            }

            }
        }
        return mas;
    }

    public static int[][] rectangle(int[][] mas, int h, int w) {

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 || i == (h - 1)) {
                    mas[i][j] = 1;
                }
                if (j == 0 || j == (w - 1)) {
                    mas[i][j] = 1;
                }
            }
        }

        return mas;
    }

    public static void showMas(int[][] mas, int h, int w) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] clearMas(int[][] mas, int height, int weight) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                mas[i][j] = 0;
            }
        }
        return mas;
    }

    public static int inputNumber(Scanner scanner, String string) {
        int result;
        do {
            System.out.println(string);
            scanner = new Scanner(System.in);
        } while (!scanner.hasNextInt());
        result = scanner.nextInt();
        return result;
    }
}
