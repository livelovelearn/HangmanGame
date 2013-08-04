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
    	String word = lex.getWord(0);
    	int length = word.length();
    	int chance = 8;
    	char cover[]= new char[length];
    	
    	println("Welcom to Hangman!");
    	print("The word now looks like this: ");
    	for (int i=0;i<length;i++) 
    		cover[i]='-';
    	for (int i=0;i<length;i++) 
    	    print(cover[i]);
    	
    	println();
    	
    	while(chance>0){
    	String str1= readLine("Your guess: ");
    	char ch1=str1.charAt(0);
    	if (ch1-'a'>=0&&ch1-'a'<=25)
    		{ch1=(char)(ch1-'a'+'A');}
    	
    	while(ch1-'A'<0||ch1-'A'>25)
    		{str1=("illegal character, please guess again: ");
    		 ch1=str1.charAt(0);
    		 if (ch1-'a'>=0&&ch1-'a'<=25)
     		     {ch1=(char)(ch1-'a'+'A');}
    		}
    	
    	int pos1= word.indexOf(ch1);
    	if (pos1==-1)
    		{println("There are no " + ch1 + "'s in the word.");
    	     chance--;
    	     println("You have " +chance+" guesses left.");}
    	else{
    		println("The word now looks like this");
    	}
    	}
    	
    	println("You lose");
	}

    private HangmanLexicon lex = new HangmanLexicon();
    private RandomGenerator rgen = RandomGenerator.getInstance();
}
