/**
 * 
 */
package searchAgolrithms;

/**
 * @author loeln
 * 
 * 
 *         Write a function which takes a string and returns a boolean true if
 *         its a palindrome false if its not a palindrome
 * 
 *
 */
public class pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(palindrome("MoM"));
		System.out.println(palindrome("CaT"));
	}

	private static boolean palindrome(String check) {
		String temp = "";
		for (int i = check.length() - 1; i >= 0; i--) {
			temp = temp + check.charAt(i);
		}
		if (check.equals(temp)) {
			return true;
		}
		return false;
	}

}
