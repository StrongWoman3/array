import java.util.Arrays;
import java.util.Scanner;

public class lesson1 {
    private static int[] numbersSum(int[] number, int a) {
        System.out.println(Arrays.toString(number));
        for (int i = 0; i < number.length; i++) {
            for (int b = i + 1; b < number.length; b++) {
                if (number[i] + number[b] == a) {
                    return new int[]{i, b};
                }
            }
        }
        return new int[]{};
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите  кол-во элементов");

        int a = scanner.nextInt();
        int[] number = new int[a];
        for (int i = 0; i < a; i++) {
            number[i] = scanner.nextInt();
        }
        System.out.println("Введите  число");

        int num = scanner.nextInt();
        scanner.close();

        int[] index = numbersSum(number, num);
        if (index.length == 2) {
            System.out.println(index[0] + ", " + index[1]);

        } else {
            System.out.println("Введено не 2 числа");
        }
    }
}


