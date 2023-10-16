public class ReservationSystem {
    public static void main(String[] args) {
        ReservationSystem jarvis = new ReservationSystem();
    }


    public ReservationSystem() {
        //  Reservation gavin = new Reservation( 1, 4.00, 2, "jessie", 645);
        //  gavin.toString();


        //  Reservation dog = new Reservation(4, 8.00, 1,"jessie", 345 );
        //  dog.print();

        // Reservation [] reservations = new Reservation [10];
        //   reservations [0] = dog;

        //   reservations [1] = gavin;

        //  reservations [1].print();

        //   Reservation cat = new Reservation(2, 8.00, 1, "cat", 90);


        // reservations[2] = new Reservation(2, 8.00, 1, "cat", 90);
        //  reservations[2].print();
        //  for(int x = 3; x<10; x++){
        //    reservations [x] = new Reservation(7, 7.00, 2, "howley", 6);
        //   reservations [x].print();
    }


    public void addReservation(int tNumpeople, double tTime, int tPriority, String tName, int tTimemade) {
        Reservation chair = new Reservation(tNumpeople, tTime, tPriority, tName, tTimemade);
        for (int x = 0; x < reservations.length; x++) {
            if (reservations[x] == null) {
                System.out.println("empty");
                reservations[x] = chair;
                reservations(x).println();
                break;

            }

        }
        public void displayReservation() {
            Reservation display = new Reservation(tNumpeople, tTime, tPriority, tName, tTimemade);
        }
        System.out.println(reservations[2]);
        for (int y = 0; y < reservations.length; y++) {
        if (reservations[y] == null) {
            System.out.println("none");
            reservations[y] = display;
            reservations(y).println();
            break;

        }
    }
}

    }




