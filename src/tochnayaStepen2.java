import java.util.Scanner;

public class tochnayaStepen2 {
    public static void main(String[] args) {
        System.out.println("Vvedite to4nyy stepen 2");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        if (b<=0){
            System.out.println("NO");

        }
        while (b%2==0){
            b=b/2;
        }
        if (b==1){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
