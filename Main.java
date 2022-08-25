import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // scanner; "What is the make and model of the aircraft?"
        // "Which insturments are you looking for?"
        String avionic;

        try (
                Scanner aircraft = new Scanner(System.in)) {
            System.out.println("Please enter the manufacturer of the aircraft.");
            String airplane = aircraft.nextLine(); // Read user input

            System.out.println("Please enter the model of the " + airplane + "."); // Output user input
            String model = aircraft.nextLine();

            System.out.println("Your aircraft is a " + airplane + " " + model + ".");

            System.out.println("What kind of avionics are you looking for?");
            System.out.println("Enter Analog ");
            System.out.println("      Digital");
            System.out.println("      Touchscreen:");
            avionic = aircraft.nextLine(); // Read user input
            Instrument a = new Instrument(airplane);
            a.instruments(avionic);

            //aircraft.nextLine();

            // System.out.println("You're looking for a " +
            // instrument.avionic.get(Integer.parseInt(avionic)) + " " + avionic2 + ".");

            // instrument();

        }

        // method to add insturment names
        // ArrayList<Insturments> inst = new ArrayList<>();

        // method to add insturments.total
        // system.out.println(CostTotal)

        // Needs a class constructor

    }
}