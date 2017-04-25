/**
 * 
 */
package prj5;

/**
 * @author AshlynUser
 * @version 2017.04.19
 */
public class CompareSongYearTest extends student.TestCase {

    private CompareSongYear comparer;
    
    /**
     * sets up test methods
     */
    public void setUp()
    {
        comparer = new CompareSongYear();
    }
    
    /**
     * tests the compare method when the two objects
     * have different years
     */
    public void testCompareDiffYear()
    {
        Song song1 = new Song("hey", "Taylor Swift", 1998, "pop", 1);
        Song song2 = new Song("hello", "Michael Jackson", 1997, "rock", 2);
        assertNotSame(0, comparer.compare(song1, song2));
    }
    
    /**
     * tests the compare method when the two objects
     * have the same year
     */
    public void testCompareSameYear()
    {
        Song song1 = new Song("hey", "Taylor Swift", 1998, "pop", 1);
        Song song2 = new Song("hey", "Michael Jackson", 1998, "pop", 2);
        assertEquals(0, comparer.compare(song1, song2));
    }
    
}
