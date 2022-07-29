import java.util.Scanner;

public class Method {
    static final String USER1_LOGIN = "user1";
    static final String USER2_LOGIN = "user2";
    static final String USER3_LOGIN = "user3";
    static final String USER1_PASS = "pass1";
    static final String USER2_PASS = "pass2";
    static final String USER3_PASS = "pass3";

    public static void main(String[] args) {
        login();

    }


    public static void login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Login");
        String login = scan.nextLine();

        while (true) {
            switch (login) {
                case USER1_LOGIN:
                    checkPass(USER1_PASS);
                    return;
                case USER2_LOGIN:
                    checkPass(USER2_PASS);
                    return;
                case USER3_LOGIN:
                    checkPass(USER3_PASS);
                    return;
                default:
                    System.out.println("Wrong pass");
            }
        }
    }

    private static void checkPass(String correctPass) {
        System.out.println("Password");
        Scanner scan = new Scanner(System.in);
        String pass = scan.nextLine();
        while (true) {
            if (pass.equals(correctPass)) {
                System.out.println("Maladec");
                return;
            } else {
                System.out.println("RETRY");
                System.out.println("Password");
                pass = scan.nextLine();
            }


        }

    }
}