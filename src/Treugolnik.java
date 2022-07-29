import java.util.Scanner;

public class Treugolnik {
    public static void main(String[] args) {
        System.out.println("Vvedite tri 4isla 4ere3 probel");
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        if ((A+B>C) && (B+C>A) & (C+A>B)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
