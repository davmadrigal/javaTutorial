package internal.main;

import internal.main.anagrams.AnagramCheck;
import internal.main.anagrams.AnagramGeneration;
import internal.main.fibonacci.Fibonacci;
import internal.main.rotate.MyArraysExamples;
import internal.main.substring.SubstringMatches;

public class MainApp {	
	
	private static MyArraysExamples myArrayExamples;
	
	private static AnagramGeneration myAanagran;
	
	private static AnagramCheck myAnagramCheck;
	
	private static SubstringMatches substringMatches;
	
	private static Fibonacci fibbonaci;
	
	public static void main(String[] args) {
		
		final Integer [] numbers = {1,2,3,4,5,6,7};
		
		substringMatches = new SubstringMatches();
		
		// rotate array length n and 
		myArrayExamples = new MyArraysExamples();
		
		myAanagran = new AnagramGeneration();
		
		fibbonaci = new Fibonacci();
		
		//myAnagramCheck = new AnagramCheck();
		
		//myArrayExamples.rotateArray(numbers,3);
		
		// myArrayExamples.rotateArray2(numbers,2);
		
		//myAanagran.perm1("ab");
		
//		System.out.println("Are equals?: "+myAnagramCheck.isAnagram("abcd", "cdba"));
		
	//	System.out.println(substringMatches.countMatches("la vida esta siendo una lata", " la "));
		
		
		for(int i=0;i<5;i++) {
		System.out.println(fibbonaci.fibbonaci(i));
		
		}
		
		int fibMemo[] = new int[10];
		
		for (int i=0;i<10;i++) {
			System.out.println(fibMemo[i]);
		}
	}

}
