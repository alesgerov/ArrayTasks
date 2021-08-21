import java.util.Scanner;

public class Array2dTask9 {
//    A[n][n] matrixini n-in istenilen qiymeti
//    ucun asagidaki kimi doldurun.
//
//            n=5
//
//            1 3 6 10 15
//            2 5 9 14 19
//            4 8 13 18 22
//            7 12 17 21 24
//            11 16 20 23 25


    public static void main(String[] args) {
        int inputNumber;
        Scanner scanner=new Scanner(System.in);
        inputNumber=scanner.nextInt();
        int [][] numbers=new int[inputNumber][inputNumber];
        int helperNumber=1;
        boolean flag=true;

        int index=0;
        int indexJ=0;
        int count=0;

        for (int i = 0; i < numbers.length; i++) {
            index=i;

            for (int j = indexJ; j <= i; j++) {
                numbers[index][j]=helperNumber;
                index--;

                helperNumber++;
            }

        }

        for (int i = 0; i <numbers.length ; i++) {
            index=numbers.length-1;
            indexJ++;
            for (int j = indexJ; j <numbers.length ; j++) {
                numbers[index][j]=helperNumber;
                index--;

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
