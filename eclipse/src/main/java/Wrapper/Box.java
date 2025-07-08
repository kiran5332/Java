package Wrapper;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Boxing
		Byte b = new Byte((byte)10);
		Short s = new Short((short)20);
		Integer i = new Integer(30);
		Float f = new Float(10.5f);
		Double d = new Double(10.35);
		Long l = new Long((long)10.4643267);
		Boolean b1 = new Boolean(false);
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(l);
		System.out.println(b1);
		
		//Un-Boxing
		byte b2 = b.byteValue();
		short s2 = s.shortValue();
		int i2 = i.intValue();
		float f2 = f.floatValue();
		double d2 = d.doubleValue();
		long l2 = l.longValue();
		boolean b3 = b1.booleanValue();
		
		System.out.println(b2);
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(l2);
		System.out.println(b3);
		
	}

}
