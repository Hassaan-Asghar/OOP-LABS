package Lab5;

public class Test {
    public static void main(String[] args) {
        Location l = new Location(6,12);
        Taxi T1 = new Taxi(new Location(6,72),Status.AVAILABLE);
        Taxi T2 = new Taxi(new Location(6,24),Status.RESERVED);
        Taxi T3 = new Taxi(new Location(3,20),Status.AVAILABLE);
        Taxi T4 = new Taxi(new Location(10,25),Status.AVAILABLE);
        Taxi T5 = new Taxi(new Location(0,0),Status.AVAILABLE);

        Manager.addCar(T1);
        Manager.addCar(T2);
        Manager.addCar(T3);
        Manager.addCar(T4);
        Manager.addCar(T5);

        Manager.PrintList();
        System.out.println(Manager.nearest(l));

       // System.out.println(Manager.list);





    }

}