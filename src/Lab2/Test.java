package Lab2;
public class Test {
    public static void main(String[] args) {
        //Product P1 = new Product("laptop",50000,1,new Date(18,"Friday",9,2023));
        Product P1 = new Product("Laptop",100000,1,new Date(22,"Friday","September",2023));
        System.out.println(P1);
        Product P2 = new Product("Mobile",50000,1,new Date(23,"Saturday","September",2022));
        System.out.println(P2);


        Product Temp = P1.latest_product(P1,P2);
        System.out.println(Temp);

    }
}
