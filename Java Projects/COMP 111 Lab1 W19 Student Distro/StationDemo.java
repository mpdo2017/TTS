/**
 * Station`Demo is a "main" for demonstrating the Station class.
 * 
 * @author <insert your name here>.
 * @version Winter 2019.
 */
public class StationDemo
{
    /**
     * main method - makes this an executable program.
     */
    public static void main()
    {
        // create a station
        Station station1 = new Station("Cobra Gas", 39.95, -82.1, 2.13);
        System.out.println( station1.toString() );
        System.out.println( "$" + station1.getPricePerGallon() + " is $" +
                station1.calcPricePerGGE() + " GGE" );        

        // find a distance to another location
        String location = "a location near Cleveland";
        double latitude2 = 41.9;
        double longitude2 = -82.1;
        System.out.println( "Distance to " + location + " is " + 
                station1.calcDistance(latitude2, longitude2) + " miles");
 
        // create another "default" station - station2
        Station station2 = new Station();
      
        // display information about this station2
        System.out.println();
        System.out.println( "Station: " + station2.getDescription() );
        System.out.println( "Location: [" + station2.getLatitude() + ", " +   
                station2.getLongitude() + "]" );
        System.out.println( "Price: $" + station2.getPricePerGallon() );

        // update the station2 information
        station2.setDescription("Rattler Ray's");
        station2.setPricePerGallon( station1.getPricePerGallon() );
        
        System.out.println();
        System.out.println( "Station: " + station2.getDescription() );
        System.out.println( "Location: [" + station2.getLatitude() + ", " +   
                station2.getLongitude() + "]" );
        System.out.println( "Price: $" + station2.getPricePerGallon() );
    }
}
