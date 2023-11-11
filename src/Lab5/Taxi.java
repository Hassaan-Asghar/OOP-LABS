package Lab5;

public class Taxi {

    private int ID;
    Location l;
    Status availability;
    static int counter = 1;

    public Taxi(Location l, Status availability) {
        this.ID = counter++;
        this.l = l;
        this.availability = availability;
    }

    public Location getL() {
        return l;
    }

    public void setL(Location l) {
        this.l = l;
    }

    public Status getAvailability() {
        return availability;
    }

    public void setAvailability(Status availability) {
        this.availability = availability;
    }

    public String toString(){
        return String.format("Id: %d\nStatus: %s\n",ID,availability);
    }
}
