/* Vansh Saboo, Jason Zhuo
APCS
HW34 -- A Pirate’s Life for Me / Arrays 
Methods for turning arrays into strings, and methods for linear search and frequency counters (iterative and recursive)
2021-11-14
time spent: 0.5 hours

DISCO:
QCC: 
- I feel as though the linSearchR method could have been made easier to interpret and implement had there been three parameters (an index parameter to keep track) - would we be allowed to add more parameters?
*/

public class Loopier{
	public static int[] generator(int[] a){
	    for (int i = 0; i < a.length ; i++){a[i] = (int) (Math.random() * Math.pow(2.0, 31.0));} // 
	    return a;
	}
	
	public static String stringify(int[] a){
	    String output = "[";
	    if(a.length > 0){
	        output += a[0];
	        for (int i = 1; i < a.length ; i++){
	            output += ", " + a[i];
	        }
	    }
	    return output + "]";
	}
	
	public static int linSearch(int[] a, int target){
	    for(int i = 0; i < a.length ; i++){
	        if(a[i] == target){return i;}
	    }
	    return -1;
	}
	
	public static int freq(int[] a, int target){
	    int counter = 0;
	    for(int i = 0; i < a.length; i++){
	        if(a[i] == target){counter++;}
	    }
	    return counter;
	}
    
    // Method for recursive reduction - generates subarrays with elements of indexes 1+
    // Could be replaced with Arrays.copyOfRange() method from Array library
    
	public static int[] copier(int[] a){
	    int[] copy = new int[a.length - 1];
	    for(int i = 1; i < a.length; i++){
	        copy[i - 1] = a[i];
	    }
	    return copy;
	}
	
	public static int linSearchR(int[] a, int target){
	    if(a[0] == target){return 0;}
	    if(a.length == 1){return -1;}
	    int index = linSearchR(copier(a), target);
	    if (index == -1){return -1;}
	    return index + 1;
	}
  
	public static int freqRec(int[] a, int target){
	    if(a.length == 0){return 0;}
	    if(a[0] == target){return 1 + freqRec(copier(a), target);}
	    return freqRec(copier(a), target);
	}
	
	public static void main(String[] args) {
		int[] scores = new int[5];
		System.out.println(stringify(generator(scores)));
		
		System.out.println();
		int[] values = {5, 5, 10, 9, 7};
		System.out.println(linSearch(values, 8));
		System.out.println(linSearch(values, 5));
		System.out.println(linSearchR(values, 8));
		System.out.println(linSearchR(values, 9));
		
		System.out.println();
		System.out.println(freq(values, 10));
		System.out.println(freqRec(values, 10));
		System.out.println(freq(values, 1029));
		System.out.println(freqRec(values, 1029));
	}
}
