import java.util.Scanner;

public class Array2dTask10 {
//    A[n][n] matrixini n-in istenilen qiymeti
//    ucun asagidaki kimi doldurun. n ancaq tek
//    eded ola biler.
//
//    n=5
//
//            3 3 3 3 3
//            3 2 2 2 3
//            3 2 1 2 3
//            3 2 2 2 3
//            3 3 3 3 3


    public static void main(String[] args) {
        int inputNumber;
        Scanner scanner=new Scanner(System.in);
        inputNumber=scanner.nextInt();
        int [][] numbers=new int[inputNumber][inputNumber];
        int helperNumber=inputNumber-2;
        int index=0;
        int indexJ=numbers.length-1;


        for (int i = 0; i <numbers.length ; i++) {

            for (int j = index; j <=indexJ ; j++) {
                numbers[i][j]=helperNumber;//ust hisse
                numbers[j][indexJ]=helperNumber;//sag hisse
                numbers[indexJ][j]=helperNumber;//alt hisse
                numbers[j][index]=helperNumber;//sol hisse
            }
            index++;
            helperNumber--;
            indexJ--;

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
