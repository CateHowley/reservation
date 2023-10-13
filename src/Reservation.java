
public class Reservation {

    public int numPeople;

    public double time;

    int tableNumber;

    public String name;

    public int priority;


    public Reservation(int tNumpeople, double tTime, int tPriority, String tName, int tTimemade) {
        numPeople = tNumpeople;
        time = tTime;
        name = tName;
        priority = tPriority;
        tableNumber = tTimemade;

    }

    public void print() {


        System.out.println(name + "booked reservation for" + numPeople + "people at" + time + " o'clock for table" + tableNumber + ".");


    }


}

