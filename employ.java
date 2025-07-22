 
class emp 
 {
    String emp_name="gayu";
    int emp_id=64758;

    void display()
    {
        System.out.println("emp name ="+emp_name);
       System.out.println("emp id="+emp_id);
    }  
}
class office extends emp
{
    String office_name="vbc";
    void display()
    {
    System.out.println("office name="+office_name);
    }
}
public class employ{
    public static void main(String[]args)
    {
        emp myemp = new emp();
        myemp.display();

    

        office myoffice = new office();
        myoffice.display();
        
    }
}

    

