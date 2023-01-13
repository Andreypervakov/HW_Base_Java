import java.util.Scanner;

public class DecrementsFirstNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numeber:");
        int a = sc.nextInt();
        System.out.println("Enter numeber:");
        int b = sc.nextInt();
        sc.close();

    if (Math.abs(a)  > Math.abs(b)) {
        a = a / 2;
        System.out.println(a);
    }

    if (a == b) {
            System.out.println("a = b");
                    }
    if (a < b){
        System.out.println("a < b");
    }
    }
}

