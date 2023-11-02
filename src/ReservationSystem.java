import java.util.Scanner;

public class ReservationSystem {

    Reservation[] reservations = new Reservation[10];

    public static void main(String[] args) {
        ReservationSystem jarvis = new ReservationSystem();
    }


    public ReservationSystem() {
        //  Reservation gavin = new Reservation( 1, 4.00, 2, "jessie", 645);
        //  gavin.toString();
        selectionSort();
        addReservation(5, 5.30, 3, "cate", 830000);
        Scanner scan = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = scan.nextLine();
        System.out.println("hello" + name + "!");
        System.out.println("hello" + name + "what can I help you with?");
        System.out.println("press 1 for a number of people; press 2 for time, press 3 for priority, press 4 for name of reservation, press 5 for time made");
        String choice = scan.nextLine();
        if (choice.equals("1")) {
            System.out.println("how many people do you have in your party?");
            String party = scan.nextLine();
            if (party.equals("1")) {
                System.out.println("what time is the reservation");



            //what time

            //call add res method
            //if (party.equals(numPeople)) {
               // System.out.println("a reservation has been made for" + name + "at" + Numpeople "what time will your reservation be for?");

          //  }


        }
















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
                reservations[x].print();
                break;

            }


        }

    }

    public void displayReservation() {
        // Reservation display = new Reservation(tNumpeople, tTime, tPriority, tName, tTimemade);
        for (int x = 0; x < reservations.length; x++) {
            if (reservations[x] == null) {
                System.out.println("empty");


            } else {
                reservations[x].print();
            }
        }

    }


    public void selectionSort() {
        int[] waffles = new int[10];

        for (int i = 0; i < waffles.length; i++) {
            waffles[i] = (int) (Math.random() * 100);
            System.out.print(waffles[i] + ",");
        }
        System.out.println();

        //start of selection sort
        int n = waffles.length;

        for (int k = 0; k < n - 1; k++) {

            //find the min
            int minIndex = k;
            for (int v = k + 1; v < n; v++) {
                if (waffles[v] < waffles[minIndex]) {
                    minIndex = v;

                }

            }
            //swap indexes
            int temp = waffles[minIndex];
            waffles[minIndex] = waffles[k];
            waffles[k] = temp;


        }
        for (int i = 0; i < waffles.length; i++) {
            System.out.print(waffles[i] + ",");
        }
        System.out.println();

    }

    public void sortReservations() {
        Reservation filler = new Reservation(0, 0, 0, "cate", 0);
        for (int i = 0; i < reservations.length - 1; i++) {
            if (reservations[i].priority > reservations[i + 1].priority)
                filler = reservations[i + 1];
        }
    }





}





//      //     for (int i=0; i < reservations.length; i++){
//           }
//         //    if(reservations[i]!=null){
//        reservations[i].priority=i;
//
//
//public class void selectionSort()
//
//
//        Reservation[]reservations=new Reservations
//
//
//        }










