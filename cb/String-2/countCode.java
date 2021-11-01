/*
Vansh Saboo
APCS
HW28 -- PPMP/Strings/
Utilizing Strings for Coding Bat Problems
2021-10-31
time spent: 0.5 hours
*/

public int countCode(String str) {
  int counter = 0;
  for(int i = 0; i < str.length() - 3; i++){
    String sub = str.substring(i, i + 4);
    String firstTwo = str.substring(i, i + 2);
    String last = str.substring(i + 3, i + 4);
    if(firstTwo.equals("co") && last.equals("e")) { counter++; }
  }
  return counter;
}
