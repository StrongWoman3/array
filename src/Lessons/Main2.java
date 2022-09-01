package Lessons;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //Найти наибольший элемент только среди четных чисел, но заполнять массив нужно с косноли
        int[] arr = new int[5];
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a value: ");
            arr[i] = scn.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        System.out.println("max = "+max);


//        System.out.print("Enter a value: ");
//        arr[0] = scn.nextInt();
//
//        System.out.print("Enter a value: ");
//        arr[1] = scn.nextInt();
//
//        System.out.print("Enter a value: ");
//        arr[2] = scn.nextInt();
//
//        System.out.print("Enter a value: ");
//        arr[3] = scn.nextInt();
//
//        System.out.print("Enter a value: ");
//        arr[4] = scn.nextInt();


    }
}


     class rect {
       int width;
int height;
        void rectangle( int width, int height){
            this.width = width;
            this.height = height;

        }
        int sum (){
            return width*height;
        }

        System.out.print(sum);
    }




