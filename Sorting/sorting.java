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
		mergeSort():
	}

	public static void mergeSort(int nums[], int start, int end) {
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
		int start = 0;
		int end = nums.length +1;
		mid = (start + end)/2;
		int a = nums.length/2;
		
		int leftHalf[] = new int[a];
		mergeSort(leftHalf);
		
		int b = nums.length - a;
		int rightHalf[] = new int [b];
		mergeSort(rightHalf);
		
		mergeSort(leftHalf, rightHalf);
	}

	private static int merge(int nums[]){
		for(int i =1 ; i < size - i; i = 2 * i){
			for(int j = 0; j < size - i ; j = j + 2){
				merge();
			}
		}
	}
	public static void quickSort(int nums[], int start, int end){
		int pivot = start;
		int j = nums.length();
		int i = nums.length();
		int temp = 0;
		while(i < nums.length()){
			while (j < nums.length()){
				if(nums[i] > nums[j]){
					quickSort(nums[i]);
					i++;
				}
				else if(nums[i] < nums[j]){
					temp = nums[i];
					nums [i] = nums[j];
					nums[j] = temp;
					j++;
				}
				else if(nums[i] == nums[j]){
					quickSort(nums[i]);
					j++;
					break;
				}
				break;
				quickSort();
			}
		}
		for (int j = 0; j <= nums.length(); j++){
			pivot = nums[j];
		}
	}
	
}
