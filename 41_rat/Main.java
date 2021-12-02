// For testing the Rational class
public class Main{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Rational fiveSevenths = new Rational(5, 7);
	
		System.out.println(fiveSevenths.toString());
		System.out.println(fiveSevenths.floatValue());
		Rational threeFourths = new Rational(3, 4);
	
		System.out.println(threeFourths.toString());
		Rational fiveZeroths = new Rational(5, 0);
		
		fiveSevenths.multiply(threeFourths);
		System.out.println(fiveSevenths.toString());
		
		fiveSevenths.divide(threeFourths);
		System.out.println(fiveSevenths.toString());
	}
}
