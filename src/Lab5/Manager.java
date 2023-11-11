package Lab5;

import java.util.ArrayList;

public class Manager {
  //  final static double maxDistance = 500;
    static ArrayList<Taxi> list = new ArrayList<>();

    public static void addCar(Taxi taxi) {
        list.add(taxi);
    }

    public static String nearest(Location location) {
        Taxi nearestTaxi = null;
        double minDistance = 50; //Range

        for (Taxi car : list) {
            if (car.getAvailability() == Status.AVAILABLE) {
                double dist = distance(location, car.getL());
                if (dist < minDistance) {
                    minDistance = dist;
                    nearestTaxi = car;
                }
            }
        }

        if (nearestTaxi != null) {
            return String.format("Nearest Taxi:\n%sDistance: %.2f\n", nearestTaxi.toString(), minDistance);
        } else {
            return "No Taxi is available.";
        }
    }

    public static double distance(Location l1, Location l2) {
//      Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return Math.sqrt((l2.getX() - l1.getX()) * (l2.getX() - l1.getX()) + (l2.getY() - l1.getY()) * (l2.getY() - l1.getY()));
    }

    public static void PrintList(){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
