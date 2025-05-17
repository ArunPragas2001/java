class Student{
	int marks;
	String Name;
	
	Student(){
		System.out.println("Creating a Student object");
		Name="Default Name";
		
	}
	Student(String n, int m)
	{   
		System.out.println("Creating a Student object name "+n+" marks "+m);
		Name=n;
		marks=m;
			
	}
}

class Printer{
	void print(String text){
	System.out.println(text);
	}
}

class App{
	public static void main(String[] a ){
		Printer p=new Printer();
		p.print ("Welcome to Demo class App");
		
		Student s1=new Student();
		//s1.Name="Nethu ";
		s1.marks=100;
		
		
	    p.print ("Name is "+s1.Name);
		p.print ("Marks is "+s1.marks);
		
		
		 Student s2=new Student("Bob",56);
		 //s2.Name="Arun Pragas";
		 //s2.marks=100;
		 
		 
		p.print ("Name is "+ s2.Name);
		p.print ("Marks is "+ s2.marks);
		
      	
		
    }
}	