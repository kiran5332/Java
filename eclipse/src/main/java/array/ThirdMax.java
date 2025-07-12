package array;

public class ThirdMax {
	public static void thirdMax(int arr[] ) {
		int max=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
		int thirdmax=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				thirdmax=secmax;
				secmax=max;
				max=arr[i];	
			}else if(arr[i]>secmax && arr[i]!=max) {
				thirdmax=secmax;
				secmax=max;
			}else if(arr[i]>thirdmax && arr[i]!=max && arr[i]!=secmax ) {
				thirdmax=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(secmax);
		System.out.println(thirdmax);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,40,20,10,50,60,60,50};
		thirdMax(arr);
	}

}
