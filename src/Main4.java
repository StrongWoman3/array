import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
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
//        int[] number = {3,5,4,2,1};
//        int num = 3;
        //3 5 4 2 1
        //nun = 5
        int[] arr = null;
        System.out.println(Arrays.toString(number));
        //запускакм цикл по массиву
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] + number[j] == num) {
                    arr = new int[]{i, j};
                    break;
                }
            }
            if(arr!=null){
                break;
            }
        }
        if (arr != null) {
            System.out.println(arr[0] + ", " + arr[1]);

        } else {
            System.out.println("Число не найдено");
        }


    }
}
