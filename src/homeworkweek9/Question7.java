package homeworkweek9;
/*7. Write a Java program to test an array list is empty or not. Define array list with
underground tube names */
import java.util.ArrayList;

public class Question7 {
    public static void main(String[] args) {
        ArrayList underground = new ArrayList();
        underground.add("Piccadilly");
        underground.add("Metropolitan");
        underground.add("District");
        underground.add("Hammersmith & City");
        underground.add("Jubilee");
        underground.add("Circle");
        underground.add("Central line");
        underground.add("Northern");
        underground.add("Victoria");

        if (!underground.isEmpty()) {
            System.out.println("ArrayList is not Empty");
        }else
        System.out.println("is not Empty");


    }

}
