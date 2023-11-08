import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        HashMap<String, Integer> rajit = new HashMap<>();

        rajit.put("alice", 50);
        rajit.put("hello", 55);
        rajit.put("bangladesh", 60);
        rajit.put("new rajit", 10);

        int rajitNew = rajit.get("hello");

        // System.out.println(rajitNew);

        HashMap<String, Integer> bangladeshNewMap = new HashMap<>();
        HashMap<Integer, String> amaderDesh = new HashMap<>();

        HashSet<Integer[]> amarSet = new HashSet<>();
        int[] arrayInteger = {1,2,3,4,5,6,8,22,5,2,1,43};

        int age;
        

       // List<Integer> list = Arrays.asList(arrayInteger);


         // Add the List to the HashSet
       //  amarSet.add(list);


     //   amarSet.add(arrayInteger);
    

        int sizeofSet = amarSet.size();

        System.out.println(sizeofSet);


    }
}