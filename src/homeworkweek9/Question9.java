package homeworkweek9;
/*9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.*/
import java.util.Map;

public class Question9 {
    public static void main(String[] args) {
        Map<String, Integer> people = new java.util.HashMap<>();
        people.put("A", 100);
        people.put("B", 200);
        people.put("C", 300);
        people.put("D", 400);

        //using the for-each loop to get the values
        for (Integer i : people.values()) {
            System.out.println(i);
        }
    }
}
