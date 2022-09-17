import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Press the number 1,2 or 3 to choose the mode of movement and 4 for exit : ");
        Hero hero = new MoveClasses.HeroOnFoot();
        Hero hero1 = new MoveClasses.HeroOnHorse();
        Hero hero2 = new MoveClasses.HeroOnWings();

        Scanner sc = new Scanner (System.in);

        while(true) {

            int i = sc.nextInt();
            switch (i) {
                case 1 -> {
                    hero.move();

                }
                case 2 -> {
                    hero1.move();

                }
                case 3 -> {
                    hero2.move();

                }
                case 4 -> {
                    System.out.println("Exit from the loop");
                    System.exit(0); //Terminates jvm
                }
                default -> {
                    System.out.println("Сhoose another number.");

                }
            }
        }
    }

    public static class Hero {
        MoveStrategy moveStrategy;

        public  void move(){

            moveStrategy.move();
        }

    }
}
