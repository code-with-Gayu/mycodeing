//interface declaration
interface animal

    {

    //abstract method
     void makesound();
     void eat();

    }

  class dog implements animal
  { 
     //override
     public void makesound()
     {
        System.out.println("woof!");                  
      
     }
     //override
     public void eat()
     {
        System.out.println("dog is eating kibble"); 
     }
  }
   //another class implementings the animal interface
   class cat implements animal 
   {
      //override
      
        public void makesound()
      {
        System.out.println("meow!");
      }
      //override
      public void eat()
      {
        System.out.println("cat is eating fish");
      }
    }
      public class inter
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
   
