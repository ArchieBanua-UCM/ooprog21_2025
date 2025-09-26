public class DebugTrip
{
   private String destination;
   private String departure;
   private String mode;

   private static final String DEFAULT_CITY = "Atlanta";
   private static final String DEFAULT_MODE = "car";

   // Constructor with 1 argument: destination
   public DebugTrip(String destination)
   {
      this(destination, DEFAULT_CITY, DEFAULT_MODE);
   }

   // Constructor with 2 arguments: destination and departure
   public DebugTrip(String destination, String departure)
   {
      this(destination, departure, DEFAULT_MODE);
   }

   // Constructor with 3 arguments: destination, departure, and mode
   public DebugTrip(String destination, String departure, String mode)
   {
      this.destination = destination;
      this.departure = departure;
      this.mode = mode;
   }

   public String getDestination()
   {
      return destination;
   }

   public String getDepartureCity()
   {
      return departure;
   }

   public String getMode()
   {
      return mode;
   }

   // Add your main method here
   public static void main(String[] args)
   {
      DebugTrip trip1 = new DebugTrip("New York");
      DebugTrip trip2 = new DebugTrip("Los Angeles", "Chicago");
      DebugTrip trip3 = new DebugTrip("Miami", "Orlando", "train");

      displayTrip("Trip 1", trip1);
      displayTrip("Trip 2", trip2);
      displayTrip("Trip 3", trip3);
   }

   public static void displayTrip(String label, DebugTrip trip)
   {
      System.out.println(label + ":");
      System.out.println("  Destination: " + trip.getDestination());
      System.out.println("  Departure: " + trip.getDepartureCity());
      System.out.println("  Mode: " + trip.getMode());
      System.out.println();
   }
}
