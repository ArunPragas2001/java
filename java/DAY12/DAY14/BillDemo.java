import java.util.*;

class Product{

private String brand;
private int unitPrice;


public Product(String brand, int unitPrice) {
    this.brand = brand;
    this.unitPrice = unitPrice;

public void setBrand(String brand)
{
this brand=brand;
}

public void setUnitPrice (int unirPrice){

this unitPrice=unitPrice;
}


public String getBrand(){

return brand;
}

public int getUnitPrice(){

    return unitPrice;
}


class Bill{
    list<BillEntry>billEntries=new ArrayList<>();

void addBillEntry(BillEntry billentry ){
   billEntries.add(billentry);
}

void printBill(){
    for(BillEntry e: billEntries){
     e.printBillEntry();
    }


}


int calculateTotal(){
int total=0;

for(BillEntry e:billEntries){

total+=e.calculateTotal()
}

}


class BillEntry{

    Product product;
    int quality;


    public BillEntry(Product product, int quantity)
    {
        this.product=product;
        this.quantity=quantity;
    }

    int getTotalPrice(){
       return product.getUnitPrice()*quantity;
    }
    
    void printBillEntry(){
    System.out.println("Product Name"+product.getBrand()+"Unit Price"+product.getUnitPrice()+"x"+quantity+"Total Price"+getTotalPrice());

    }
}

class BillDemo{
    static void print(String W){
        System.out.println(W);
    }
    static void printProduct(Product p){
        print("NAME"+p.getBrand+p.getUnitPrice());
    }
    
    public static void main(String[]args){
        print("Welcome to Demo Shop");
        print("Entering products...");

        Product milk=new Product("Diamond",140);
        print("Successfully Added");
        Product bread=new Product("Prima",160);
        print("Successfully Added");


        print ("Entering a new bill");


        BillEntry bill01=new BillEntry(milk,10);
        bill01.printBillEntry();


        Bill b=new Bill();
        b.addEntry()


    }




       
    }






}






}




    
}
