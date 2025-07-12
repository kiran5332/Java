package array;

public class Max{
	public static void max(int arr[] ) {
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) 
				max=arr[i];	
		}
		System.out.println(max);
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,10,20,40,20,10,50,60,60,50};
		max(arr);
	}

}
