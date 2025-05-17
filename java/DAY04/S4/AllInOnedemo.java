class AllInOnedemo{
	
	
	static void print(String s){
		System.out.println(s);
	
	}
	
	
public static void main(String[]args){
   Student s1=new Student("Charle");
   Student s2=new Student("Arun",80);
   Student s3=new Student("Don",55);
   
   System.out.println("Name of the student s1 is"+s1.name+ ", Marks="+s1.marks );
   System.out.println("Name of the student s2 is"+s2.name+ ", Marks="+s2.marks );
   System.out.println("Name of the student s3 is"+s3.name+ ", Marks="+s3.marks);
  
  
  
   Car c1= new Car("Mazda s3");
   Car c2= new Car("Nissan Navara");
   print("Model of the car c1 is"+c1.getModel());
   print("Model of the car c2 is"+c2.getModel());
   
   
  }



}