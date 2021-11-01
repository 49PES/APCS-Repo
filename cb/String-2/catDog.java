/*
Vansh Saboo
APCS
HW28 -- PPMP/Strings/
Utilizing Strings for Coding Bat Problems
2021-10-31
time spent: 0.5 hours
*/
public boolean catDog(String str) {
  int catCounter = 0;
  int dogCounter = 0;
  for(int i = 0; i < str.length() - 2; i++){
    String sub = str.substring(i, i + 3);
    if (sub.equals("cat")) { catCounter++; }
    else if (sub.equals("dog")) { dogCounter++; }
  }
  return (catCounter == dogCounter);
}
