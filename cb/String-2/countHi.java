/* 
Vansh Saboo
APCS
HW28 -- PPMP/Strings/
Utilizing Strings for Coding Bat Problems
2021-10-31
time spent: 0.5 hours
*/

public int countHi(String str) {
  int counter = 0;
  for (int i = 0; i < str.length() - 1; i++){
    String sub = str.substring(i, i + 2);
    if (sub.equals("hi")) { counter++; }
  }
  return counter;
}
