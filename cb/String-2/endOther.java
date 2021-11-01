/*
Vansh Saboo
APCS
HW28 -- PPMP/Strings/
Utilizing Strings for Coding Bat Problems
2021-10-31
time spent: 0.5 hours
*/
public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  
  if(a.length() >= b.length() ){
    if (a.substring(a.length() - b.length(), a.length()).equals(b)) {return true;}
  }
  else{
    if (b.substring(b.length() - a.length(), b.length()).equals(a)) {return true;}
  }
  return false;
}
