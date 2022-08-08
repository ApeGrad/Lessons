package Lesson3;

public class Airplane {
    public static void main(String[] args) {
        System.out.println("Заведите ваш самолет. 1 - завести, 2- взлететь, 3-лететь, 4-посадить самолет, 5-экстренная посадка");
        System.out.println("Чтобы набрать необходимую для полета высоту - жмите клавишу 2");
        System.out.println("Чтобы снизиться - жмите клавишу 4");
        System.out.println("Экстренную посадку вы можете осуществить на любой высоте нажав клавишу 5");
        System.out.println("Для совершения посадки миниммальная высота = 1000. Нажмите 6 для совершения посадки.");
        Test air = new Test();
        air.Begin();
        air.Finish();

        }

    }

