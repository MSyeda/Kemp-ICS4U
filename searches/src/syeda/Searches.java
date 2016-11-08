/**
 * 
 */
package syeda;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * @author Maryam Syeda
 *
 */
public class Searches {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0; i <= a.length; i++){
			System.out.println(i);
		}
		System.out.println("Enter target: ");
		int target = scn.nextInt();
		int startIndex = 0;
		int endIndex = a.length -1;
		int midIndex = (startIndex + endIndex) / 2;
	}
	/**
	 * 
	 * @param a
	 * @param target
	 * @return
	 */
	public int binarySearch (int[]a, int target){
		return binarySearch(a, target, 0, a.length -1);
	}
	private int binarySearch(int[]a, int target, int start, int end, int midIndex){
		for (int i = 0; i < a.length; i++){
			if (start > end){
				return -1;
			}
			else if (midIndex == target) {
				return(i);
			}
			return target;
		}
		return midIndex;
	}
	/**
	 * 
	 * @param a
	 * @param target
	 * @return
	 */
	public static double binarySearch(double[]a, double target){
		return target;

	}
	/**
	 * 
	 * @param a
	 * @param target
	 * @return
	 */
	public static int linearSearch(int[]a, int target){
		return target;
	}
	/**
	 * 
	 * @param a
	 * @param target
	 * @return
	 */
	public static double linearSearch(int[]a, double target){
		return target;
	}
}
