//Write a java programme to create a car class with private class model.
//provide a getter and setter method for the model.
//In the Main class, Create an Object of car,set the model
// name toyota corolla and print it.


class Car{
private String name;

//Getter

public String getName(){

return name;

}

//setter
public void setName(String newName)
{

this.name=newName;


}
}


public class Main
{
public static void main(String args[])

{

   car p1=new car();
   p1.setName("Toyota");
   System.out.println(p1.getName());


}
}

