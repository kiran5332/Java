package array;

import java.util.Arrays;

public class Reverse {
	public static int[] reverse(int arr[]){
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			arr[left]=arr[left]+arr[right];
			arr[right]=arr[left]-arr[right];
			arr[left]=arr[left]-arr[right];
			left++;
			right--;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,5,6,0};
		System.out.println(Arrays.toString(reverse(arr)));
		
	}
}
