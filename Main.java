interface animal
  {
    void makesound();
    void eat();                                                                                                      
  } 
class dog implements animal
{
    public void makesound()
  {
        System.out.println("woof!");
  }     
  public void eat()
  {
    System.out.println("dog is eating kibble");
  }
}
class cat implements animal
{
    public void makesound()
    {
        System.out.println("meow!");
    }
    public void eat()
    {
        System.out.println("cat is eating fish");
    }
 }
public class Main
  {
    public static void main(String[]args)
    {
      dog mydog = new dog();
      mydog.makesound();
      mydog.eat();

      System.out.println();

      cat mycat = new cat();
      mycat.makesound();
      mycat.eat();
    }
  }
