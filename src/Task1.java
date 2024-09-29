public class Task1 {
    public class User {
        private String name;
        private String email;

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }
    }
    public class EmailValidator {
        public boolean isValid(String email) {
            return email.contains("@") && email.contains(".");
        }
    }
    public class Main {
        public static void main(String[] args) {
            User user = new User("Alice", "alice@example.com");
            EmailValidator validator = new EmailValidator();

            if (validator.isValid(user.getEmail())) {
                System.out.println(user.getName() + "'s email is valid.");
            } else {
                System.out.println(user.getName() + "'s email is invalid.");
            }
        }
    }

}
