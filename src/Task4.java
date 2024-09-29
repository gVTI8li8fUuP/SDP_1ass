public class Task4 {
    public interface Worker {
        void work();
        void eat();
    }
    public interface Workable {
        void work();
    }

    public interface Eatable {
        void eat();
    }
    public class HumanWorker implements Workable, Eatable {

        public void work() {
            System.out.println("Human is working.");
        }


        public void eat() {
            System.out.println("Human is eating.");
        }
    }

    public class RobotWorker implements Workable {

        public void work() {
            System.out.println("Robot is working.");
        }
    }
    public class Main {
        public static void main(String[] args) {
            Workable humanWorker = new HumanWorker();
            Workable robotWorker = new RobotWorker();

            humanWorker.work();
            ((Eatable) humanWorker).eat();

            robotWorker.work();
        }
    }

}
