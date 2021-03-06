/**
 * 
 */
package prj5;

/**
 * @author Ashlyn McDonald (mashlyn6)
 * @author Truman Heberle (trumanh)
 * @author Shivani Garg (shivanig)
 * @version 2017.04.26
 * 
 * This class tests the methods of the CompareSongGenre
 * class to ensure they work as expected.
 */
public class CompareSongGenreTest extends student.TestCase {

    private CompareSongGenre comparer;
    
    /**
     * sets up test methods and is executed before
     * each test
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
        assertNotSame(0, comparer.compare(song1, song2));
    }
    
    /**
     * tests the compare method when the two objects
     * have the same genre
     */
    public void testCompareSameGenre()
    {
        Song song1 = new Song("hey", "Taylor Swift", 1998, "pop", 1);
        Song song2 = new Song("hello", "Michael Jackson", 1997, "pop", 2);
        assertEquals(0, comparer.compare(song1, song2));
    }
    
}
