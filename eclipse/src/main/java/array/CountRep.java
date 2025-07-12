package array;

public class CountRep {

	public static int count(int[] arr,int n) {
		int rep=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n)
				rep++;
		}
		return rep;
	}
	public static void main(String [] args) {
		int arr[]= {34,56,67,89,231,1,1};
		System.out.println(count(arr,1));
	}

}
