import java.util.Scanner;

public class Korobka_2 {
    public static void main(String[] args) {
        System.out.println("Vvedite 6 cufr 4ere3 probel: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int a1 = scan.nextInt();
        int b1 = scan.nextInt();
        int c1 = scan.nextInt();
        int temp;
        if (c > b) {
            temp = b;
            b = c;
            c = temp;
        }
        if (c > a) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }
        if (c1 > b1) {
            temp = b1;
            b1 = c1;
            c1 = temp;
        }
        if (c1 > a1) {
            temp = a1;
            a1 = c1;
            c1 = temp;
        }
        if (b1 > a1) {
            temp = a1;
            a1 = b1;
            b1 = temp;
        }

        if (a == a1 && b == b1 && c == c1) {
            System.out.println("Boxes are equals");
        } else if (a <= a1 && b <= b1 && c <= c1) {
            System.out.println("First box is smaller");
        } else if (a >= a1 && b >= b1 && c >= c1) {
            System.out.println("First box is bigger");
        } else {
            System.out.println("Incomparable");
        }
    }
}

