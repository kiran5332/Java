package array;

import java.util.Arrays;

public class revMerge {
	public static int[] merge(int arr1[],int arr2[]) {
		int ans[] = new int[arr1.length+arr2.length];
		int arr1P=arr1.length-1;
		int arr2P=arr2.length-1;
		
		for(int i=0;i<ans.length;i++){
			if(i<arr1.length){
				ans[i]=arr1[arr1P];
				arr1P--;
			}else {
				ans[i]=arr2[arr2P];
				arr2P--;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {10,20,30,40};
		int arr2[] = {50,60,70,78};
		System.out.println(Arrays.toString(merge(arr1,arr2)));
	}
}
