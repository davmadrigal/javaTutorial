package internal.main;

import internal.main.rotate.MyArraysExamples;

public class MainApp {
	
	
	private static MyArraysExamples myArrayExamples;
	
	public static void main(String[] args) {
		
		final Integer [] numbers = {1,2,3,4,5,6,7};
		
		// rotate array length n and 
		myArrayExamples = new MyArraysExamples();
		
		myArrayExamples.rotateArray(numbers,3);
		
	}

}
