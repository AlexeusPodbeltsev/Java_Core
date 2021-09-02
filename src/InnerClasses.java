public class InnerClasses {
    public static void main(String[] args) {
        User tom = new User("Tom","qwerty");
        tom.displayUser();
        tom.account.displayAccount();

    }
}

class User {
    private String name;
     Account account;
    User(String name, String password){
        this.name = name;
        account = new Account(password);
    }
    public void displayUser(){
        System.out.printf("initializerTutorial.Person \t Name: %s \t Password: %s \n", name, account.password);
    }


      class Account {
        private String password;

        Account(String pass) {
            this.password = pass;
        }

        void displayAccount() {
            System.out.printf("Account Login: %s \t Password: %s \n", User.this.name, password);
        }
    }
}
