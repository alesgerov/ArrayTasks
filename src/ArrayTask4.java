import java.util.Random;
import java.util.Scanner;

public class ArrayTask4 {
//
//    N elementli(int) massiv verilib.
//    Qiymetlerini 0-20 araliginda random qiymetlerle doldurun.
//    Istifadeciden K ededini sorusun.
//    Istifadeciden istiqamet sorusun(sol ve ya sag).
//    Istiqamet = sag olsa, massivin elementlerini K defe saat eqrebi istiqametinde surusdurun.
//        Istiqamet = sol olsa, massivin elementlerini K defe saat eqrebinin eksi istiqametinde surusdurun.

    public static int temp=0;
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner=new Scanner(System.in);
        String turn;
        int swipeNum;
        int[] numbers = new int[7];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20);
        }

        System.out.println("Ilk hali: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();
        System.out.print("Nece donsun?(sag,sol): ");
        turn=scanner.nextLine();
        System.out.print("Nece defe donsun?: ");
        swipeNum=scanner.nextInt();

        if (turn.equals("sag")){
            rightSwiper(numbers,swipeNum);
        }else if (turn.equals("sol")){
            leftSwiper(numbers,swipeNum);
        }else {
            System.out.println("yanlis secim: ");
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();


    }
    public static void leftSwiper(int []numbers,int swipeNum){

        for (int j = 0; j < swipeNum; j++) {
            for (int i = 1; i < numbers.length; i++) {
                temp=numbers[i-1];
                numbers[i-1]=numbers[i];
                numbers[i]=temp;

            }
        }
    }
    public static void rightSwiper(int []numbers,int swipeNum){

        for (int j = 0; j < swipeNum; j++) {
            for (int i = numbers.length-1; i > 0; i--) {
                temp=numbers[i];
                numbers[i]=numbers[i-1];
                numbers[i-1]=temp;

            }
        }
    }
}
