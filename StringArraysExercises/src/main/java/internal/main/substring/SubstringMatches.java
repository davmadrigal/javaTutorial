package internal.main.substring;

import org.apache.commons.lang.StringUtils;

public class SubstringMatches {
	
	//-----------------------------------------------------------------------
	  /**
	   * Counts how many times the substring appears in the larger String.
	   *
	   * A <code>null</code> or empty ("") String input returns <code>0</code>.
	   *
	   * <pre>
	   * StringUtils.countMatches(null, *)       = 0
	   * StringUtils.countMatches("", *)         = 0
	   * StringUtils.countMatches("abba", null)  = 0
	   * StringUtils.countMatches("abba", "")    = 0
	   * StringUtils.countMatches("abba", "a")   = 2
	   * StringUtils.countMatches("abba", "ab")  = 1
	   * StringUtils.countMatches("abba", "xxx") = 0
	   * </pre>
	   *
	   * @param str  the String to check, may be null
	   * @param sub  the substring to count, may be null
	   * @return the number of occurrences, 0 if either String is <code>null</code>
	   */
	  public int countMatches(String str, String sub) {
	      if (StringUtils.isEmpty(str) || StringUtils.isEmpty(sub) ) {
	          return 0;
	      }
	      int count = 0;
	      
	      int idx = 0;
	      while ((idx = str.indexOf(sub, idx)) != -1) {
	          count++;
	          idx += sub.length();
	      }
	      return count;
	  }
	  
	  private boolean customIsEmpty(String str) {
		  return str==null || str.length()==0;
	  }

}
