package U2;

public class practice {
    public static void main(String[] args) {


        String email = "udemy.bal.tugba@hotmail.com";

        String firstName = email.substring(email.indexOf(".") + 1, email.indexOf("@"));
        // System.out.println(firstName);
        String lastName = email.substring(0, email.indexOf("."));
        // System.out.println(lastName);
   //  String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
    //  System.out.println(domain);

      firstName  =firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
     lastName =lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println("first name:" +firstName);
        System.out.println("last name:"+ lastName);


    }

}