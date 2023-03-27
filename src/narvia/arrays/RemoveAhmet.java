package narvia.arrays;

import java.util.ArrayList;

public class RemoveAhmet {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("Tugba");
        names.add("Ahmed");
        names.add("Ahmed");
        names.add("Feyza");
        names.add("Pinar");
        System.out.println("original list"+ names);
        names.removeIf(name -> name.equals("Ahmed"));
        System.out.println("new list"+ names);


    }
}
