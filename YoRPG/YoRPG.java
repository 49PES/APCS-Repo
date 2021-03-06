/**********************************************
 * class YoRPG -- Driver file for Ye Olde Role Playing Game.
 * Simulates monster encounters of a wandering adventurer.
 * Required classes: Protagonist, Monster
 *
 * USAGE:
 * Compile. Note messages generated.
 * Devise a plan of attack with your trio.
 * Code incrementally, testing each bit of new functionality as you go.
 * The only modification you should make to this driver file is moving comment bar down in main method, and filling in DISCO/QCC
 * (If you feel other changes are merited, note what and why, so that we may discuss on the 'morrow.)
 *
 * DISCO:
 *
 * QCC:
 *
 **********************************************/

import java.io.*;
import java.util.*;

import javax.sound.midi.SysexMessage;


public class YoRPG {

  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

  //change this constant to set number of encounters in a game
  public final static int MAX_ENCOUNTERS = 5;

  //each round, a Protagonist and a Monster will be instantiated...
  private Protagonist pat;
  private Monster smaug;

  private int moveCount;
  private boolean gameOver;
  private int difficulty;

  private InputStreamReader isr;
  private BufferedReader in;
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
  public YoRPG() {
    moveCount = 0;
    gameOver = false;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    newGame();
  }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

  /*=============================================
    void newGame() -- gathers info to begin a new game
    pre:
    post: according to user input, modifies instance var for difficulty
    and instantiates a Protagonist
    =============================================*/
  public void newGame() {
    String s;
    String name = "";
    s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

    s += "\nChoose your difficulty: \n";
    s += "\t1: Easy\n";
    s += "\t2: Not so easy\n";
    s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
    s += "Selection: ";
    System.out.print( s );

    while(true) {
      try {
        difficulty = Integer.parseInt( in.readLine() );
        if (difficulty > 3) {
          throw new IOException("Thee hath picked no difficulty! Try Again");
        }
        break;
      }
      catch ( Exception e) { 
        System.out.println("Thee hath picked no difficulty! Try Again");
      }
    }

    s = "Intrepid protagonist, what doth thy call thyself? (State your name): ";
    System.out.print( s );
    while(true) {
      try {
        name = in.readLine();
        break;
      }
      catch ( IOException e ) {
        System.out.println("Thee has a name, hath not?");
      }
    }

    //instantiate the player's character
    pat = new Protagonist( name );

  }//end newGame()


  /*=============================================
    boolean playTurn -- simulates a round of combat
    pre:  Protagonist pat has been initialized
    post: Returns true if player wins (monster dies).
    Returns false if monster wins (player dies).
    =============================================*/
  public boolean playTurn() {
    int i = 1;
    int f = 1;
    int d1, d2;

    if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
    else {
	    System.out.println( "\nLo, yonder monster approacheth!" );

	    smaug = new Monster();

	    while( smaug.isAlive() && pat.isAlive() ) {

        // Give user the option of using a special attack:
        // If you land a hit, you incur greater damage,
        // ...but if you get hit, you take more damage.
        try {
          System.out.println( "\nDo you feel lucky?" );
          System.out.println( "\t1: Nay.\n\t2: Aye!" );
          i = Integer.parseInt( in.readLine() );
        }
        catch ( IOException e ) {
          System.out.println("Thee hath picked no number!");
        }


        if ( i == 2 )
          pat.specialize();
        else
          pat.normalize();

        d1 = pat.attack( smaug );
        d2 = smaug.attack( pat );

        //added some stuff here (health bar indicators)
        System.out.println( "\n" + pat.getName() + " dealt " + d1 +
                            " points of damage.");
        if (smaug.isAlive())
          System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
                              " for " + d2 + " points of damage.\n\n\t" + pat.getName()
                              + " Health: " + pat.getHealth() + "\n\t" + "Monster Health: " +
                              smaug.getHealth());
        
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
        System.out.println( "'Twas an epic battle, to be sure... " +
                            "You cut ye olde monster down, but " +
                            "with its dying breath ye olde monster. " +
                            "laid a fatal blow upon thy skull." );
        return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
        System.out.println( "\nHuzzaaH! Ye olde monster hath been slain!" );

        // added things
        System.out.println( "\nYou hath gained 10 XP and climbed one level" +
                            "\n\t1: Gain 10 health.\n\t2: Gain 10 damage.");
        try {
          f = Integer.parseInt(in.readLine());
        } catch (IOException z) {
          System.out.println("Thee hath picked no number!");
        }
        if (f == 1) {
          pat.increaseLevel(10, 0);
        } else {
          pat.increaseLevel(0, 10);
        }
        System.out.println("\nWell done hero! You has slain a monster! Health hath been reset!");
        pat.resetHealth();
        return true;
        
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
        System.out.println( "Ye olde self hath expired. You got dead." );
        return false;
	    }
    }//end else

    return true;
  }//end playTurn()
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  public static void main( String[] args ) {
    //As usual, move the begin-comment bar down as you progressively
    //test each new bit of functionality...

    
    //loading...
    YoRPG game = new YoRPG();

    int encounters = 0;

    while( encounters < MAX_ENCOUNTERS ) {
    if ( !game.playTurn() )
    break;
    encounters++;
    System.out.println();
    }

    System.out.println( "Thy game doth be over." );

  }//end main

}//end class YoRPG
