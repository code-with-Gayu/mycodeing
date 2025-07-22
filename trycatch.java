import java.util.InputMismatchException;
import java.util.Scanner;
class student
{
    String name;
    int rollnumber;
    int tamilmarks;
    int mathmarks;

    void display()
    {
        System.out.println("student name:"+name);
        System.out.println("student rollnumber: "+rollnumber);
        System.out.println("student tamilmarks:"+tamilmarks);
        System.out.println("students mathmarks:"+mathmarks);
    }
}
public class trycatch
{
    public static void main(String[]args)
    {  
       student obj = new student();
      Scanner readdata =new Scanner(System.in); 

      try
      {
           System.out.println("please enter your name");
           obj.name=readdata.nextLine();

            System.out.println("please enter your roll number");
            obj.rollnumber=readdata.nextInt();

            System.out.println("please enter your tamilmarks");
            obj.tamilmarks=readdata.nextInt();

            System.out.println("please enter your mathmarks");
           obj.mathmarks= readdata.nextInt();
             readdata.close();
         obj.display();
      }
      catch (Exception e)
      {
        System.out.println("your enter wrongnumber="+e);
      }
      
          

   }
}