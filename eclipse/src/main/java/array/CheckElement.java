package array;

public class CheckElement {
	
	public static boolean check(int[] arr,int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n)
				return true;
		}
		return false;
	}
	public static void main(String [] args) {
		int arr[]= {34,56,67,89,23};
		System.out.println(check(arr,89));
	}
}
