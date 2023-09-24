package Lab2;
public class Product {
    private int Id;
    private String name;
    private double price;
    private int quantity;
    static int counter = 0;

    private Date mfcdate;

    Product(String name,double price,int quantity,Date mfcdate){
        this.Id = counter++;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.mfcdate = mfcdate;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString(){
        String print_details = String.format(" Id: %d\n Name: %s\n Price: %.2f\n Quantity: %d\n %s ",Id,name,price,quantity,mfcdate);
        return print_details;
    }

    public void setMfcdate(Date mfcdate) {
        this.mfcdate = mfcdate;
    }
    public Date getMfcdate() {
        return mfcdate;
    }
    public Product latest_product(Product P1, Product P2){
//        Date temp = mfcdate.isRecent(P1.mfcdate,P2.mfcdate);
//        if ( P1.getMfcdate()==mfcdate.isRecent(P1.getMfcdate(),P2.getMfcdate()))
//            return P1;
//        else
//            return P2;

        Date temp=mfcdate.isRecent(P1.mfcdate,P2.mfcdate);

        return P1.mfcdate==mfcdate.isRecent(P1.getMfcdate(),P2.getMfcdate())?P1:P2;
    }
}

