class Student{
	
	private String name;
	private int exam1;
	private int exam2;
	private int exam3;
	
	
	public Student(String name, int exam1, int exam3)
	{
		this.name=name;
		this.exam1=exam1;
		this.exam2=exam2;
		this.exam3=exam3;
		
		
	}
	
	public void setExam1(int exam1){
		
		validateScore(exam1);
		this.exam1=exam1;
	}
	
	public void setExam2(int exam2){
		
		validateScore(exam2);
		this.exam1=exam1;
	}
	
	public void setExam3(int exam3){
		
		validateScore(exam1);
		this.exam1=exam1;
	}
	
	
	public String getName(){
		
		return name;
		
	}
	
	
	public int getexam1(){
	  return exam1;
	
	}
	
	public int getexam2(){
	  return exam2;
	
	}
	public int getexam3(){
	  return exam3;
	
	}
	
	public double calculateAverage(){
		return (exam1+exam2+exam3)/3.0;
		
	}
	
	private void validateScore(int Score)
	{
		if (score<0||score>100){
			throw new IllegalArgumentException("Marks must be between 1-100");
			
		}
		
	}
	
	public static void main(String []args){
		
		try{
			Student st=new Student("John",75,110,90);
			System.out.println("Name" + st.getName());
			System.out.println("Exam1" + st.getExam1());
			System.out.println("Exam1" + st.getExam2());
			System.out.println("Exam1" + st.getExam3());
			System.out.println("Average is="+student.calculateAverage());
		}
			catch(Exception e){
				System.out.println("Error"+e.getMessage());
			}
		}
	
    }		
	
	
	
	
