package lambdas;

public class ConstructorReference {
    public static void main(String[] args) {
        UserBuilder userBuilder = User::new;
        User user = userBuilder.createUser("Tom");
        System.out.println(user.getName());

    }
}

@FunctionalInterface
interface UserBuilder {
    User createUser(String name);
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
