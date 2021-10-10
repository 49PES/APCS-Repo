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
**/
public class BigSib{
    private String msg;
  
    public BigSib(String supMsg){
        msg = supMsg;
    }

    public String greet(String name){
	    return msg + " " + name;
    }
  
}
