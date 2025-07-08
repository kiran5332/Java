package Wrapper;

public class AutoWrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Auto boxing
		Byte b = (byte)10;
		Short s = (short)20;
		Integer i = 30;
		Float f = 10.5f;
		Double d = 10.35;
		Long l = (long)10.4643267;
		Boolean b1 = false;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(l);
		System.out.println(b1);
		
		//Auto UnBoxing
		byte b2 = b;
		short s2 = s;
		int i2 = i;
		float f2 = f;
		double d2 = d;
		long l2 = l;
		boolean b3 = b1;
		
		System.out.println(b2);
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(l2);
		System.out.println(b3);

	}

}
