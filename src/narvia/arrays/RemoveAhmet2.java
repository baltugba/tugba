package narvia.arrays;

import java.util.ArrayList;

public class RemoveAhmet2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");
        for (int i = names.size()-1; i >=0 ; i--) {
            if(names.get(i).equalsIgnoreCase("Ahmed")){
                names.remove(i);
            }

        }
        System.out.println("after removing"+ names);
    }
}
