import java.util.Scanner;
public class GuessNumber{
    
    private int _lo, _hi, _guessCtr, _target;
    Scanner sc = new Scanner(System.in);
    
    public GuessNumber(int a, int b){
        _lo = a;
        _hi = b;
        _guessCtr = 1;
        _target = (int) (Math.random() * (b - a)) + a;
    }
    
    public void playIter(){
        int guess;
        while(true){
            
            System.out.println("Guess a number between " + _lo + " & " + _hi + ": ");
            guess = sc.nextInt();
            if (guess < _lo || guess > _hi) {System.out.println("Choose a value within the bounds!"); }
            else{ 
                if(guess == _target) break;
                if(guess > _target)  {System.out.println("Too high"); _hi = guess - 1;}  // If the guess is greater than the target, update the upper bound
                else {System.out.println("Too low"); _lo = guess + 1;} // else if the guess is less than the target, update the lower bound
                _guessCtr++;
            }
        }
        System.out.println("Correct! It took " + _guessCtr + " guesses");
    }
}
