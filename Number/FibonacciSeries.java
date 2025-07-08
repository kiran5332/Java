class FibonacciSeries 
{   
    public static void fiboSeries(int num){

        int n1=0,n2=1,n3;

        for(int i=0;i<num;i++){
            System.out.print(n1+" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        System.out.println();

    }
    
    public static void fiboRecursive(int num,int n1,int n2, int iter){
        
        if(iter>=num)
            return;
        
        System.out.print(n1+" ");
        
        fiboRecursive(num,n2,(n1+n2),++iter);

    }

	public static int fibo(int n){

		if(n<=1)
			return n;

		return fibo(n-1)+fibo(n-2);
	}

    public static void main(String[] args) 
    { 
		
		//printing first n numbers from series
        fiboSeries(10);
        //using recursion
        fiboRecursive(10,0,1,0);
        System.out.println();
		//for that single value
		System.out.println(fibo(10));

    }
}
