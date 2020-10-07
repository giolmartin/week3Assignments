/**
 * File: DeletingCharacters.java
 * -------------------------------------
 * This class can go through a string and remove the given character.
 * 
 */
import acm.program.*;
import acm.util.*;

public class DeletingCharacters extends ConsoleProgram{

	public void run() {
		System.out.println(removeAllOccurrences("This is a test", 't'));
		System.out.println(removeAllOccurrences("Summer is here!", 'e'));
		System.out.println(removeAllOccurrences("----0----", '-'));
		System.out.println(removeAllOccurrences("00000L000i0f0e0 0i0s0 0a0w0e000s0o0m0e0!000", '0'));
	}
	
	/** This method receives a string and the char that wants to be removed. 
	 * It finds the index of the first char and removes it, looping until no more 
	 * chars are found. */
	
	private String removeAllOccurrences(String input, char remove) {
		String result= "";
		int index = input.indexOf(remove);	
		while(index != -1) {
			index = input.indexOf(remove);
			if (index != -1) {
			input = input.substring(0,index) + input.substring(index + 1, input.length());
			}
		}
		return input;
	}
}
