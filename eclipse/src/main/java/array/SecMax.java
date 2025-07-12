package array;

public class SecMax{
	public static void secMax(int arr[] ) {
		int max=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secmax=max;
				max=arr[i];	
			}else if(arr[i]>secmax && arr[i]!=max) 
				secmax=arr[i];
			
		}
		System.out.println(max);
		System.out.println(secmax);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,10,20,40,20,10,50,60,60,50};
		secMax(arr);
	}

}
