public class Main {
    public static void main(String[] args) {

        //Task1
        int years = 24;
        if (years >= 18) {
            System.out.println("Сongratulations on your coming of age!");
        }
        if (years < 18) {
            System.out.println("Age of majority not reached!");
        }
        System.out.println();
        //Task2

        if (years >= 7) {
            if (years >= 18) {
                if (years >= 24) {
                    System.out.println("The man graduated from the university and it’s time to look for his first job!");
                }
                if (years < 24) {
                    System.out.println("Person has already finished school and can go to university!");
                }
            }
            if (years < 18) {
                System.out.println("Сhild goes to school!");
            }
        }
        if (years < 7) {
            System.out.println("No Сhild goes to school!");
        }
        System.out.println();
        //Task3
        int numberPlaces = 102;
        int numberSeats = 60;
        int passengersEntered = 190;

        if (passengersEntered < numberPlaces) {
            if (passengersEntered < numberSeats) {
                int c = numberSeats - passengersEntered;
                int s = numberPlaces - numberSeats;
                System.out.println("Number of seats available: " + c + ".");
                System.out.println("Number of available standing seats: " + s + ".");
            }
            if (passengersEntered > numberSeats) {
                int c = numberPlaces - passengersEntered;
                System.out.println("Number of available standing seats: " + c + ".");
            }
        }
        if (passengersEntered > numberPlaces) {
            System.out.println("Wagon full!");
        }
    }
}


