/**
 * 
 */
package searchAgolrithms;

/**
 * @author loeln
 * 
 * 
 *         Write a function that takes two array of same size the third
 *         parameter is one string Expectation: it returns the corresponding
 *         value of the string if it exists
 * 
 */
public class AssociativeArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] array1 = { "Fruit", "Vegetable", "Fish", "Mammal" };
		String[] array2 = { "mango", "carrot", "catfish", "ape" };

		findData(array1, array2, "vegeTable");
	}

	/**
	 * @param array1 - Groups
	 * @param array2 - members
	 * @param key    - find members of that group
	 */
	private static void findData(String[] array1, String[] array2, String key) {
		for (int i = 0; i < array1.length; i++) {
			if (key.toLowerCase().equals(array1[i].toLowerCase())) {
				System.out.println(array2[i]);
			}
		}

	}

}
