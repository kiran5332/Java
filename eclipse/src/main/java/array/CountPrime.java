package array;

public class CountPrime {
	
	public static boolean isPrime(int n) {
		if(n==1)
			return false;
		int num=2;
		while(num<=(n/2)) {
			if(n%num==0)
				return false;
			num++;
		}
		return true;
	}
	public static int countPrime(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i]))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,45,35,67};
		System.out.println(countPrime(arr));
	}

}
