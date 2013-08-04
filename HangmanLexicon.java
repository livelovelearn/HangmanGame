/*
 * File: HangmanLexicon.java
 * -------------------------
 * This file contains a stub implementation of the HangmanLexicon
 * class that you will reimplement for Part III of the assignment.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import acm.util.*;

public class HangmanLexicon {
	
	ArrayList<String> pool = new ArrayList<String>();

	public HangmanLexicon() {

		try {
			BufferedReader rd = getFileToRead();

			while (true) {
				String line = rd.readLine();
				if (line == null)
					break;
				pool.add(line);
				
			}

			rd.close();
		} catch (IOException ex) {
			throw new ErrorException(ex);
		  }
	}

	private BufferedReader getFileToRead() {

		BufferedReader rd = null;
		while (rd == null) {
			try {
				String filename = "HangmanLexicon.txt";
				rd = new BufferedReader(new FileReader(filename));
			} catch (IOException ex) {
				System.out.println("Can't open that file.");
			}
		}
		return rd;
	}

	/** Returns the number of words in the lexicon. */
	public int getWordCount() {
		return pool.size();
	}

	/** Returns the word at the specified index. */
	public String getWord(int index) {
		pool.get(index);
		}
	};
}
