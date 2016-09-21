/**
 *  Given n (number of pieces of pie) and k (number of people) and the minimum
 number of pieces that can be taken, the number of ways the pie can be distributed
 is:
    
     otherwise it is the sum of the ways of (n-i, k-1, i) where i goes from
                min to n/k (inclusive)

 an example: pi(9,4,1)
   n = 9, k = 4 and min = 1
   for this the answer is calculated as follows:
       the first person could take 1 piece leaving us the task of finding the ways
                with now 8 pieces (9-1), 3 people and a min of 1 (= pi(8,3,1))
     the first person could take 2 pieces leaving us the task of finding the ways
               with now 7 pieces (9-2), 3 people and a min of 2 (= pi(7,3,2))
      the first person could NOT take 3 pieces (or more)_because that would leave 6
               pieces for 3 people and since the first person took 3, they
               would have to take at least 3 themselves and that's 9 not 6 pieces!
                in general, the most the first person person can take is
                                               n/k (eg 9/4 = 2)
 */
package syeda;
import java.util.Scanner;

/**
 * @author Maryam Syeda
 *
 */
public class PiDay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		// Try and enter a try catch exception error for the user's input

		int k = Integer.parseInt(scn.nextLine()); // Number of pieces of pie
		int counter =  Integer.parseInt(scn.nextLine()); // To test if the number of people
		int n; // Number of mathematicians in the line.
		
		if (counter == 0){
			System.out.println("No one gets pie");
		}
		
		if (counter < 0){
			System.out.println("Please use positive numbers.");
		}

		while (counter > 0) {
			if (counter == 1){
				// When n is one, n gets all of the pie
				System.out.println("Since there is only one person, they can have all the pieces.");
				System.out.println("More specifically, they can have, " + k);
			}
			else if (k == counter) {
				// When n is equal to k, everyone gets only one piece of pie.
				System.out.println("Everyone gets only one piece of pie");
						
			}
			pieDay(counter, k);	
		}


	}

	/**
	 * 
	 * @param counter
	 * @param k
	 * @return
	 */

	public static int pieDay(int counter, int k){
		int [] math;
		math = new int [counter];
		
		for (int l = 0; l <= counter; l++) {
			math[l];
		}
			
		return k;

	}

}
