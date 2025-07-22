import java.util.Scanner;

public class swtest {
    public static void main(String[]args)
    {
        Scanner custermerdata= new Scanner(System.in);

        System.out.println("1 who is invented python");
        System.out.println("2 who is invented java");
        System.out.println("3 whi is invented c++");
        System.out.println();
        System.out.println("choose the number get answer");

        int value1 = custermerdata.nextInt();

        switch (value1) {
            case 1 :
              System.out.println("PYTHON INVENTED BY GUIDOVEN");  
                break;
             case 2:
               System.out.println("JAVA INVENTED BY JEMES");
               break;

             case 3:
             System.out.println("C++ INVENTED BY DENIESS RICHE");
             break;

            default:
                break;
        }
    }
}
