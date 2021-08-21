import java.util.Scanner;

public class ArrayTask2 {
//
//    N elementli(int) massiv verilib.
//    N ve massivin elementlerini istifade daxil etmelidir.
//    Bu massivde butun liderleri tapib print edin.
//    Lider o edede deyilir ki, ozunden sagdaki butun ededlerden boyukdur



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nece eded olsun?: ");
        int numberOfNumbers=scanner.nextInt();
        boolean flag=false;
        boolean flagForPrint=false;
        int []numbers=new int[numberOfNumbers];
        int leaderNumber=numbers[0];
        for (int i = 0; i < numberOfNumbers; i++) {
            numbers[i]=scanner.nextInt();
        }

        for (int i = 0; i < numberOfNumbers-1; i++) {
            for (int j = i+1; j < numberOfNumbers; j++) {
                if (numbers[i]>=numbers[j]){
                    leaderNumber=numbers[i];
                    flag=true;
                }else {
                    flag=false;
                    i++;
                }
            }
            if (flag) {
                flagForPrint=true;
                System.out.println(leaderNumber);
            }

        }
        if (!flagForPrint){
            System.out.println("tapilmadi");
        }
    }
}
