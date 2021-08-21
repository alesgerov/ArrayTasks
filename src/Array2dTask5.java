import java.util.Scanner;

public class Array2dTask5 {
//    A[n][n] matrixini n-in istenilen qiymeti
//    ucun asagidaki kimi doldurun.
//
//            n=5
//            1 2 3 4 5
//            10 9 8 7 6
//            11 12 13 14 15
//            20 19 18 17 16
//            21 22 23 24 25

    public static void main(String[] args) {
        int inputNumber;
        Scanner scanner=new Scanner(System.in);
        inputNumber=scanner.nextInt();
        int [][] numbers=new int[inputNumber][inputNumber];
        int helperNumber=1;

        for (int i = 0; i <numbers.length; i++) {
            if (i%2==0) {
                for (int j = 0; j < numbers[i].length; j++) {
                    numbers[i][j] = helperNumber;
                    helperNumber++;
                }
            }else {
                for (int j = numbers[i].length-1 ; j >=0; j--) {
                    numbers[i][j] = helperNumber;
                    helperNumber++;
                }
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
