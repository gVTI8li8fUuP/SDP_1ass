public class Task5 {
    public class Light {
        public void turnOn() {
            System.out.println("Light is ON.");
        }

        public void turnOff() {
            System.out.println("Light is OFF.");
        }
    }

    public class Button {
        private Light light;

        public Button(Light light) {
            this.light = light;
        }

        public void press() {
            light.turnOn();
        }
    }

    public interface Switchable {
        void turnOn();

        void turnOff();
    }

    public class Light implements Switchable {

        public void turnOn() {
            System.out.println("Light is ON.");
        }


        public void turnOff() {
            System.out.println("Light is OFF.");
        }
    }

    public class Button {
        private Switchable device;

        public Button(Switchable device) {
            this.device = device;
        }

        public void press() {
            device.turnOn
        }

    }
}
