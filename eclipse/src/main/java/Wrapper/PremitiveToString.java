package Wrapper;

public class PremitiveToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i1 = String.valueOf((byte)10);
		String i2 = String.valueOf((short)20);
		String i3 = String.valueOf(30);
		String i4 = String.valueOf(10.35f);
		String i5 = String.valueOf((long)10.8654);
		String i6 = String.valueOf(103.14);
		String i7 = String.valueOf('a');
		String i8 = String.valueOf(false);
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		System.out.println(i7);
		System.out.println(i8);
	}

}
