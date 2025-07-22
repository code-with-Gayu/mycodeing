//interface declaration
interface vehicle
{
    //abstract method
    void brand();
    void model();

}
class car implements vehicle
{
    //override
    public void brand()
    {
        System.out.println("car brand is ford");
    }
    //override
    public void model()
    {
        System.out.println("car model is fiesta");
    }
}
  class Bike implements vehicle{
    //override
    public void brand()
    {
        System.out.println("bike brand is ROYAL ENFIELD");
    }
    public void model()
   
        System.out.println("bike model is himalayan ");
    }

  public class vehi{
    public static void main(String[]args)
    {
        car mycar = new car();
        mycar.brand();
        mycar.model();

        System.out.println();

        Bike mybike = new Bike();
        mybike.brand();
        mybike.model();

        
    }
  }
    

