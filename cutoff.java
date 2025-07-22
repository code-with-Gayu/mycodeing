import java.util.Scanner;

public class cutoff
{
    public static void main(String[] args)
    {
        int physics = 80;
        int chem =90;
        int mat = 75;
        int add = physics + chem;
        
        System.out.println("Add" + add);
        int divide = add/2;
        System.out.println("Divide" + divide);
        int cutoff = divide+mat;
        System.out.println("cutoff" + cutoff);
        if(cutoff>175)
        {
            System.out.println("the person is eliglbe for the college admission ");
        }
        else
        {
            System.out.println("the person is not eligble for college admission");
        }
    }
}