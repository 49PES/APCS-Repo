/*
Vansh Saboo
APCS
HW28 -- PPMP/Strings/
Utilizing Strings for Coding Bat Problems
2021-10-31
time spent: 0.5 hours
*/

public boolean xyzThere(String str) {
  for(int i = 0; i <= str.length() - 3; i++){
    if (str.substring(i, i + 3).equals("xyz")){
      if (i == 0){ return true;}
      else if (!str.substring(i - 1, i).equals(".")) {return true;}
    }
  }
  return false;
}
