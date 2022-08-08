package Lesson3;

import java.util.Scanner;
//Задать переменную с высотой, сделать метод посадки в котором будет указываться минимальная дял посадки высота,
//сделать так, чтобы цикл запоминал высоту на которой ты остановился, чтобы не начинать набирать или снижать высоту
//с нуля или с максимальной высоты. Начиная со второго шага в цикле ты можешь либо начать садить самолет, либо
//поднимать. Не зацикливайся на конечной высоте для посадки.

public class Test {
    int toStart = 1;
    int goUp = 2;
    int flying = 3;
    int goDown = 4;
    int landing = 6;
    int extremeLand = 5;
    int currentHeight = 0;
    Scanner scan = new Scanner(System.in);

    void Begin() {
        int begin = scan.nextInt();
        if (begin == toStart) {
            System.out.println("Заводим самолет");
            goUP();
        } else {
            System.out.println("Вы еще не завели самолет");
            Begin();
        }
    }

    void goUP() {
        int up = scan.nextInt();
        if (up != goUp) {
            System.out.println("Вы уже завелись, но не взлетели");
            goUP();
        }
        if (up == goUp) {
            System.out.println("Взлетаем. Жмите 2 для поднятия высоты, 4 для снижения, 5 для экстренной посадки");
            System.out.println("Необходимая высота для стабильного полета = 6000. Нажмите 3 для стаб.полета.");
            System.out.println("Минимальная для посадки высота = 1000. Нажмите 6, если хотите сесть");
            for (int i = 0; i < 100; i++) {
                System.out.println();
                System.out.println("Текущая высота" + " " + currentHeight + " " + "M");
                int up1 = scan.nextInt();
                if (up1 == goUp && currentHeight < 6000) {
                    currentHeight += 1000;
                }
                if (up1 == flying) {
                    if (currentHeight == 6000) {
                        System.out.println("Переходим в режим стабильного полета");
                        goFly();
                        break;
                    } else {
                        System.out.println("Неверная высота для стабильного полета");
                    }
                }
                if (up1 == goDown) {
                    if (currentHeight < 1000)
                        System.out.println("Вы еще не взлетели");
                }
                if (up1 == goDown)
                    if (currentHeight > 1000) {
                        currentHeight -= 1000;

                    }

                if (up1 == landing) {
                    if (currentHeight == 1000) {
                        goLand();
                        break;
                    } else {
                        System.out.println("Неможем своеришть посадку,неверная высота");
                    }
                }
                if (up1 == extremeLand) {
                    goExtremeLand();
                    break;
                }
            }

        }
    }

    void goFly() {
        System.out.println();
        System.out.println("Режим стабильного полета");
        System.out.println();
        //System.out.println("Если дальше хотите в нем находится нажмите 3");
        //System.out.println("Если хотите совершить посадку нажмите 4");
        //System.out.println("Если хотите совершить экстренную посадку нажмите 5");
        int flee = scan.nextInt();
        if (flee == flying) {
            //System.out.println("Letim");
            goFly();

        } else if (flee == goDown) {
            goLand();

        } else if (flee == extremeLand) {
            goExtremeLand();
        } else {
            System.out.println();
            System.out.println("Неверная команда");
            goFly();
        }

    }

    void goLand() {
        System.out.println();
        System.out.println("Совершаем посадку, пристегните ремни. Жмите 4 для окончательной посадки.");
        int lando = scan.nextInt();
        if (lando == goDown) {
            System.out.println("Садимся с высоты" + " " + currentHeight + " " + "M");
            for (int i = 0; i < 100; i++) {
                int lando1 = scan.nextInt();
                if (lando1 == goDown) {
                    currentHeight -= 1000;
                    System.out.println("Текущая высота" + " " + currentHeight + " " + "M");
                } else {
                    System.out.println("Неверная  команда");
                }

                if (lando1 == extremeLand) {
                    goExtremeLand();
                    break;
                }
                //System.out.println("Текущая высота" + " " + currentHeight + " " + "M");
                if (currentHeight == 0) {
                    System.out.println();
                    System.out.println("Мы сели  на оптимальную для высадки высоту");
                    break;
                }

            }

        } else {
            System.out.println("Неверная команда");
            goLand();
        }
    }


    void goExtremeLand() {
        System.out.println("Совершаем экстренную посадку");


    }

    void Finish() {
        System.out.println();
        System.out.println("Спасибо , что были с нами, покиньте ваши сидения");

    }


}








