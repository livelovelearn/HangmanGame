/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 * Assignment #4.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.awt.*;

public class Hangman extends ConsoleProgram {

    public void run() {
    	int random = rgen.nextInt (0, 10);
    	String word = lex.getWord(random);
    	int length = word.length();
    	
    	print("The word now looks like this: ");
    	for (int i=0;i<length;i++) print("-");
	}

    private HangmanLexicon lex = new HangmanLexicon();
    private RandomGenerator rgen = RandomGenerator.getInstance();
}
