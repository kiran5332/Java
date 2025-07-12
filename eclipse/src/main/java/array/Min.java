package array;

public class Min{
	public static void min(int arr[] ) {
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) 
				min=arr[i];	
		}
		System.out.println(min);
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,10,20,40,20,10,50,60,60,50};
		min(arr);
	}

}
