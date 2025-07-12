package array;

public class SecMin {
	public static void secMin(int arr[] ) {
		int min=Integer.MAX_VALUE;
		int secmin=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secmin=min;
				min=arr[i];	
			}else if(arr[i]<secmin && arr[i]!=min) 
				secmin=arr[i];
			
		}
		System.out.println(min);
		System.out.println(secmin);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,10,20,40,20,10,50,60,60,50};
		secMin(arr);
	}

}
