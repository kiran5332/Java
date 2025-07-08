package Wrapper;

public class StringToPremitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i = "1234";
		int i1 = Integer.parseInt(i);
		System.out.println(i1);
		
		String b = "10";
		byte b1 = Byte.parseByte(b);
		System.out.println(b1);
		
		String s = "1";
		short s1 = Short.parseShort(s);
		System.out.println(s1);
		
		String f = "12.34f";
		float f1 = Float.parseFloat(f);
		System.out.println(f1);
		
		String d = "12.345";
		double d1 = Double.parseDouble(d);
		System.out.println(d1);
		
//		String l = "12.3459999999L";
//		long l1 = Long.parseLong(l);
//		System.out.println(l1);
		
		String b2 = "true";
		boolean b3 = Boolean.parseBoolean(b2);
		System.out.println(b3);
	}

}
