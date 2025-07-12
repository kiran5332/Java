package array;

import java.util.Arrays;

public class PositiveArray {
	public static int[] positive(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) 
				arr[i]=arr[i]*(-1);
			
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,-2,3,-5,6,-340,0};
		System.out.println(Arrays.toString(positive(arr)));	
	}

}
