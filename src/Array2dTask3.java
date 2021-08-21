import java.util.Scanner;

public class Array2dTask3 {
//    A[n][n] matrixini n-in istenilen qiymeti
//    ucun asagidaki kimi doldurun.
//
//            n=5
//            25 24 23 22 21
//            20 19 18 17 16
//            15 14 13 12 11
//            10  9  8  7  6
//            5  4  3  2  1


    public static void main(String[] args) {
        int inputNumber;
        Scanner scanner=new Scanner(System.in);
        inputNumber=scanner.nextInt();
        int [][] numbers=new int[inputNumber][inputNumber];
        int helperNumber=1;

        for (int i = numbers.length-1; i >=0; i--) {
            for (int j = numbers[i].length-1; j >=0; j--) {
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
