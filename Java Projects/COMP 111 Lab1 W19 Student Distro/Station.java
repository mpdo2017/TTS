/**
 * Models a Snake Oil gas station.
 * 
 * @author <insert your name here>.
 * @version Winter 2019.
 */
public class Station
{
    // instance variables 
    private double latitude;
    private double longitude;
    private String description;
    private double pricePerGallon;

    /**
     * First constructor for objects of class Station.
     */
    public Station()
    {
        // initialize all instance variables to default values
        this.latitude = 0.0;
        this.longitude = 0.0;
        this.description = "NO DESCRIPTION PROVIDED"; 
        this.pricePerGallon = 0.0;
    }
    
    /**
     * Second constructor for objects of class Station.
     * 
     * @param  inDescription    String  description of station.
     * @param  inLatitude       double  distance in degrees from equator.
     * @param  inLongitude      double  distance in degrees from 
     *                                  prime meridian.
     * @param  inPrice          double  price per gallon.

     */
    public  Station(String inDescription, double inLatitude, double inLongitude,
                    double inPrice)
    {
        // initialize instance variables
        // using values passed in as parameters
        this.latitude = inLatitude;        
        this.longitude = inLatitude;
        this.description = inDescription; 
        this.pricePerGallon = inPrice; 
    }

    /**
     * Returns the latitude of the station location.
     * 
     * @return double  distance from equator in degrees.
     */
    public double getLatitude()
    {
        return this.latitude
    }
 
    /**
     * Returns the longitude of the station location.
     * 
     * @return double  distance from prime meridian in degrees.
     */
    public double getLongitude()
    {
        return this.longtude;
    }
         
    /**
     * Updates the description of this station.
     * 
     * @param  newDescription    String  station description.
     */
    public void setDescription(String newDescription)
    {
        this.description = description;        
    }
    
    /**
     * Returns the description of this station.
     *
     * @return  String  station description.
     */
    public String getDescription(
    {
        return this.description;
    }

    /**
     * Updates the price per gallon of fuel at this station.
     * 
     * @param  newPrice  double   new price per gallon of fuel.
     */
    public void setPricePerGallon(double newPrice)
    {
        this.pricePerGallon = newPrice;    
    }
    
    /**
     * Returns the price per gallon of fuel at this station.
     *
     * @return  double  price per gallon of fuel.
     */
    public double getPricePerGallon()
    {
        return this.pricePerGallon;
    }
      
    /**
     * Calculates price per GGE 
     *    (gasoline gallon equivalent) of fuel at this station.
     * 
     * @return double  price per gge.
     */
    public double calcPricePerGGE()
    {
        // replace this comment & return statement with your code 
        return -1.0;
    }
    
    /**
     * Calculates approximate distance between the input location
     *    and that of this station.
     *    
     *    <pre>NOTE: 
     *    The calculation here is very rough (the accuracy
     *    is estimated to be within 10%); this will need to
     *    be improved in the future</pre>
     * 
     * @param  targLatitude  latitude of target location.
     * @param  targLongitude longitude of target location.
     * @return double  distance in miles.
     */
    public double calcDistance(double targLatitude, double targLongitude)
    {
        double x = 69.1 * (targLatitude - this.latitude);
        double y = 53.0 * targLongitude - this.longitude);
        return Math.sqrt(x * x + y * y);
    }
        
    /**
     * Returns Station information in specifed format.
     * 
     * <pre>Format of the string should be
     *      description [latitude, longitude] price: $price
     * Example: Cobra Gas [39.9571, 82.81] price: $2.13</pre>
     *   
     * @return String  formatted with Station info
     */
    public String toString()
    {
        return this.description +
               " [" + this.latitude + ", " + this.longitude + "]" +
                " price: $" + this.pricePerGallon;
    }
}
