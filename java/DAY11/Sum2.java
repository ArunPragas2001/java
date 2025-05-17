import java.util.Scanner;

class Sum2{
	
	
	public static void main(String[]args){
		
	int input=0;
	int sum=0;
	
	
	try{
	Scanner sc=new Scanner(System.in);
    
	
	for(int i=0; i<10; i++)
	{
	System.out.println("Enter number"+(i+1))	;
	input=sc.nextInt();	
	sum=sum+input;
	}
	}
	catch (Exception e){
		System.out.println("An Error Occured!");
		System.out.println("The Error is"+e.getMessage());
		}
	System.out.println("*************************************");
	System.out.println("Sum is="+sum );
	System.out.println("*************************************");
	}
	
	
}