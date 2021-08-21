import java.util.Scanner;

public class Array2dTask1 {
//    .A[n][n] matrixini n-in istenilen qiymeti
//    ucun asagidaki kimi doldurun.
//            n=4
//            0 0 0 0
//            1 1 1 1
//            2 2 2 2
//            3 3 3 3
//
//    n=5
//            0 0 0 0 0
//            1 1 1 1 1
//            2 2 2 2 2
//            3 3 3 3 3
//            4 4 4 4 4

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Neqederlik 2d array isteyirsiz?: ");
        int numberOfNumbers=scanner.nextInt();
        int [][]numbers=new int[numberOfNumbers][numberOfNumbers];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                numbers[i][j]=i;

            }

        }
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%d ",numbers[i][j]);
            }
            System.out.println();
        }
    }
}
