import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StationTest tests the Station Class.
 *
 * @author <insert your name here>.
 * @version Winter 2019.
 */
public class StationTest
{
    /**
     * Default constructor for test class StationTest.
     */
    public StationTest()
    {
        // not used in this Lab
    }

    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        // not used in this Lab
    }

    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        // not used in this Lab
    }

    
    /**
     * Test object creation with first constructor.
     */
    @Test
    public void testFirstConstructor()
    {
        // Create an instance of Station object
        Station station1 = new Station();
        
        // Test to see if the instance was created      
        assertNotNull(station1);
            
        // Test instance variables are correctly initialized
        // Note - these tests assumes the get methods are correct
        assertEquals("NO DESCRIPTION PROVIDED", station1.getDescription());
        assertEquals(0.0, station1.getPricePerGallon(), 0.01);   
        assertEquals(0.0, station1.getLatitude(), 0.01);  
        assertEquals(0.0, station1.getLongitude(), 0.01);  
    }

    
    /**
     * Test object creation with second constructor.
     */
    @Test
    public void testSecondConstructor()
    {
        // Create an instance of Station object
        Station station1 = new Station("Cobra Gas", 39.95, -82.1, 2.13);
        
        // Test to see if the instance was created         
        assertNotNull(station1);
            
        // Test instance variables are correctly initialized
        // Note - these tests assumes the get methods are correct
        assertEquals("Cobra Gas", station1.getDescription());
        assertEquals(2.13, station1.getPricePerGallon(), 0.01);   
        assertEquals(-82.1, station1.getLongitude(), 0.01);  
        assertEquals(39.95, station1.getLatitude(), 0.01);
    }
    
    
    /**
     * Test update of Station description.
     */
    @Test
    public void testSetDescription()
    {
        // Create an instance of Station object
        Station station1 = new Station("Cobra Gas", 39.95, -82.1, 2.13);
        
        // Call on the setDescription with a new name        
        station1.setDescription("Rattler Ray's");
        
        // Test whether the value was successfully changed        
        assertEquals("Rattler Ray's", station1.getDescription());
    }
    
    /**
     * Test update of Station price per gallon.
     */
    @Test
    public void testSetPricePerGallon()
    {
        // Create an instance of Station object
        Station station1 = new Station("Cobra Gas", 39.95, -82.1, 2.13);
        
        // Call on the setPricePerGallon with a new price        
        station1.setPricePerGallon(3.25);
        
        // Test whether the value was successfully changed        
        assertEquals(3.25, station1.getPricePerGallon());
    }
    /**
     * Test calculation of GGE.
     */
    @Test
    public void testCalcPricePerGGE()
    {
        // Create an instance of Station object
        Station station1 = new Station("Cobra Gas", 39.95, -82.1, 2.13);
        // Test calculation
        assertEquals(3.00, station1.calcPricePerGGE(), .01);
        
        // REMOVE this comment and try out a test of your own 
        // Try a different price per gallon
        station1.setPricePerGallon(0.0);
        assertEquals(0.0, station1.calcPricePerGGE(), .01);                    
    }
    

    /**
     * Test calculation of distance in miles.
     * 
     *    <pre>NOTE: 
     *    This tests a calculation that is very rough 
     *    (the accuracy is estimated to be within 10%); 
     *    this will need to be tightened in the future</pre>
     *  
     */
    @Test
    public void testCalcDistance()
    {
        // Create an instance of Station object 
        Station station1 = new Station("Cobra Gas", 39.95, -82.1, 2.13);
        assertEquals(5153.1, station1.calcDistance(0.0, 0.0), .1);

        // test for Cleveland. OH
        assertEquals(110.3, station1.calcDistance(41.5, -81.6), .1);
        
        // test with Rome, ITALY
        assertEquals(5013.0, station1.calcDistance(41.9, 12.45), .1);

        // test Chicago, IL
        assertEquals(319.7, station1.calcDistance(41.85, -87.6), .1);

        // test with Adlelaide, AUSTRALIA
        assertEquals(12789.6, station1.calcDistance(-34.9, 138.6), .1);
            
        // REMOVE this comment & fix expected value in assert below           
        // test with Buenos Aires, BRAZIL
        assertEquals(-1.0, station1.calcDistance(-34.6, -58.35), .1);    
    }
    
    
    /**
     * Test the toString method.
     * 
     * <pre>Format of the string should be
     *      description [latitude, longitude] price: $price
     * Example: Cobra Gas [39.9571, 82.81] price: $2.13</pre>
     */
    @Test
    public void testToString()
    {
        // Create an instance of Station object 
        Station station1 = new Station("Cobra Gas", 39.95, -82.1, 2.13);
        
        // obtain expected attributes of the Station
        double price = station1.getPricePerGallon();
        double latitude = station1.getLatitude();
        double longitude = station1.getLongitude();
        
        // Obtain the result string
        String result = station1.toString();

        // check for expected attributes, properly formatted
        // check the result contains the expected description
        assertTrue(result.contains("Cobra Gas "));
        //check the result contains the expected location
        assertTrue(result.contains("[" + latitude + ", " + 
            longitude + "]") );
        //check the result contains the expected price
        assertTrue(result.contains("price: $" + price) );        
    }
    
}






