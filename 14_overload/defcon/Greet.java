
/**
Team Richard
Jacob Ng and Preguac, Kartik and Krrish, Vansh and Tiffany
APCS
HW14 -- Customize Your Creation
2021-10-07
**/

/**
DISCO
- Learned about overloaded constructors
QCC
- I don't think our team did this homework properly
**/

public class Greet{
    public static void main(String[] args){
      String greeting;
      
      BigSib richard = new BigSib();
      BigSib grizz = new BigSib();
      BigSib dotCom = new BigSib();
      BigSib tracy = new BigSib();
      
      greeting = richard.greet("freshman");
      System.out.println(greeting);
      
      greeting = tracy.greet("Dr.Spaceman");
      System.out.println(greeting);
      
      greeting = grizz.greet("Kong Fooey");
      System.out.println(greeting);
      
      greeting = dotCom.greet("mom");
      System.out.println(greeting);
		}	
}
