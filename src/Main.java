import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        HashMap<String, Integer> rajit = new HashMap<>();

        rajit.put("alice", 50);
        rajit.put("hello", 55);
        rajit.put("bangladesh", 60);
        rajit.put("new rajit", 10);

        int rajitNew = rajit.get("hello");

        System.out.println(rajitNew);

    }
}