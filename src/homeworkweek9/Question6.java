package homeworkweek9;

import java.util.ArrayList;
import java.util.Scanner;

/*6. Write a Java program to retrieve an element (at a specified index) from a given
array lis*/
public class Question6 {
    public static void main(String[] args)
    {
        ArrayList <String> arrayList = new ArrayList();
        arrayList.add("Alpha");
        arrayList.add("Bravo");
        arrayList.add("Charlie");
        arrayList.add("Delta");
        arrayList.add("Echo");
        arrayList.add("Foxtrot");
        arrayList.add("Golf");
        arrayList.add("Hotel");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an index number between 0 and 7");
        int index = sc.nextInt();


        if(index == 0) {
            System.out.println("Alpha");
        }else if (index==1) {
            System.out.println("Beta");
        }else if (index ==2) {
            System.out.println("Char");
        }else if (index==3) {
            System.out.println("Del");
        }else if (index ==4) {
            System.out.println("Echo");
        }else if (index==5) {
            System.out.println("Foxt");
        }else if (index==6) {
            System.out.println("Golf");
        }else if(index ==7) {
            System.out.println("Hotel");
        }else {
            System.out.println("Invalid index number is entered");

        }


    }
    //direct way of printing from index numbers
    //specified index values from list
        /*System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(7));*/
}

