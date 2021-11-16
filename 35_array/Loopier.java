/* 
   Silly Serpants
   Humans: Jason Zhou, Vansh Saboo; Duckies: Tiggy, Tiffany
   APCS
   HW34: A Pirate's Life for Me (Arrays - finding freq and index)
   2021-14-11
   time spent: 0.3 hours
QCC: 
DISCO: 
*/

public class Loopier {
  // Custom copyOfRange() method
  public static int[] copy(int[] a, int start, int end) {
    int[] b = new int[end - start + 1];
    int i = 0;
    while (start <= end) {
      b[i] = a[start];
      start++;
      i++;
    }
    return b;
  }
 
  public static int[] copier(int[] a){
    int[] copy = new int[a.length - 1];
    for(int i = 1; i < a.length; i++){
        copy[i - 1] = a[i];
    }
    return copy;
  }
  
  //current values from -100 to 100
  public static void populateArrayWithRandom(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = (Math.random() < 0.5) ? (int) (Math.random() * Math.pow(2, 31)) : (int) (Math.random() * Math.pow(2, 31) * -1);
    }
  }
  
  public static String arrayToString(int[] array) {
    String stringThing = "";
    for (int i = 0; i < array.length; i++) {
        stringThing += array[i] + " ";
    }
    return stringThing;
  }

  public static int linSearch(int[] a, int target) {
    for (int i = 0; i < a.length; i++) {
      if (target == a[i]) {
        return i;
      }
    }
    return -1;
  }
  
  public static int linSearchR(int[] a, int target) {
    if(a[0] == target){return 0;}
	    if(a.length == 1){return -1;}
	    int index = linSearchR(copier(a), target);
	    if (index == -1){return -1;}
	    return index + 1;
  }

  public static int freq(int[] a, int target) {
    int counter = 0;
    for (int i = 0; i < a.length; i++) {
      if (target == a[i]) {
        counter++;
      }
    }
    return counter;
  }
  
  public static int freqRec(int[] a, int target) {
    if(a.length == 0){return 0;}
	    if(a[0] == target){return 1 + freqRec(copier(a), target);}
	    return freqRec(copier(a), target);
  }
  public static void main(String[] args) {
      
      int[] array = {9, 9, 6, 7, 8, 9, 9, 9};
      int[] array2 = {4};
      int[] array3 = {2, 3, 4, 5};
      
      /*
      for (int i : array) { System.out.println(linSearchR(array, i));   }
      */
      System.out.println(arrayToString(copy(array, 0, 5))); // 9, 9, 6, 7, 8, 9
     
      System.out.println(linSearchR(array, 9)); // 0 
      System.out.println(linSearchR(array2, 9)); // -1
      System.out.println(linSearchR(array3, 9)); // -1
      System.out.println(linSearchR(array3, 4)); // 2
      System.out.println(linSearchR(array3, 3)); // 1
      System.out.println(linSearch(array, 9)); // 0
      System.out.println(linSearch(array2, 9)); // -1
      System.out.println(linSearch(array3, 3)); // 1
      System.out.println(freqRec(array, 9)); // 5
      System.out.println(freqRec(array, 21)); // 0
      System.out.println(freq(array, 9)); // 5

      int[] scores = new int[5];
     
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
