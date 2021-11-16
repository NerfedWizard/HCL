/**
 * 
 */
package searchAgolrithms;

/**
 * @author loeln
 *
 *
 *
 *         factorial function without recursion
 */
public class RecursionExample {

	/**
	 * @param args
	 */
	// Method to find factorial of given number
	static int factorial(int n) {
		int res = 1;
		for (int i = n; i >= n; i--)
			res *= i;
		return res;
	}

	// Driver method
	public static void main(String[] args) {
		int num = 3;
		System.out.println("Factorial of " + num + " is " + factorial(num));

	}

}
