package Lab2;
public class Test {
    public static void main(String[] args) {
        //Product P1 = new Product("laptop",50000,1,new Date(18,"Friday",9,2023));
        Product P1 = new Product("LCD",75000,1,new Date(16,"Saturday",9,2023));
        System.out.println(P1);
        Product P2 = new Product("Mobile",25000,1,new Date(15,"Monday",9,2023));
        System.out.println(P2);


        System.out.println(P1.latest_product(P1,P2));


    }
}
