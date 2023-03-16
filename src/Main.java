public class Main {
    public static void main(String[] args) {
        //now create a child object of cars
        Car CarOne = new GasolineCar("Blue", "BMW 430i", 200.0, 4, 4034.0, 20.0);
        Car CarTwo = new ElectricCar("Red", "Tesla Model 3", 162.0, 5, 4250.0, 358);
        //print out the object to string
        System.out.println("\n" + "<Gasoline Car>");
        System.out.println(CarOne);
        System.out.println("\n" + "<Electric Car>");
        System.out.println(CarTwo);

        //now create a child object of boats
        Boat BoatOne = new Submarine("Charcoal", "USS Nautilus", 26.0, 105, 7788932.0, 10000.0);
        Boat BoatTwo = new Yacht("White", "De Vries Dojo", 17.0, 25, 182769.0, 45.85);
        //print out the object to String
        System.out.println("\n" + "<Submarine>");
        System.out.println(BoatOne);
        System.out.println("\n" + "<Yacht>");
        System.out.println(BoatTwo);

        //now create a child object of aircrafts
        Aircraft AircraftOne = new Airplane("White", "Airbus A380", 737.0, 853, 1268000.0, "Four Rolls-Royce Trent 900");
        Aircraft AircraftTwo = new HotAirBalloon("Yellow", "Cameron Balloons O-90", 245.0, 5,245.92, "Parachute/RDS" );
        //print out the object to String
        System.out.println("\n" + "<Airplane>");
        System.out.println(AircraftOne);
        System.out.println("\n" + "<Hot Air Balloon>");
        System.out.println(AircraftTwo);

        //now create a child object of twowheels
        Twowheels TwowheelsOne = new Motorcycle("Metal Black", "BMW M 1000R", 174.0, 1, 438.7, 7.2);
        Twowheels TwowheelsTwo = new ElectricScooter("Black", "Niu kqi3 Pro", 20, 1, 44.0 , 48);
        //print out the object to String
        System.out.println("\n" + "<Motorcycle>");
        System.out.println(TwowheelsOne);
        System.out.println("\n" + "<Electric Scooter>");
        System.out.println(TwowheelsTwo);


    }
}
