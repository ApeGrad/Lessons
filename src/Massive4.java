import java.util.Scanner;

public class Massive4 {
    public static void main(String[] args) {
        System.out.println("Vvedite razmer massiva");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int a[] = new int[size];
        System.out.println("Vvedite 4isla");
        for (int i = 0; i < size; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 1; i < size; i++) {
           if (a[i]>0 && a[i-1]>0 || a[i] < 0 && a[i-1] <0){
               if(a[i] > a[i-1]) {
                   System.out.println(a[i - 1] + " " + a[i]);
                   break;
               }
               else {
                   System.out.println(a[i] + " " + a[i-1]);
                   break;
               }
           }
        }
    }
}
