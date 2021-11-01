package homeworkweek9;

import java.util.HashSet;
import java.util.Set;

/*8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else*/
public class Question8 {
    public static void main(String[] args) {
        //Creating a new hashset object called Set
        Set<Integer> set = new HashSet<Integer>();

        //adding values to the set
        set.add(4);
        set.add(7);
        set.add(8);

        for(int i = 1; i<11; i++){
            if (set.contains(i)){
                System.out.println(i + " was found in the set");
            }else {
                System.out.println(i + " was not found in the set");
            }

        }

    }
}
