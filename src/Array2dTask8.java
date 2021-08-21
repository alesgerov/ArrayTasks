import java.util.Scanner;

public class Array2dTask8 {
//    A[n][n] matrixini n-in istenilen qiymeti
//    ucun asagidaki kimi doldurun.
//
//            n=5
//
//            1 2 3 4 5
//            10 6 7 8 9
//            14 15 11 12 13
//            18 19 20 16 17
//            22 23 24 25 21


    public static void main(String[] args) {
        int inputNumber;
        Scanner scanner=new Scanner(System.in);
        inputNumber=scanner.nextInt();
        int [][] numbers=new int[inputNumber][inputNumber];
        int helperNumber=1;


        for (int i = 0; i <numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                numbers[i][j]=helperNumber;
                helperNumber++;
            }
            for (int m = 0; m <i ; m++) {
                numbers[i][m]=helperNumber;
                helperNumber++;
            }

        }

        printer(numbers);

    }
    public static void printer(int[][]numbers){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%d ",numbers[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
