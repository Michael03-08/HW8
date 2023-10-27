import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут

        float[] weight = new float[10];

        int min = 40;
        int max = 100;
        float count = 0;
        int min1 = 60;
        int max1 = 80;

        Random random = new Random();
        for (int i = 0; i < weight.length; i++){
            weight[i] = random.nextFloat(max - min + 1) + min;
        }
        for (int i = 0; i < weight.length; i++){
            System.out.println(weight[i]);
        }

        float sum = 0;
        for (int i = 0; i < weight.length; i++){
            sum += weight[i];
        }
        System.out.println("Средний вес: " + sum / weight.length);


        for (float num : weight){
            if (num >= min1 && num <= max1){
                count++;
            }
        }

        System.out.println("Количество людей с ввесом в диапвзоне от 60 до 80 кг: " + count);
    }
}
