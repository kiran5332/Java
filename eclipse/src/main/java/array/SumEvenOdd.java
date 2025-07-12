package array;

public class SumEvenOdd {
	
	public static void sum(int[] arr){
		
		int evenSum=0,oddSum=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
				evenSum+=arr[i];
			else
				oddSum+=arr[i];
		}
		System.out.println("Even Sum = "+evenSum);
		System.out.println("Odd Sum = "+oddSum);
	}

	public static void main(String[] args) {
		
		int[] arr ={10,20,35,40};
		sum(arr);
			
			
	}

}


