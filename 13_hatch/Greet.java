/*
Vansh Saboo and Abdullah Faruque
HW13 -- Where do BigSibs Come From?
2021-10-08
*/

/* 
DISCO:
QCC:
*/

public class Greet{
    public static void main(String[] args){
        String greeting;
        BigSib richard = new BigSib();    
        // richard.setHelloMsg("Word up");	  
        greeting = richard.greet("freshman");                            
        System.out.println(greeting);
    } //end main()
} //end Greet
