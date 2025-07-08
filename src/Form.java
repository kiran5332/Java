class Form
{
	String name;
	char gender;
	long phNo;
	String city;

	Form(){
		System.out.println("No argument constructer");
	}

	Form(String name){
		this.name=name;
		System.out.println("Const 1");
	}

	Form(String name,char gender){
		this(name);
		this.gender=gender;
		System.out.println("Const 2");
	}

	Form(String name,char gender,long phNo){
		this(name,gender);
		this.phNo=phNo;
		System.out.println("Const 3");
	}
	
	Form(String name,char gender,long phNo,String city){
		this(name,gender,phNo);
		this.city=city;
		System.out.println("Const 4");
	}
	
}
