package array;

public class MissingElement {
	public static int find(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]!=1)
				return arr[i]+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,5,6};
		System.out.println(find(arr));	
	}
}
