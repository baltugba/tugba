package test;
class Credentials{
    private String username="BugBusters";
    private String password="WoodenSpoon";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class LogIn {
    public static void main(String[] args) {

        Credentials obj = new Credentials();
        System.out.println(obj.getPassword());

    }


}
