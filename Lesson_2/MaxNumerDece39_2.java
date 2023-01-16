public class MaxNumerDece39_2 {
    public static void main(String[] args) {

        int i = 5000;
        do {
            System.out.println(i);
            i--;
            {
                if (i % 39 == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
        while (i > 1);
    }
}  
