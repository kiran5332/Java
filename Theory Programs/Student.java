class Student 
{
	String name;
	String degree;
	String coll;
	int age;

	Student(){
		System.out.println("From no argument constructer");
		System.out.println(this);
	}

	public void displayStudent(){
		String name ="Raja";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(age);
		System.out.println(coll);
		System.out.println(degree);
	}
}
