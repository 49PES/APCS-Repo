/*****************************************************
 * Team: Silly Serpents
 * Team Members (+ Duckies): Vansh Saboo, Jason Zhou: Duckies: Tiggy, Tiffany
 * APCS Pd. 8
 * HW43 -- Array of Steel
 * 2021-12-06
 - Working with arrays
 - Time Spent : 0.5 hours
 - DISCO: N/A        
 - QCC: N/A
 *****************************************************/
public class SuperArray{
    
    // Takes an array and an element, and appends the element to the end of the list
    
    public static int[] add(int[] list, int newElement){
        int[] newList = new int[list.length + 1];
        for(int i = 0; i < list.length; i++){
            newList[i] = list[i];
        }
        newList[newList.length - 1] = newElement;
        return newList;
    }
    
    // Removes the first instance of a given element in the array and returns the culled array 
    
    public static int[] subtract(int[] list, int removedElement){
        boolean isInArray = false;
        for(int element : list){if (element == removedElement) {isInArray = true;}}
        if(isInArray){
            int[] newList = new int[list.length  - 1];
            boolean isRemoved = false;
            int index = 0;
            for(int i = 0; i < list.length; i++){
                if(list[i] != removedElement || isRemoved){newList[index] = list[i]; index++;}
                else{isRemoved = true;}
            }
            return newList;
        }
        else{throw new RuntimeException();}
    }
    
    // Copies an array within a given range
    public static int[] copyOfRange(int[] list, int startIndex, int endIndex){
        if(0 <= startIndex && startIndex < endIndex && endIndex < list.length){
            // {5, 7, 13, 17, 19}
            int[] copiedArray = new int[endIndex - startIndex + 1];
            int index = 0;
            for(int i = startIndex; i <= endIndex; i++){
                copiedArray[index] = list[i]; index++;
            }
            return copiedArray;
        }
        else{throw new RuntimeException();}
    }
    
    public static void main(String[] args){  }
}
