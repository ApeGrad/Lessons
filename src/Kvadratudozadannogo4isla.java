import java.util.Scanner;

public class Kvadratudozadannogo4isla {
    public static void main(String[] args) {
        test();
    }

    static void test() {
        System.out.println("Vvedite lyboe 4islo i mu vivedem maximalnie stepeni do nego");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int j;
        for (int i = 1; i < a; i++) {
            j = i * i;
            if (j >= a) {
                return;
            }
            System.out.println(j);
        }
    }
}








