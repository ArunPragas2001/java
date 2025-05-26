import java.util.*;

class Product{

private String brand;
private int unitPrice;

public Product(String brand, int unitPrice) {
    this.brand = brand;
    this.unitPrice = unitPrice;
}
public void setBrand(String brand)
{
this.brand=brand;
}

public void setUnitPrice (int unitPrice){

this.unitPrice=unitPrice;
}


public String getBrand(){

return brand;
}

public int getUnitPrice(){

    return unitPrice;
}
}

class Bill{
     static List<BillEntry>billEntries=new ArrayList<>();

void addBillEntry(BillEntry billentry ){
   billEntries.add(billentry);
}

void printBill(){
    for(BillEntry e: billEntries){
     e.printBillEntry();
    }


}


static int calculateTotal(){
int total=0;

for(BillEntry e:billEntries){

 total+=e.getTotalPrice();
}
return total;

}


static class BillEntry{

    Product product;
    int quantity;


    public BillEntry(Product product, int quantity)
    {
        this.product=product;
        this.quantity=quantity;
    }

    int getTotalPrice(){
       return product.getUnitPrice()*quantity;
    }
    
    void printBillEntry(){
    String quantity=null;
    System.out.println("Product Name"+product.getBrand()+"Unit Price"+product.getUnitPrice()+"x"+quantity+"Total Price"+getTotalPrice());

    }
}

static class BillDemo{
    static void print(String W){
        System.out.println(W);
    }
    void printProduct(Product p){
        print("NAME"+p.getBrand()+p.getUnitPrice());
    }
    
    /**
     * @param args
     */
    public static void main(String[]args){
        print("Welcome to Demo Shop");
        print("Entering products...");

        Product milk=new Product("Diamond",140);
        print("Successfully Added");
        Product bread=new Product("Prima",160);
        print("Successfully Added");


        print ("Entering a new bill");

        Bill b=new Bill();
        BillEntry bill01=new BillEntry(milk,10);
        bill01.printBillEntry();


    
        b.addBillEntry(bill01);
        b.addBillEntry(new BillEntry(bread,5));
        b.addBillEntry(new BillEntry(new Product("Suger",250),3));

        print("Printing bill....");
        b.printBill();

        print("overall total:"+ calculateTotal());





    }
    @Override
    public String toString() {
        return "BillDemo2 []";
    }




}
}


















    

