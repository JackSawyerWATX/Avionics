
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Instrument extends Aircraft {
    public Instrument(String aircraft) {
        super(aircraft);
        // TODO Auto-generated constructor stub
    }

    ArrayList<String> avionic = new ArrayList<String>();

    // override string method

    public static void main(String[] args) {
        ArrayList<String> instrument = new ArrayList<String>();
        instrument.add("Compass");
        instrument.add("Altimeter");
        instrument.add("Airspeed Indicator");
        instrument.add("Vertical Speed");
        instrument.add("Attitude Indicators");
        instrument.add("Turn Coordinator");
        instrument.add("Digital Compass");
        instrument.add("Digital Altimeter");
        instrument.add("Digital Airspeed");
        instrument.add("Digital Vertical Speed");
        instrument.add("Digital Attitude Indicators");
        instrument.add("Digital Horizons");
        instrument.add("Touchscreen");
        System.out.println(instrument);
    }
    // initializes insturment and $ amount in a parameterized constructor

    public void compass(String string, double d) {
    }

    public void altimeter(String string, double d) {
    }

    public void airspeed(String string, double d) {
    }

    public void vertical(String string, double d) {
    }

    public void attitude(String string, double d) {
    }

    public void turn(String string, double d) {
    }

    public void digiCompass(String string, double d) {
    }

    public void digiAltimeter(String string, double d) {
    }

    public void digiAirspeed(String string, double d) {
    }

    public void digiVertical(String string, double d) {
    }

    public void digiTurn(String string, double d) {
    }

    public void digiAttitude(String string, double d) {
    }

    public void touchscreen(String string, double d) {
    }

    @Override
    public String instruments(String avionic) {
        // TODO Auto-generated method stub

        HashMap<String, Double> values = new HashMap<>();
        values.put("compass", 4200.00);
        values.put("altimeter", 5500.00);
        values.put("airspeed", 5500.00);
        values.put("vertical", 1180.00);
        values.put("attitude", 5021.00);
        values.put("turn", 2728.00);
        values.put("digicompass", 5200.00);
        values.put("digialtimeter", 6500.00);
        values.put("digiairspeed", 6500.00);
        values.put("digivertical", 2180.00);
        values.put("digiattitude", 6021.00);
        values.put("digiturn", 3728.00);
        values.put("touchscreen", 12000.00);

        try (Scanner scanner = new Scanner(System.in)) {
            switch (avionic.toLowerCase()) {
                case "analog":
                    System.out.println("analog");
                    System.out.println("What type of " + avionic + " instrument are you in looking for?");
                    String analog = scanner.nextLine().toLowerCase();
                    for (Map.Entry<String, Double> entry : values.entrySet()) {
                        String key = entry.getKey();
                        if (key.equals("compass") && analog.equals("compass")) {
                            System.out.println("Compass - " + entry.getValue());
                        } else if (key.equals("altimeter") && analog.equals("altimeter")) {
                            System.out.println("Altimeter - " + entry.getValue());
                        } else if (key.equals("airspeed") && analog.equals("airspeed")) {
                            System.out.println("Airspeed - " + entry.getValue());
                        } else if (key.equals("vertical") && analog.equals("vertical")) {
                            System.out.println("Vertical - " + entry.getValue());
                        } else if (key.equals("attitude") && analog.equals("attitude")) {
                            System.out.println("Attitude - " + entry.getValue());
                        } else if (key.equals("turn") && analog.equals("turn")) {
                            System.out.println("Turn - " + entry.getValue());
                        }

                    }
                    break;
                case "digital":
                    System.out.println("digital");
                    System.out.println("What type of " + avionic + " instrument are you in looking for?");
                    String digital = scanner.nextLine().toLowerCase();
                    for (Map.Entry<String, Double> entry : values.entrySet()) {
                        String key = entry.getKey();
                        if (key.equals("digicompass") && digital.equals("digicompass")) {
                            System.out.println("Digicompass - " + entry.getValue());
                        } else if (key.equals("digialtimeter") && digital.equals("digialtimeter")) {
                            System.out.println("Digialtimeter - " + entry.getValue());
                        } else if (key.equals("digiairspeed") && digital.equals("digiairspeed")) {
                            System.out.println("Digiairspeed - " + entry.getValue());
                        } else if (key.equals("digivertical") && digital.equals("digivertical")) {
                            System.out.println("Digivertical - " + entry.getValue());
                        } else if (key.equals("digiattitude") && digital.equals("digiattitude")) {
                            System.out.println("Digiattitude - " + entry.getValue());
                        } else if (key.equals("digiturn") && digital.equals("digiturn")) {
                            System.out.println("Digiturn - " + entry.getValue());
                        }
                    }
                    break;
                case "touchscreen":
                    System.out.println("touchscreen");
                    System.out.println("What type of " + avionic + " instrument are you in looking for?");
                    break;
            }
        }

        return avionic;
    }

}

// public static String nextLine() {
// return null;
// }
