import java.util.Scanner;

public class posled4isla {
    public static void main(String[] args) {
        System.out.println("VVedite 4 4isla");
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int x = scan.nextInt();
            sum+=x;
            if (x==0){
                System.out.println(sum);
                break;


            }

        }
    }
}
