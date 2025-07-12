package array;

import java.util.Arrays;

public class ReverseCopy {
	public static int[] reverse(int arr[]){
		int revCopy[] = new int[arr.length];
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			revCopy[left]=arr[right];
			revCopy[right]=arr[left];
			left++;
			right--;
		}
		return revCopy;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,5,6,0};
		System.out.println(Arrays.toString(reverse(arr)));
		
	}
}
