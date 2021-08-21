//N elementli(int) massiv verilib.
//        Qiymetlerini 0-20 araliginda random qiymetlerle doldurun.
//        Bu massivde olan butun 0-lari massivin sonuna yigin, 0-dan
//        boyuk olan elementlerin sirasini qorumaq sherti ile.
//

import java.util.Random;

public class ArrayTask1 {
    public static int temp=0;
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ",numbers[i]);
        }
        System.out.println();
        for (int m = 0; m < numbers.length; m++) {
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i-1]==0){
                    temp=numbers[i-1];
                    numbers[i-1]=numbers[i];
                    numbers[i]=temp;
                }

            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ",numbers[i]);
        }
        System.out.println();



    }
}
