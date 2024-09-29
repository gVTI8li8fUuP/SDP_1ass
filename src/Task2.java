public class Task2 {
    abstract class Shape {
        public abstract double area();
    }
    public class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }


        public double area() {
            return length * width;
        }
    }
    public class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }


        public double area() {
            return Math.PI * radius * radius;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Shape rectangle = new Rectangle(5, 3);
            Shape circle = new Circle(4);

            System.out.println("Rectangle area: " + rectangle.area());
            System.out.println("Circle area: " + circle.area());
        }
    }

}
