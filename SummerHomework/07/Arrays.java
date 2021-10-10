import java.util.Arrays;
import java.util.Random;

public class Arrays{
    public static boolean[] sieve(int n){
        boolean[] numbers = new boolean[n]; //Creates an array of n elements

        for (int i = 0; i < numbers.length; i++){
            if (i > 1) {numbers[i] = true;} // Sets values after a[1] true
        }

        for (int i = 2; i <= Math.sqrt(n - 1); i++) {

            int j = (int) Math.pow((double) i, 2.0); // j starts as i^2

            while (j < n){
                numbers[j] = false;
                j += i;
            }
        }
        return numbers; // return statement
    }

        public static double[] powArray(double[] a, int n){
           double[] newArray = new double[a.length];
           for(int i = 0; i < a.length; i++){
                newArray[i] = Math.pow(a[i], n); // Raises each element to n
               }
        return newArray;
       }
/*
    // Using the boolean values from the Sieve to determine the actual prime values - irrelevant
    // to summer homework
    public static int[] primeCompiler(boolean[] a){
        int counter = 0;
        for (int i = 0; i < a.length; i++){
          if (a[i]) {counter++;} // Determines number of primes
        }

        int[] compiledArray = new int[counter]; // Makes array = the # of primes
        int index = 0;

        for(int i = 0; i < a.length; i++){
            if (a[i]) {
                compiledArray[index] = i;
                index++;
            }
        }
        return compiledArray;
    }
*/
    public static int[] histogram(int[] scores, int counters){
        int[] counts = new int[counters];
        for(int score : scores){
            if (score < counters) {counts[score]++;}
        }
        return counts;
    }

    public static int indexOfMax(int[] numbers){
        int index = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > index) {index = numbers[i];}
        }
        return index;
    }
    // Returns index of the largest index using an enhanced for loop (Exercise 4)
    public static int indexOfMaxEnhanced(int[] numbers){
        int index = 0;
        for(int number : numbers){
            if (number > index) {index = number;}
        }
        return index;
    }
  
    public static void main(String[] args) {
        int[] genericArray = new int[5];
        genericArray[0] = 5;
        genericArray[1] = 7;
        genericArray[2] = 4;
        genericArray[3] = 49;
        genericArray[4] = 40;
        
        System.out.println(Arrays.toString(sieve(100)));
        // System.out.println(Arrays.toString(histogram(primeCompiler(sieve(100)), 10)));
        System.out.println(indexOfMax(genericArray));
        System.out.println(indexOfMaxEnhanced(genericArray));
    }
}
