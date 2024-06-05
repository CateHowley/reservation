import java.util.Scanner;

public class ReservationSystem {




    Reservation[] reservations = new Reservation[10];

    public static void main(String[] args) {
        ReservationSystem c = new ReservationSystem();
        //Scanner scan = new Scanner(System.in);
        // ReservationSystem jarvis = new ReservationSystem();
        // String choice = scan.nextLine();
        //  String name = scan.next();


        //if (choice.equals("1")) {

        // } else if (choice.equals("2")) {
        //sort reservation based on priority
        // } else if (choice.equals("3")) {
        //3 add a reservatiom
        // } else if (choice.equals("4")) {
        //4 for name
        // } else if (choice.equals("5")) {
        //5 time made
        // }
    }


    public ReservationSystem() {

        addReservation(3, 3.2, 4, "cate", 4000000);
        addReservation(2, 4.3, 1, "jack", 3457);
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        String name2;
        System.out.println("hello " + name + "What can I help you with?");
        //
//        while (true)
//        {
//
//
//        }

        System.out.println("press 1 for reservation slots; press 2 to add a reservation, press 3 for where you are in line, press 4 for name of reservation, press 5 for time made");
        String number = scan.nextLine();
        if (number.equals("1")) {
            System.out.println("View reservations");
            displayReservation();
        }
        if (number.equals("2")) {
            System.out.println("what time do you want your reservation for?");
            String time = scan.nextLine();
            System.out.println("for how many people?");
            String amount = scan.nextLine();
            System.out.println("would you like to change the name of the reservation?");
            String change = scan.nextLine();

            if (change.equals("yes")) {
                System.out.println("what would you like to name your reservation to?");

                name2 = scan.nextLine();
                name = name2;
            }
            if (change.equals("no")) {
                System.out.println(" perfect," + name + "!");
            }
            //TODO: call addReservation method
            //example: addReservation(3, 3.2, 4, "cate", 4000000);
            //3 would be amount

        }
        if (number.equals("3")) { //stuff to do when finished with basic requirments
            System.out.println("you are currently 3rd in line!");
            String priority = scan.nextLine();
        }
        //TODO: have a menu choice for sort
        //TODO: have an if for short method
        //TODO: use our sort method we think works


        System.out.println("thank you for making a reservation at Cate's restaurant!");


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
        //    int[] waffles = new int[10];

        //   for (int i = 0; i < waffles.length; i++) {
        //      waffles[i] = (int) (Math.random() * 100);
        //      System.out.print(waffles[i] + ",");
        //   }
        //   System.out.println();


        //start of selection sort
        int n = reservations.length;
        Reservation filler = new Reservation(0, 0, 0, "0", 0);
        for (int k = 0; k < n - 1; k++) {
            int minIndex = k;
            //find the min

            for (int v = k + 1; v < n; v++) {
                if (reservations[v] != null) {
                    if (reservations[v].priority < reservations[minIndex].priority) {
                        minIndex = v;
                    }


                }

            }
            //swap indexes
            filler = reservations[minIndex];
            reservations[minIndex] = reservations[k];
            reservations[k] = filler;

        }

        for (int i = 0; i < reservations.length; i++) {
            System.out.println(reservations[i] + ",");
        }
        displayReservation();

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










