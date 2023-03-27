package U2;

import java.util.*;

public class sinav {
    public static void main(String[] args) {


        Map<String, String> map = new Hashtable<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");

        for (String key : map.keySet()) {
            System.out.println(key);

        }

        for (String value : map.values()) {
            System.out.println(value);

        }
        System.out.println("__________________________________");


        for (Map.Entry<String, String> entry : map.entrySet()) {
         //   System.out.println(entry);
            System.out.println(entry.getKey()+ ":"+ entry.getValue());
            if(entry.getKey().equals("A03")){
                entry.setValue("Tugba");

            }

        }
        System.out.println(map);

        System.out.println("______________________________________");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) <4) {
                list.remove(i);
            }
        }
        System.out.println(list);

        System.out.println("+++++++++++++++++++++++++++++++++");
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));

       Iterator<Integer> it = list2.iterator();
       while (it.hasNext()){
           if(it.next() <4){
               it.remove();
           }
        }
        System.out.println(list2);
        System.out.println("+++++++++++++++++++++++++++++++++");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));

        list3.removeIf(p->p <4);
        System.out.println(list3);
            
        }
    }

