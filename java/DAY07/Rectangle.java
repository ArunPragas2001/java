class Rectangle
{
	
  int height;
  int width;
  
  
  Rectangle(){
	  height=2;
	  width=2;
	  
  }

   Rectangle(int height, int width){
	   this.height=height;
	   this.width=width;
	   System.out.println("Just Created a rectangle with size w*h"+height+"*"+width);
	   print(width,height);
	   
   }


	
	 
	void print(int width, int height)
  {
	
	for(int i=0; i<height; i++)
	{
		for(int j=0; j<width; j++)
		{
		
         System.out.print("*");		
			
			
		}
		
		System.out.println();
	}		
	
  }
}

class Main
{
	
public static void main(String []args)	
  {
	Rectangle r1= new Rectangle(3,5);
	//r1.print(3,4);
	Rectangle r2= new Rectangle(4,5);
     //r2.print(5,4);
	Rectangle r3= new Rectangle(4,5);
	 
	System.out.println("r1:Height"+r1.height+", width"+r1.width) ;
	System.out.println("r2:Height"+r2.height+", width"+r2.width) ;
	System.out.println("r3:Height"+r1.height+", width"+r1.width) ;
  }
  
}