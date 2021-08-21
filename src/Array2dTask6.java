import java.util.Scanner;

public class Array2dTask6 {
//    A[n][n] matrixini n-in istenilen qiymeti
//    ucun asagidaki kimi doldurun.
//
//            n=5
//            1 10 11 20 21
//            2 9 12 19 22
//            3 8 13 18 23
//            4 7 14 17 24
//            5 6 15 16 25


    public static void main(String[] args) {
        int inputNumber;
        Scanner scanner=new Scanner(System.in);
        inputNumber=scanner.nextInt();
        int [][] numbers=new int[inputNumber][inputNumber];
        int helperNumber=1;

        for (int i = 0; i <numbers.length; i++) {
            if (i%2==0) {
                for (int j = 0; j < numbers[i].length; j++) {
                    numbers[j][i] = helperNumber;
                    helperNumber++;
                }
            }else {
                for (int j = numbers[i].length-1 ; j >=0; j--) {
                    numbers[j][i] = helperNumber;
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
