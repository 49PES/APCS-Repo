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

public class BigSib{

  private String richard, grizz, dotCom, tracy;


  public BigSib(){
    richard = "word up";
    grizz = "Hey ya";
    dotCom = "Sup";
    tracy = "Salutations";
  }



	public String greet(String name){
		if(name == "freshman"){
        return richard + " " + name;
    }
    else if(name == "Dr.Spaceman"){
        return tracy + " " + name;
    }
    else if(name == "Kong Fooey"){
        return grizz + " " + name;
    }
    else if(name == "mom"){
        return dotCom + " " + name;
    }
    else{
        return "idk";
    }
	}
}
