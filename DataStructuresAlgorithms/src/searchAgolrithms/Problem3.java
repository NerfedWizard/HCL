/**
 * 
 */
package searchAgolrithms;

import java.util.Stack;

/**
 * @author loeln
 *
 *
 *
 *         given a string with a bunch of open and closed braces "{}" write a
 *         function which returns true if all open braces matchs all the closed
 *         braces returns false if they don't match
 * 
 *         {}}}{{{} = false
 * 
 *         recursive solution is the right answer to the problem
 * 
 */
public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(chackBraces("{{{}}}"));
		System.out.println(chackBraces("{{{}}}}"));
		System.out.println(chackBraces("}}}{{{"));
		System.out.println(chackBraces("{}}}{{{}"));
		System.out.println("Stack " + chackBracesWithStack("{{{}}}"));
		System.out.println("Stack " + chackBracesWithStack("{{{}}}}"));
		System.out.println("Stack " + chackBracesWithStack("}}}{{{"));
		System.out.println("Stack " + chackBracesWithStack("{}}}{{{}"));

	}

	private static boolean chackBraces(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '{') {
				count += 1;
			}
			if (input.charAt(i) == '}') {
				count -= 1;
			}
			if (count < 0) {
				return false;
			}
		}
		if (count == 0) {
			return true;
		}
		return false;
	}

	private static boolean chackBracesWithStack(String input) {

		Stack<Character> st = new Stack<Character>();
		for (char x : input.toCharArray()) {
			if (x == '{') {
				st.push(x);
			}
			if (x == '}') {
				try {
					st.pop();
				} catch (Exception e) {
					return false;
				}
			}
		}
		if (st.empty()) {
			return true;
		} else {
			return false;
		}
	}
}