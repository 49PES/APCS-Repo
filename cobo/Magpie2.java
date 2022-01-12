import java.util.Scanner;
public class Magpie2{
  Scanner in = new Scanner();
  static String[] genericResponses = new String[7];
  genericResponses[0] = "That's cool";
  genericResponses[1] = "Neat! Tell me more";
  genericResponses[2] = "Woah, really?";
  genericResponses[3] = "Fascinating ...";
  genericResponses[4] = "I'm intrigued, go on";
  genericResponses[5] = "You have my attention";
  genericResponses[6] = "mhm yeah";

  public static String genericResponse(){
    return genericResponses[(int) (Math.random() * 7)];
  }
  public static void main(String[] args){
    System.out.println("Hello World!");
    System.out.println(genericResponse() );
  }

}
