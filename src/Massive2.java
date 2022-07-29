import java.util.Arrays;

public class Massive2 {
    public static void main(String[] args) {
        int [] a = {-1,2,3,-1,5};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " " );
            
        }
        System.out.println("\nSorted: \n");
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " " );
            
        }

    }
}
