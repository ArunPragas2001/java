import java.util.Scanner;
class shopDemo{

    static String description[]={"Bread","Milk Powder","Tooth paste"};
	static int unitPrice[]={160,1060,260};
	

	static byte [] itemBasketIndex =new byte[3];
    static int item basketQuantity==new int[3];
	
	
	
	
	static void getItems(){
            System.out.println("welcome to the Demo shop");
			System.out.println("Please select your item by entering the number");
			char userOption='y';
			int basketIndex=0; 
			do{
				
            for(int i=0; i<description.length;i++){
				 System.out.println("Enter"+i+"for"+description[i]);
			}
			
			
			      int itemIndex=sc.nextInt();
				  
				  System.out.println("You have chosen"+description[itemIndex]);
				  System.out.println("Unit price of"+description[itemIndex]+"is"+unitPrice[itemIndex]);
				  System.out.println("enter the quantity");
				  int numberOfUnits=sc.nextInt();
				  
				  
				  itemBasketIndex[basketIndex]=itemIndex;
				  
				  System.out.println("Enter y to continue,press any charactor to exit");
				  Scanner scl=new Scanner(System.in)
				  userOption=sc.nextline().charAt(0);//(char)sc.nextLine();
            }	
          			
	}
	 while(userOption=='y' && basketindex<3);
	}
	
	
	
	static void showBasket(){
		Sytem.out.println("No \t Item \t\t Unit Price \t Quantity \t Price");
		for(int i=0; i<basketIndex; i++){
			System.out.println(i+1+"\t" +description[itemBasketIndex[i]]+"\t\t"
			+unitPrice[itemBasketIndex[i]]+"\t" +itemBasketQuantity[i]+"\t"
			+itemBasketQuantity[i]*unitPrice[itemBasketIndex[i]]
			);
			
		}
		
	}
	 
    static void main(String args[]){
		getItems();
		
	}




}