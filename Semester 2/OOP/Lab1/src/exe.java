
/**
 *
 * @author Usman Khan
 */
import java.util.Scanner;
public class exe {
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter Total Num of Students: ");
       student[] s = new student[input.nextInt()]; 
       for(int i = 0 ; i< s.length;i++)
       {
           s[i] = new student();
           System.out.println("Enter Student Name: ");
           s[i].setSname(input.next());
           
           System.out.println("Enter Student Roll: ");
           s[i].setRoll(input.nextInt());
           
           System.out.println("Enter Subject Details: ");
           for( int j = 0; j<s[i].c.length;j++)
           {
            int k = j+1;
            System.out.println("\t\t\t Course " + k + " Details\t\t\t");
            System.out.println("\n\nEnter Course Code: "); 
            s[i].c[j].setCode(input.nextInt());
            System.out.println("\nEnter Course Name:"); 
            s[i].c[j].setCname(input.next());
            System.out.println("\nEnter Marks: "); 
            s[i].c[j].setMarks(input.nextInt());
           }
           
       }
       for(int f = 0; f< s.length;f++)
       {
           s[f].showAll();
       }
       
       bio b = new bio();
       System.out.print(b.getRoll());
       
    }
    
}
