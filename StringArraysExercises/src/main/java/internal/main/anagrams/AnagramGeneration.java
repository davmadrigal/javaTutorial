package internal.main.anagrams;

public class AnagramGeneration {
	
    // print n! permutation of the characters of the string s (in order)
    public void perm1(String s) { 
    	
    	perm1("", s); 
    	}
    private void perm1(String prefix, String s) {
        int n = s.length();
        if (n == 0) System.out.println("program: "+prefix);
        else {
            for (int i = 0; i < n; i++) {
            		System.out.println(prefix + s.charAt(i));
            		System.out.println(s.substring(0, i));
            		System.out.println(s.substring(i+1, n));
               perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, n));
            }
        }

    }

}
