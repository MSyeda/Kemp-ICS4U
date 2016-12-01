package sorting2;

import java.util.Scanner;

public class SORTING {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the number of allocations in your array: ");
		int nums = scn.nextInt();
		int[] arr = new int[nums];
		System.out.println("Enter your objects as prompted: ");
		for(int i = 0; i < nums; i ++){
			arr[i] = scn.nextInt();
		}

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
		mergeSort(arr, nums);
		System.out.println();

	}

	public static void mergeSort(int[] arr, int[] rightHalf, int a) {

		int counter = 0;
		if(counter <= 1){
			for(int i = 0; i < arr.length; i++){
				System.out.println(arr[i]);
			}
		}
		//int rightsize = rightHalf%2;
		if(arr.length == 0){
			return;
		}
		partition(arr);
		
		
		
	}
	
	private static int partition(int[] arr){
		int c = 0;
		int counter = 3;
		do{
		int start = 0;
		int end = arr.length +1;
		int mid = (start + end)/2;
		int a = arr.length/2;
		int leftHalf[] = new int[a];
		//mergeSort(leftHalf, a);
		
		int b = arr.length - a;
		int rightHalf[] = new int [b];
		//mergeSort(rightHalf, b);
		
		//mergeSort(leftHalf, rightHalf);
		//merge(arr, rightHalf);
		}
		while(c <= counter);
		return(a);
	}
	
	private static int merge(int arr[], int nums){
		for(int i =1 ; i < nums - i; i = 2 * i){
			for(int j = 0; j < nums - i ; j = j + 2){
				merge();
			}
		}
	}
}
