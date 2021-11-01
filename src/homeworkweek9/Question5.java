package homeworkweek9;
/*5. Write a Java program to iterate through all elements in an array list using
Iterator*/
import java.util.ArrayList;
import java.util.Iterator;

public class Question5<namesList> {
    public static void main(String[] args) {
        ArrayList friendsName = new ArrayList();
        friendsName.add("Laxmi");
        friendsName.add("Nidhi");
        friendsName.add("Bhoomi");
        friendsName.add("Darshana");
        friendsName.add("Dimpal");
        friendsName.add("Nareshbhai");

        //iterating the array list using Iterator
        Iterator itr = friendsName.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}