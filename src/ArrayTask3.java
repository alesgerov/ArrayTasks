import java.util.Random;

public class ArrayTask3 {
//    N elementli(int) massiv verilib.
//    Qiymetlerini 0-20 araliginda random qiymetlerle doldurun.
//    Bu massivde olan butun cut ededleri massivin evveline,
//    tek ededleri ise massivin sonuna yigin, elementlerin sirasini qorumaq sherti ile.

    public static int temp=0;
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[15];
        int helperNum=0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ",numbers[i]);
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0){
                for (int j = i; j >helperNum ; j--) {
                    temp=numbers[j-1];
                    numbers[j-1]=numbers[j];
                    numbers[j]=temp;
                }
                helperNum++;
            }
        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ",numbers[i]);
        }
        System.out.println();







    }
}
