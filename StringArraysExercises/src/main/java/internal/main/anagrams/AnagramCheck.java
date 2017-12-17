package internal.main.anagrams;

import java.util.Arrays;

public class AnagramCheck {
	
	// check if two strings are anagrams
	
	public boolean isAnagram(String s1, String s2) {
		
		if (s1 == null || s2 == null) {
			throw new IllegalArgumentException("Parameters cannot be null");
		}
		
		if (s1.length()!= s2.length()) {
			return false;
		}
		
		char[] array1 = s1.toCharArray();
		char[] array2 = s2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		return new String(Arrays.toString(array1)).equals(Arrays.toString(array2));
	}

}
