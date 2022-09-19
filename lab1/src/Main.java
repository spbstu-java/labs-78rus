import java.util.Scanner;

public class Main {

    public static class Hero {
        public void moveing(MoveStrategy move ){
            System.out.println(move.move());
        }
    }

    public static void main(String[] args) {
        System.out.println("Press the number 1,2 or 3 to choose the mode of movement and 4 for exit : ");
        Hero hero = new Hero();


        Scanner sc = new Scanner (System.in);

        while(true) {

            int i = sc.nextInt();
            switch (i) {
                case 1 -> {
                    hero.moveing(new MoveOnHorseStrategy());

                }
                case 2 -> {
                    hero.moveing(new FlyingStrategy());

                }
                case 3 -> {
                    hero.moveing(new FootStrategy());

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


}
