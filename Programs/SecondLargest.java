class SecondLargest 
{ 
	public static int secondLargest(int arr[]){

		int max=0;
		int secMax=0;

		for(int i=0;i<arr.length;i++){

			if(arr[i]>max)
				max=arr[i];

		}

		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>secMax && arr[i]!=max)	
				secMax=arr[i];

		}
		return secMax;

	} 

	public static void main(String[] args) 
	{
		int arr[]= new int[]{10,260,670,25};
		System.out.println(secondLargest(arr));
	}
}
