import java.util.Scanner;

public class Imya {
    public static void main(String[] args) {
        System.out.println("Vvedi imya");
        Scanner scan = new Scanner(System.in);
        while (true) {
            String name = scan.nextLine();
            if (!name.equals("Imya")) {
                System.out.println("Ewe raz");}
                if (name.equals("Imya")) {
                    System.out.println("Molodec");
                    break;
                }
            }
        }
    }

