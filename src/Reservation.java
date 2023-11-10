
public class Reservation {

    public  int numPeople;

    public double time;

    int timeMade;

    public String name;

    public  long priority;




    public Reservation(int tNumpeople, double tTime, int tPriority, String tName, int tTimemade) {
        numPeople = tNumpeople;
        time = tTime;
        name = tName;
        priority = tPriority;
        timeMade = tTimemade;
   //     numReservations= tReservations;

    }

    public void print() {


        System.out.println(name + "booked reservation for" + numPeople + "people at" + time + " o'clock for table" + timeMade + ".");


    }


}

