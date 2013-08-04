/*
 * File: HangmanCanvas.java
 * ------------------------
 * This file keeps track of the Hangman display.
 */

import java.awt.Color;

import acm.graphics.*;

public class HangmanCanvas extends GCanvas {

/** Resets the display so that only the scaffold appears */
	public void reset() {
		removeAll();
		GLine line1 = new GLine(getWidth()/2,getHeight()*0.1, getWidth()/2, getHeight()*0.1 + ROPE_LENGTH);
		add(line1);
		GLine line2 = new GLine(getWidth()/2-BEAM_LENGTH,getHeight()*0.1, getWidth()/2,getHeight()*0.1);
		add(line2);
		GLine line3 = new GLine(getWidth()/2-BEAM_LENGTH,getHeight()*0.1,getWidth()/2-BEAM_LENGTH,getHeight()*0.1+SCAFFOLD_HEIGHT);
		add(line3);
		}

/**
 * Updates the word on the screen to correspond to the current
 * state of the game.  The argument string shows what letters have
 * been guessed so far; unguessed letters are indicated by hyphens.
 */
	public void displayWord(String word) {
		GRect rect = new GRect(0,getHeight()*0.87, getWidth(), getHeight()*0.05);
		rect.setFilled(true);
		rect.setFillColor(Color.lightGray);
		add (rect);
		GLabel wordlabel = new GLabel(word, getWidth()/2, getHeight()*0.9);
		add (wordlabel);
	}

/**
 * Updates the display to correspond to an incorrect guess by the
 * user.  Calling this method causes the next body part to appear
 * on the scaffold and adds the letter to the list of incorrect
 * guesses that appears at the bottom of the window.
 */
	public void noteIncorrectGuess(char letter, int chance) {
		String wrongLetters ="";
		wrongLetters += letter;
		GLabel wordlabe2 = new GLabel(wrongLetters, getWidth()/2+80-chance*10, getHeight()*0.95);
		add (wordlabe2);
		
		switch (chance){
			case 7:
				GOval oval= new GOval(getWidth()/2-HEAD_RADIUS/2, getHeight()*0.1 + ROPE_LENGTH, HEAD_RADIUS, HEAD_RADIUS);
				add(oval);
				break;
			case 6:
				GOval oval6= new GOval(getWidth()/2-HEAD_RADIUS/2, getHeight()*0.1 + ROPE_LENGTH, HEAD_RADIUS, HEAD_RADIUS);
				add(oval6);
				GLine line = new GLine(getWidth()/2,getHeight()*0.1+1.5*HEAD_RADIUS, getWidth()/2,getHeight()*0.1+HEAD_RADIUS+ BODY_LENGTH);
				add(line);
				break;
		}
	}

/* Constants for the simple version of the picture (in pixels) */
	private static final int SCAFFOLD_HEIGHT = 360;
	private static final int BEAM_LENGTH = 144;
	private static final int ROPE_LENGTH = 18;
	private static final int HEAD_RADIUS = 36;
	private static final int BODY_LENGTH = 144;
	private static final int ARM_OFFSET_FROM_HEAD = 28;
	private static final int UPPER_ARM_LENGTH = 72;
	private static final int LOWER_ARM_LENGTH = 44;
	private static final int HIP_WIDTH = 36;
	private static final int LEG_LENGTH = 108;
	private static final int FOOT_LENGTH = 28;

}
