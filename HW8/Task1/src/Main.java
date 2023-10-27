public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
        int[] array = {5, 6, 7, 12, 15, 23, 14, 7, 9, 52 };

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo
        System.out.println("Массив распечатка с конца: ");
        System.out.println(array[9]);
        System.out.println(array[8]);
        System.out.println(array[7]);
        System.out.println(array[6]);
        System.out.println(array[5]);
        System.out.println(array[4]);
        System.out.println(array[3]);
        System.out.println(array[2]);
        System.out.println(array[1]);
        System.out.println(array[0]);

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo

        int left = 0;
        int right = array.length - 1;

        while(left < right){
            int turnover = array[left];
            array[left] = array[right];
            array[right] = turnover;
            left++;
            right--;
        }
        for(int i = 0; i < array.length; i++){
            System.out.println("Перевернутый массив: " + array[i]);
        }
    }
}
