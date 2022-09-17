public class MoveClasses {
    public static class HeroOnHorse extends Main.Hero {
        public HeroOnHorse(){
            this.moveStrategy = new MoveOnHors();
        }
    }
    public static class HeroOnFoot extends Main.Hero {
        public HeroOnFoot(){
            this.moveStrategy = new MoveOnFoot();
        }
    }

    public static class HeroOnWings extends Main.Hero {
        public HeroOnWings(){
            this.moveStrategy = new MoveOnWings();
        }
    }



    public static class MoveOnHors implements MoveStrategy {
        @Override
        public void move() {
            System.out.println("I'm riding a horse");
        }
    }

    public static class MoveOnWings implements MoveStrategy {
        @Override
        public void move() {
            System.out.println("I'm Flying");
        }
    }

    public static class MoveOnFoot implements MoveStrategy {
        @Override
        public void move() {
            System.out.println("I'm walking");
        }
    }
}
