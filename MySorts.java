import java.util.ArrayList;
public class MySorts{
	public static void bubbleSort (ArrayList<Comparable> data )  {

    boolean isSorted = true;
    int size = data.size();
    Comparable temp;
    while(!isSorted){
      for (int j = size - 1; j > 0; j--) {
        //swapping
        isSorted = true;
        if (data.get(j).compareTo(data.get(j - 1)) < 0) {
          isSorted = false;
          temp = data.get(j);
          data.set(j, data.get(j - 1));
          data.set(j - 1, temp);
          
        }
      }

    }
}
    
    public static void selectionSort ( ArrayList<Comparable> data) {
    
    int maxPos = 0;
    for(int pass = data.size(); pass > 0; pass--) {
    
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag

      //check for greatest

      for(int index = 0; index < pass; index++) {
          if (data.get(index).compareTo( data.get(maxPos) ) > 0 ) {maxPos = index;}
      }

        System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag
      //}

      //shift
        data.add(pass, data.get(maxPos));
        data.remove(data.get(maxPos));

      }

      System.out.println( "after swap: " +  data );//diag
      
    }
 
    public static void insertionSort (ArrayList<Comparable> data ){
    
   
   for(int partition = 0; partition < data.size() - 1; partition++  ) {

     System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
     System.out.println( data );

     //traverse sorted region from right to left
     for(int j = partition + 1; j > 0; j--) {
       // "walk" the current item to where it belongs
       // by swapping adjacent items
       if ( data.get(j).compareTo( data.get(j - 1) ) < 0  ) {

         System.out.println( "swap indices "+ (j) +" & "+ (j - 1) +"..." ); //diag

         Comparable temp = data.get(j);
         data.set(j, data.get(j - 1));
         data.set(j - 1, temp);
       }
       else
         break;
     }
   }
   System.out.println(data);
 }

}
