/*
- There were threetypes of errors mentioned in the text
  - Compile-time errors indicate that there is something wrong with the syntax of the program 
  - Run-time errors are produced if something goes wrong while the program is running
  - Logic errors (not an error in that it will not run, just won't work as intended) cause the program to do the wrong thing
  
- Fix one error at a time and recompile, since often times the program reports spuriuous errors after an error
- If you get an error message, read it to help you determine where the problem occurred
- Checking cmmon syntax errors:
-   (), {}, [] all properly nested
  - UPPERCASE =/= lowercase 
  - Semicolons at the end of statements!
  - "" surrounding a string, '' surrounding a character
  - For each assignment statement, ensure types match (e.g. int[] to int[])
  - For each method invocation, arguments in right order & right type (e. g. pythag(int a, int b, int c), inputting a, b, c, as right types/order
   and the object you're invoking on is right
   - If value method, make sure you're doing something with the value (return 5 is useless unless you do something with the 5)!
   - If invoking an instance method, ensure you are invoking it on an object with the right type.

- **Bisection** -delete ~half of code & check, then readd another half, and continue until fixed
- If you think that a loop has an issue, implement a print into the loop to check
- StackOverflowError - infinite recursion! Ensure that program reaches base case

- Exceptions:
  - NullPointerException - attempt to access instance variable that was null
  - ArrayIndexOutOfBoundsException - trying to access an element/index that is beyond the range of the Array (i < 0 or i > array.length - 1)
  - StackOverflowError - Infinite recursion (as described earlier)
  - FileNotFoundException -  Java didn’t find the file it was looking for (make sure file exists and path is correct)
  - ArithmeticException - Arithmetic error (e.g. /0 )
  
- Break down complex expressions into smaller expressions to more easily debug
- If method doesn't return intended result, incorporate intermediate variables and print statements to determine where the process is faulty
- Ask the proper questions to figure out where the error is, such as:
  - Kind of bug? (compile, run, logic)
   - Newest lines of code? What were the test cases that failed?
   - If compile-time or run-time errors, where in the program does the error point to?
   - What have you tried, and what have you learned?
*/
