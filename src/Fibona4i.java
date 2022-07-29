import java.util.Scanner;

public class Fibona4i {
    public static void main(String[] args) {
        System.out.println("Vvedite 4islo");
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        long f = 1;
        long n = 1;
        long sum = 0;
        int max = 1836311903;
        for (long i = 0; i < 200; i++) {
            sum = f + n;
            f = n;
            n = sum;
            if (n == num) {
                System.out.println(num + "   " + (i + 2));
                return;
            }
            if (sum > num) {
                System.out.println("-1");
                return;
            }


        }


    }
}
