public class ReservationSystem {
    public static void main(String[] args) {
        ReservationSystem jarvis = new ReservationSystem();
    }




    public ReservationSystem() {
        Reservation gavin = new Reservation( 1, 4.00, 2, "jessie", 645);
        gavin.toString();


        Reservation dog = new Reservation(4, 8.00, 1,"jessie", 345 );
        dog.print();

        Reservation [] reservations = new Reservation [10];
        reservations [0] = dog;

        reservations [1] = gavin;

        reservations [1].print();

        Reservation cat = new Reservation(2, 8.00, 1, "cat", 90);


        reservations[2] = new Reservation(2, 8.00, 1, "cat", 90);
        reservations[2].print();
        for(int x = 3; x<10; x++){
            reservations [x] = new Reservation(7, 7.00, 2, "howley", 6);
            reservations [x].print();
            Sytem.out.println
        }

        public addReservation(){
            System.out.println(1, 4.0, 6, "yes", 4) ;
        }

         public    displayReservation();
                 System.out.println(1, 3.0, 1, "cate", 4) ;



        }

    }




