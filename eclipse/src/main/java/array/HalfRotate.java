package array;

import java.util.Arrays;

public class HalfRotate {
	
	public static int[] rotate(int[] arr) {
		int mid=arr.length/2;
		int last=arr.length-1;
		while(mid<last) {
			int temp=arr[mid];
			arr[mid]=arr[last];
			arr[last]=temp;
			mid++;
			last--;
		}
		return arr;
	}
	public static void main(String [] args) {
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(rotate(arr)));
	}
}
