/*****************************************************
 * Team: Silly Serpents
 * Team Members (+ Duckies): Vansh Saboo, Jason Zhou: Duckies: Tiggy, Tiffany
 * APCS Pd. 8
 * HW41 -- Be Rational
 * 2021-12-02
 - Working with Rational objects
 - Time Spent : 0.2 hours
 - DISCO: N/A
 - QCC: N/A
 *****************************************************/

public class Rational{
    private int numerator;
    private int denominator;
    
    public Rational(){
        numerator = 0;
        denominator = 1;
    }
    public Rational(int num, int denom){
        if(denom != 0){
            numerator = num;
            denominator = denom;
        }
        else{
            numerator = 0;
            denominator = 1;
            System.out.println("You can not use a denominator of 0. This Rational object has been set to 0/1");
        }
    }
    
    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }
    
    public float floatValue(){
        return ((float) numerator) / ((float) denominator);
    }
    public void multiply(Rational other){
        numerator *= other.numerator;
        denominator *= other.denominator;
    }
    public void divide(Rational other){
      // Dividing by a rational value p/q  is the same as multiplying by its reciprocal, q/p
        numerator *= other.denominator;
        denominator *= other.numerator;
    }
    
}
