/**
 * 
 */
package syeda;

import java.util.Scanner;

/**
 * @author 323211557
 *
 */
public class sorting {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("String, int or double?");
		String ans = scn.nextLine();
		if(ans.equalsIgnoreCase("String")){
			
		}
		else if(ans.equalsIgnoreCase("int")){
			
		}
		else if(ans.equalsIgnoreCase("double")){
			
		}
//		int size = scn.nextInt();
//		int nums[] = new int [size];
//		for(int i = 0; i < size; i++){
//			nums[i] = scn.nextInt();
//		}
		//mergeSort(nums[size]);
	}

	public static void mergeSort(int nums[]) {
		Scanner scn = new Scanner (System.in);
		int size = scn.nextInt();
		int nums[] = new int [size];
		for(int i = 0; i < size; i++){
			nums[i] = scn.nextInt();
		}
		int counter = 0;
		if(counter == 1){
			for(int i = 0; i < nums.length; i++){
				System.out.println(nums[i]);
			}
		}
		int rightsize = size%2;
		if(nums.length == 0){
			return;
		}
		int a = nums.length/2;
		mergeSort(int nums);
		int a = nums.length/2;
	}

	private static int merge(int nums[]){
		for(int i =1 ; i < size - i; i = 2 * i){
			for(int j = 0; j < size - i ; j = j + 2){
				merge();
			}
		}
	}
	
}
