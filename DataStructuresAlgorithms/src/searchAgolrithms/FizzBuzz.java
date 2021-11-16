package searchAgolrithms;

/**
 * Write a function when you pass a number to the function it will loop from 1
 * to that number and if it sees 3 print fizz and where it sees 5 it prints Buzz
 * and finally it sees 15 it prints FizzBuzz if not it will print that number
 */
public class FizzBuzz {
	public static void main(String args[]) {
		int n = 100;

		// loop for 100 times
		for (int i = 1; i <= n; i++) {
			// number divisible by 15(divisible by
			// both 3 & 5), print 'FizzBuzz' in
			// place of the number
			if (i % 15 == 0)
				System.out.print("FizzBuzz" + " ");
			// number divisible by 5, print 'Buzz'
			// in place of the number
			else if (i % 5 == 0)
				System.out.print("Buzz" + " ");

			// number divisible by 3, print 'Fizz'
			// in place of the number
			else if (i % 3 == 0)
				System.out.print("Fizz" + " ");

			else // print the numbers
				System.out.print(i + " ");
		}
	}
}
