package prj5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import student.TestCase;

/**
 * Tests the Tracker class
 * 
 * @author Truman Heberle
 * @version 4.19.2017
 */
public class TrackerTest extends TestCase {
    private Tracker track;


    /**
     * Runs before each test case
     */
    public void setUp() {
        track = new Tracker();
    }


    /**
     * tests the addHear method
     */
    public void testAddHear() {
        track.addHear(HobbyEnum.ART, MajorEnum.COMPUTER_SCIENCE,
            RegionEnum.NORTH_EAST_US);
        track.addHear(HobbyEnum.READ, MajorEnum.OTHER_ENGINEERING,
            RegionEnum.SOUTH_EAST_US);
        track.addHear(HobbyEnum.SPORTS, MajorEnum.MATH_CMDA,
            RegionEnum.OTHER_US);
        track.addHear(HobbyEnum.MUSIC, MajorEnum.OTHER, RegionEnum.OUTSIDE_US);

        assertEquals(track.getHeardByRegion(RegionEnum.NORTH_EAST_US), 1);
        assertEquals(track.getHeardByRegion(RegionEnum.SOUTH_EAST_US), 1);
        assertEquals(track.getHeardByRegion(RegionEnum.OTHER_US), 1);
        assertEquals(track.getHeardByRegion(RegionEnum.OUTSIDE_US), 1);

        assertEquals(track.getHeardByMajor(MajorEnum.COMPUTER_SCIENCE), 1);
        assertEquals(track.getHeardByMajor(MajorEnum.OTHER_ENGINEERING), 1);
        assertEquals(track.getHeardByMajor(MajorEnum.MATH_CMDA), 1);
        assertEquals(track.getHeardByMajor(MajorEnum.OTHER), 1);

        assertEquals(track.getHeardByHobby(HobbyEnum.ART), 1);
        assertEquals(track.getHeardByHobby(HobbyEnum.READ), 1);
        assertEquals(track.getHeardByHobby(HobbyEnum.SPORTS), 1);
        assertEquals(track.getHeardByHobby(HobbyEnum.MUSIC), 1);
    }


    /**
     * tests the addLike method
     */
    public void testAddLike() {
        track.addLike(HobbyEnum.ART, MajorEnum.COMPUTER_SCIENCE,
            RegionEnum.NORTH_EAST_US);
        track.addLike(HobbyEnum.READ, MajorEnum.OTHER_ENGINEERING,
            RegionEnum.SOUTH_EAST_US);
        track.addLike(HobbyEnum.SPORTS, MajorEnum.MATH_CMDA,
            RegionEnum.OTHER_US);
        track.addLike(HobbyEnum.MUSIC, MajorEnum.OTHER, RegionEnum.OUTSIDE_US);

        assertEquals(track.getLikedByRegion(RegionEnum.NORTH_EAST_US), 1);
        assertEquals(track.getLikedByRegion(RegionEnum.SOUTH_EAST_US), 1);
        assertEquals(track.getLikedByRegion(RegionEnum.OTHER_US), 1);
        assertEquals(track.getLikedByRegion(RegionEnum.OUTSIDE_US), 1);

        assertEquals(track.getLikedByMajor(MajorEnum.COMPUTER_SCIENCE), 1);
        assertEquals(track.getLikedByMajor(MajorEnum.OTHER_ENGINEERING), 1);
        assertEquals(track.getLikedByMajor(MajorEnum.MATH_CMDA), 1);
        assertEquals(track.getLikedByMajor(MajorEnum.OTHER), 1);

        assertEquals(track.getLikedByHobby(HobbyEnum.ART), 1);
        assertEquals(track.getLikedByHobby(HobbyEnum.READ), 1);
        assertEquals(track.getLikedByHobby(HobbyEnum.SPORTS), 1);
        assertEquals(track.getLikedByHobby(HobbyEnum.MUSIC), 1);
    }
    
    /**
     * tests when the param is not a valid enum for the hobby
     */
    public void testNotValidEnum1()
    {
        Exception thrown = null;
        track.addHear(HobbyEnum.ART, MajorEnum.MATH_CMDA, RegionEnum.NORTH_EAST_US);
        try
        {
            track.getLikedByHobby(HobbyEnum.ELSE);           
        }
        catch (Exception e)
        {
            thrown = e;
        }
        assertNotNull(thrown);
        assertTrue(thrown instanceof IllegalArgumentException);      
    }
    
    /**
     * tests when the param is not a valid enum for the hobby
     */
    public void testNotValidEnum1Heard()
    {
        Exception thrown = null;
        track.addHear(HobbyEnum.ART, MajorEnum.MATH_CMDA, RegionEnum.NORTH_EAST_US);
        try
        {
            track.getHeardByHobby(HobbyEnum.ELSE);           
        }
        catch (Exception e)
        {
            thrown = e;
        }
        assertNotNull(thrown);
        assertTrue(thrown instanceof IllegalArgumentException);      
    }
    
    /**
     * tests when the param is not a valid enum for the major
     */
    public void testNotValidEnum2()
    {
        Exception thrown = null;
        track.addHear(HobbyEnum.ART, MajorEnum.MATH_CMDA, RegionEnum.NORTH_EAST_US);
        try
        {
            track.getLikedByMajor(MajorEnum.ELSE);           
        }
        catch (Exception e)
        {
            thrown = e;
        }
        assertNotNull(thrown);
        assertTrue(thrown instanceof IllegalArgumentException);      
    }
    
    /**
     * tests when the param is not a valid enum for the major
     */
    public void testNotValidEnum2Heard()
    {
        Exception thrown = null;
        track.addHear(HobbyEnum.ART, MajorEnum.MATH_CMDA, RegionEnum.NORTH_EAST_US);
        try
        {
            track.getHeardByMajor(MajorEnum.ELSE);           
        }
        catch (Exception e)
        {
            thrown = e;
        }
        assertNotNull(thrown);
        assertTrue(thrown instanceof IllegalArgumentException);      
    }
    
    /**
     * tests when the param is not a valid enum for the region
     */
    public void testNotValidEnum3()
    {
        Exception thrown = null;
        track.addHear(HobbyEnum.ART, MajorEnum.MATH_CMDA, RegionEnum.NORTH_EAST_US);
        try
        {
            track.getLikedByRegion(RegionEnum.ELSE);           
        }
        catch (Exception e)
        {
            thrown = e;
        }
        assertNotNull(thrown);
        assertTrue(thrown instanceof IllegalArgumentException);      
    }
    
    /**
     * tests when the param is not a valid enum for the region
     */
    public void testNotValidEnum3Heard()
    {
        Exception thrown = null;
        track.addHear(HobbyEnum.ART, MajorEnum.MATH_CMDA, RegionEnum.NORTH_EAST_US);
        try
        {
            track.getHeardByRegion(RegionEnum.ELSE);           
        }
        catch (Exception e)
        {
            thrown = e;
        }
        assertNotNull(thrown);
        assertTrue(thrown instanceof IllegalArgumentException);      
    }
}
