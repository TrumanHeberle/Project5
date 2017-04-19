/**
 * 
 */
package prj5;

/**
 * @author AshlynUser
 *
 */
public class CompareSongGenreTest extends student.TestCase {

    private CompareSongGenre comparer;
    
    /**
     * sets up test methods
     */
    public void setUp()
    {
        comparer = new CompareSongGenre();
    }
    
    /**
     * tests the compare method when the two objects
     * have different genres
     */
    public void testCompareDiffGenre()
    {
        Song song1 = new Song("hey", "Taylor Swift", 1998, "pop", 1);
        Song song2 = new Song("hello", "Michael Jackson", 1997, "rock", 2);
        assertTrue(comparer.compare(song1, song2) != 0);
    }
    
    /**
     * tests the compare method when the two objects
     * have the same genre
     */
    public void testCompareSameGenre()
    {
        Song song1 = new Song("hey", "Taylor Swift", 1998, "pop", 1);
        Song song2 = new Song("hello", "Michael Jackson", 1997, "pop", 2);
        assertTrue(comparer.compare(song1, song2) == 0);
    }
    
}
