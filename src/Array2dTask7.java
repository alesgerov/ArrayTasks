import java.util.Scanner;

public class Array2dTask7 {
//    A[n][n] matrixini n-in istenilen qiymeti
//    ucun asagidaki kimi doldurun.
//
//            n=5
//            1 2 3 4 5
//            16 6 7 8 9
//            17 18 10 11 12
//            19 20 21 13 14
//            22 23 24 25 15


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

        }
        for (int i = 1; i <numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                numbers[i][j]=helperNumber;
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
