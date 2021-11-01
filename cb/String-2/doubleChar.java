/*
Vansh Saboo
APCS
HW28 -- PPMP/Strings/
Utilizing Strings for Coding Bat Problems
2021-10-31
time spent: 0.5 hours
*/

public String doubleChar(String str) {
  String output = "";
  for (int i = 0; i < str.length(); i++){
    output += (str.substring(i, i + 1) + "") + (str.substring(i, i + 1) + "");
  }
  return output;
}
