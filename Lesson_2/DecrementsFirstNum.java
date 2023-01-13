import java.util.Scanner;

public class DecrementsFirstNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numeber:");
        int a = sc.nextInt();
        System.out.println("Enter numeber:");
        int b = sc.nextInt();
       // sc.close();

    if (a > b) {
        b = b / 2;
        System.out.println(b);
    }
    if (a == b) {
            System.out.println("a = b");
                    }
    if (a < b){
        System.out.println("a < b");
    }
    }
}

