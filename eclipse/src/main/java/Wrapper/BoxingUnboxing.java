package Wrapper;

public class BoxingUnboxing {

	public static void main(String [] args) {
		int a=10;
		Integer i = new Integer(a);//boxing
		System.out.println(a);
		System.out.println(i);
		int a1=i.intValue();
		System.out.println(a1);//Unboxing
		
		Integer auto = 20;//autoBoxing
		int autoUn =auto; //autoUnBoxing
		System.out.println(auto);
		System.out.println(autoUn);
	}
}
