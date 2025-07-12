package array;

public class CountEvenOdd {

	public static void sum(int[] arr){
		
		int evenCount=0,oddCount=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
				evenCount++;
			else
				oddCount++;
		}
		System.out.println("Even Count = "+evenCount);
		System.out.println("Odd Count = "+oddCount);
	}

	public static void main(String[] args) {
		
		int[] arr ={10,20,35,40,1,78,9,89,5};
		sum(arr);
			
			
	}

}
