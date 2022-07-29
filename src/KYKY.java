import java.text.DecimalFormat;
import java.util.Scanner;

public class KYKY {
    public static void main(String[] args) {
//        System.out.println("Vvedite phrase");
        Scanner scan = new Scanner(System.in);
//        String phrase = scan.nextLine();
//        System.out.println("Vu vveli phrase: " + phrase);
//
//
//        System.out.println("Vvedite dva 4isla 4ere3 probel, 4tobu yznat kvadrat ix summy");
//        double number = scan.nextInt();
//        double number2 = scan.nextInt();
//        double sum = number * number + number2 * number2;
//        String sf2 = String.format("Kvadrat summy raven:  %.3f.", sum);
//        System.out.println(sf2);
//
//
//        System.out.println("Vvedite dva 4isla 4ere3 probel, 4tobu slojut' ix");
//        int gavno = scan.nextInt();
//        int gavno2 = scan.nextInt();
//        int sum2 = gavno + gavno2;
//        System.out.println(sum2 + "=" + gavno + "+" + gavno2);
//
//        System.out.println("Vvedite drobnoe 4islo, 4tobu razdelit ego na dve 4asti");
//        double lm = scan.nextDouble();
//        int aq = (int) lm;
//        double d = lm - aq;
//        String sova = String.format("%1$.3f.", d);
//        System.out.println(aq + " , " + sova);


        System.out.println("Vvedite 6ti-zna4noe 4islo: ");
        int ches = scan.nextInt();
        int get = ches / 100000;
        int get2 = (ches / 10000) % 10;
        int get3 = (ches / 1000) % 10;
        int get4 = (ches / 100) % 10;
        int get5 = (ches / 10) % 10;
        int get6 = ches % 10;
        if (get == get6 & get2 == get5 & get3 == get4) {
            System.out.println("Simmetria");
        } else {
            System.out.println("NET");
        }


    }
}