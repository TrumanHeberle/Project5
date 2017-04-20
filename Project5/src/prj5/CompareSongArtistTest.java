/**
 * 
 */
package prj5;

/**
 * @author AshlynUser
 *
 */
public class CompareSongArtistTest extends student.TestCase {

    private CompareSongArtist comparer;
    
    /**
     * sets up test methods
     */
    public void setUp()
    {
        comparer = new CompareSongArtist();
    }
    
    /**
     * tests the compare method when the two objects
     * have different artists
     */
    public void testCompareDiffArtists()
    {
        Song song1 = new Song("hey", "Taylor Swift", 1998, "pop", 1);
        Song song2 = new Song("hello", "Michael Jackson", 1997, "rock", 2);
        assertTrue(comparer.compare(song1, song2) != 0);
    }
    
    /**
     * tests the compare method when the two objects
     * have the same artist
     */
    public void testCompareSameArtist()
    {
        Song song1 = new Song("hey", "Taylor Swift", 1998, "pop", 1);
        Song song2 = new Song("hello", "Taylor Swift", 1997, "rock", 2);
        assertTrue(comparer.compare(song1, song2) == 0);
    }
    
}
