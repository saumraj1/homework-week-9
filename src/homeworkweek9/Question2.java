package homeworkweek9;

import java.util.Scanner;

public class Question2 {
   public String getResult(double percentage){
       //condition statement to chech if pass or failed
       String p= "PASS", f= "FAIL";
       if (percentage<35){
           return f;

       }
       else{
           return p;
       }
   }

    // method to assign grades according to percentage
    public String getGrade(double percentage){
        String g;
        if (percentage>=80){
            return g= "A+";
        }
        else if (percentage >=60){
            return g ="B";
        }
        else if (percentage >= 35){
            return g= "C";
        }
        else{
            return g= "FAIL";
        }
    }

    public static void main(String[] args) {
        Question2 q2 =new Question2();

        String name;
        int roll_no, maths, science,english,total;
        double percentage;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter student name : ");
        name=sc.nextLine();
        System.out.println("Enter roll no :");
        roll_no =sc.nextInt();
        System.out.println("Enter maths marks : ");
        maths=sc.nextInt();
        while(maths<0 || maths >100){
            System.out.println("Invalid input, marks should between 0 to 100");
            System.out.println("Enter maths marks again :");
            maths=sc.nextInt();
        }

        System.out.println("Enter science marks :");
        science= sc.nextInt();
        while(science<0 || science >100){
            System.out.println("Invalid input, marks should between 0 to 100");
            System.out.println("Enter science marks again :");
            science=sc.nextInt();
        }
        System.out.println("Enter english marks :");
        english= sc.nextInt();
        while(english<0 || english >100) {
            System.out.println("Invalid input, marks should between 0 to 100");
            System.out.println("Enter english marks again :");
            english = sc.nextInt();
            sc.close();
        }
        total=maths+science+english;
        percentage= total*100/300;
        String result =q2.getResult(percentage);
        String grade= q2.getGrade(percentage);

        System.out.println("_______________________________");
        System.out.println("|                             |");
        System.out.println("|         Mark Sheet          |");
        System.out.println("|_____________________________|");
        System.out.println("|         Name : " + name + "        |");
        System.out.println("|     Roll No  : " + roll_no + "          |");
        System.out.println("|_____________________________|");
        System.out.println("|     Subjects  :  Marks      |");
        System.out.println("|_____________________________|");
        System.out.println("|         Maths : " + maths + "          |");
        System.out.println("|       Science : " + science + "          |");
        System.out.println("|       English : " + english + "          |");
        System.out.println("|_____________________________|");
        System.out.println("|         Total : " + total + "         |");
        System.out.println("|_____________________________|");
        System.out.println("|    Percentage : " + percentage+ "        |");
        System.out.println("|        Result : " + result + "        |");
        System.out.println("|         Grade : " + grade + "           |");
        System.out.println("|_____________________________|");

    }
}
