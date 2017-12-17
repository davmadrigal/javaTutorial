package internal.main;

import internal.main.anagrams.AnagramCheck;
import internal.main.anagrams.AnagramGeneration;
import internal.main.rotate.MyArraysExamples;

public class MainApp {	
	
	private static MyArraysExamples myArrayExamples;
	
	private static AnagramGeneration myAanagran;
	
	private static AnagramCheck myAnagramCheck;
	
	public static void main(String[] args) {
		
		final Integer [] numbers = {1,2,3,4,5,6,7};
		
		// rotate array length n and 
		myArrayExamples = new MyArraysExamples();
		
		myAanagran = new AnagramGeneration();
		
		myAnagramCheck = new AnagramCheck();
		
		//myArrayExamples.rotateArray(numbers,3);
		
		// myArrayExamples.rotateArray2(numbers,2);
		
		myAanagran.perm1("ab");
		
//		System.out.println("Are equals?: "+myAnagramCheck.isAnagram("abcd", "cdba"));
		
	}

}
