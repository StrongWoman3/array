package Lessons;

public class Main3 {
    public static void main(String[] args) {
        //Вывести фразу hello world 10 раз
//        int i = 0;
//        while(i<10) {
//            System.out.println(i+" hello world");
//            i++;
//        }

//        for(int i = 0; i<10; i++) {
//            System.out.println(i+" hello world");
//        }




        //Персонаж юзера должен сделать 5 шагов, причем после каждого шага персонаж должен прыгнуть 3 раза
        for (int i = 0; i < 5; i++) {
            System.out.println(i +" step");
            for (int j = 0; j < 3; j++){
                System.out.println("jump");
            }

        }


    }
}
