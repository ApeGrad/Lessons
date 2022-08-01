package Lesson3;

import java.util.Scanner;

public class Test {
    int start = 1;
    int off = 2;
    int fly = 3;
    int land = 4;
    int extremeLand = 5;
    final int optimalHeight = 15;
    Scanner scan = new Scanner(System.in);

    void Begin() {
        int begin = scan.nextInt();
        if (begin == start) {
            System.out.println("Заводим самолет");
            goUP();
        } else {
            System.out.println("Вы еще не заввели самолет");
        }
    }

    void goUP() {
        int up = scan.nextInt();
        int upSum = 0;
            if (up != off) {
                System.out.println("Вы уже завелись, но не взлетели");
                goUP();
            }
            if (up == off) {
                System.out.println("Взлетаем");
                for (int i = 4; i < optimalHeight; i++) {
                    upSum += i;
                    int up1 = scan.nextInt();
                    System.out.println("Взлетаем");
                    if (upSum == optimalHeight) {
                        System.out.println();
                        System.out.println("Мы набрали необходимую высоту");
                        System.out.println();
                        goFly();
                        break;
                    }
                }

            }
        }

    void goFly() {
        System.out.println("Летим");
        int flee = scan.nextInt();
        if (flee == fly) {
            goFly();

        } else if (flee == land) {
            goLand();

        } else if (flee == extremeLand) {
            goExtremeLand();
        } else {
            System.out.println("Вы уже завелись и взлетели");
            goFly();
        }

    }

    void goLand() {
        System.out.println("Совершаем посадку, пристегните ремни");
        int landSum = 0;
        int lando = scan.nextInt();
        if (lando == land) {
            System.out.println("Садимся");
            for (int i = 4; i < optimalHeight; i++) {
                landSum += i;
                int lando1 = scan.nextInt();
                System.out.println("Садимся");
                if (landSum == optimalHeight) {
                    Finish();
                    break;

                }
            }
        }
            }


            void goExtremeLand () {
                System.out.println("Совершаем экстренную посадку");

            }
            void Finish () {
                System.out.println();
                System.out.println("Спасибо , что были с нами, покиньте ваши сидения");

            }
        }





