/**
 * 
 */
package prj5;

/**
 * @author AshlynUser
 *
 */
public class SongTest extends student.TestCase {

    private Song song;
    
    /**
     * sets up the test methods
     */
    public void setUp()
    {
        song = new Song("Hello", "Adele", 2016, "Pop", 1);
    }
    
    /**
     * tests the getter methods
     */
    public void testGetters()
    {
        assertEquals("Hello", song.getTitle());
        assertEquals("Adele", song.getArtist());
        assertEquals(2016, song.getYear());
        assertEquals("Pop", song.getGenre());
    }
    
}
