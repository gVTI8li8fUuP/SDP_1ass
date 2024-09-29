public class Task3 {
    public class Bird {
        public void fly() {
            System.out.println("The bird is flying.");
        }
    }
    public class Penguin extends Bird {

        public void fly() {
            throw new UnsupportedOperationException("Penguins can't fly.");
        }
    }
    public interface Flyable {
        void fly();
    }

    public class Bird {
        public void eat() {
            System.out.println("The bird is eating.");
        }
    }

    public class Sparrow extends Bird implements Flyable {

        public void fly() {
            System.out.println("The sparrow is flying.");
        }
    }

    public class Penguin extends Bird {
        // Penguins don't implement Flyable, so no fly method.
    }
    public class Main {
        public static void main(String[] args) {
            Bird sparrow = new Sparrow();
            ((Flyable) sparrow).fly();

            Bird penguin = new Penguin();
            penguin.eat();
        }
    }

}
