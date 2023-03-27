package loop;

import java.util.ArrayList;
import java.util.Arrays;

public class a {
    public static void main(String[] args) {

        String str = "macimilian@cyertekschool.com@09347#%#Q%#@%";

        String[] strNew = str.split("");
        System.out.println("Array with split method " + Arrays.toString(strNew));

        System.out.println("char array = " + Arrays.toString(str.toCharArray()));

        Arrays.sort(strNew);
        System.out.println("str after sorted " + Arrays.toString(strNew));

        System.out.println("split via @ = " + Arrays.toString(str.split("@")));

        String str2 = str.split("@")[1].split("")[5].toUpperCase();
        //cydeo.com
        System.out.println(str2);




        }






    }

