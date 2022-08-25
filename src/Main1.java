public class Main1 {
    public static void main(String[] args) {
        //Вывести на консоль 10 раз фразу hello world
//        for (int i = 0; i == 10; i++) {
//            System.out.println("hello world");
//        }



        //СОздать массив из случ чисел и выеести его элементы в одну строку на консоль
//        int[] numbers = {2,3,4,1};
//        for(int i = 0; i<numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

        //Найти максим число в массиве
//        int[] numbers = {2,3,4,1};
//        int max = numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            if(numbers[i] > max){
//                max = numbers[i]; //4
//            }
//        }
//        System.out.println("max = "+max);

        //Найти минимальный элемент
        int[] numbers = {2,3,4,1};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("min = "+min);


    }
}
