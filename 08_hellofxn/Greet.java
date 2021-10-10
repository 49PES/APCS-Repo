/*
Vansh Saboo
APCS
HW08 -- Refactor Freshie Zero
2021-09-30
*/

/*
DISCOVERIES:
- There can be multiple files with the same name (e.g. Greet.java) if they're in different directories
UNRESOLVED QUESTIONS:
*/  

public class Greet{

	public static void greet(String name){
		System.out.println("Why, hello there, " + name + ". How do you do?");
    }

    public static void main(String[] args){
      greet("Foo");
      greet("Moo");
      greet("Boo");
    }
}
