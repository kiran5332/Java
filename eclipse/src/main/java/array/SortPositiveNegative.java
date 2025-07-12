package array;

import java.util.Arrays;

public class SortPositiveNegative {
	public static int[] sort(int arr[]) {
		int left=0;
		int right=arr.length-1;
		for(int i=0;i<right;i++) {
			int temp;
			if(arr[i]>0) {
				temp=arr[left];
				arr[left]=arr[i];
				arr[i]=temp;
				left++;
			}else {
				temp=arr[right];
				arr[right]=arr[i];
				arr[i]=temp;
				right--;
			}
				
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,-3,5,-6,0,-45,-7,89,-32};
		System.out.println(Arrays.toString(sort(arr)));
		
	}
}
