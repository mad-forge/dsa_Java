package OOPs;

//ENCAPSULATION

public class User {
    private String name;
    private String password;

    public void setName(String n){
        name = n;
    }
    public void setPassword(String p){
        if(p.length() >= 6){
            password = p;
            System.out.println("Password securely set!!");
        } else {
            System.out.println("Error: Password is short");
        }

    }
    public String getName(){
        return name;
    }
}
public class App {
    public static void main(String[] args) {
        User u1 = new User();

        u1.setName("Shashwat");
        u1.setPassword("shashwat123");

        System.out.println("User name is: " + u1.getName());
    }
}
