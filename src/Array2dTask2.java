import java.util.Scanner;

public class Array2dTask2 {
//    A[n][n] matrixini n-in istenilen
//    qiymeti ucun asagidaki kimi doldurun.
//
//            n=5
//            5 4 3 2 1
//            10 9 8 7 6
//            15 14 13 12 11
//            20 19 18 17 16
//            25 24 23 22 21

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Neqederlik 2d array isteyirsiz?: ");
        int numberOfNumbers=scanner.nextInt();
        int [][]numbers=new int[numberOfNumbers][numberOfNumbers];
        int num;
        for (int i = 0; i < numbers.length; i++) {
            num=numbers[i].length*(i+1);
            for (int j = 0; j <numbers[i].length ; j++) {
                numbers[i][j]=num;
                num--;
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
