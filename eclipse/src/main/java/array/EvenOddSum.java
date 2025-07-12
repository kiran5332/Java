package array;

public class EvenOddSum {

public static boolean sum(int[] arr){
		
		int evenSum=0,oddSum=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
				evenSum+=arr[i];
			else
				oddSum+=arr[i];
		}
		 return evenSum==oddSum;
	}

	public static void main(String[] args) {
		
		int[] arr ={10,20,17,15};
		System.out.println(sum(arr));
			
			
	}

}
