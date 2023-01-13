public class Same_Number {
    public static void main(String[] args) {
        int number = 57;

        int d = number / 10;
        int e = number % 10;

        //int sum = d+e;
        //int mulip = d*e;

        //System.out.println(d);
        //System.out.println(e);
        //System.out.println(sum);
        //System.out.println(mulip);
        //
        //
        System.out.printf("In this number %d - %d tens. \n", number, d);
        System.out.printf("In this number %d - %d ones. \n", number, e);
        System.out.printf("Sum of this number %d - %d. \n", number, d + e);
        System.out.printf("Multiplication of this number %d - %d. \n \n", number, d * e);
    }
}


