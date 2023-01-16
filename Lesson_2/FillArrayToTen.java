import java.util.Scanner;

public class FillArrayToTen {
    public static void main(String[] args) {
        int[] ar = new int[9];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < ar.length; i++)
        {
            System.out.printf("Give a number: \n " );
            ar[i] = sc.nextInt();
            System.out.printf("%d,\n ",ar[i]);

        }

    }
}

