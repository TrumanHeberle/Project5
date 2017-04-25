/**
 * 
 */
package prj5;

/**
 * @author AshlynUser
 * @version 2017.04.19
 */
public class CompareSongTitleTest extends student.TestCase {

    private CompareSongTitle comparer;
    
    /**
     * sets up test methods
     */
    public void setUp()
    {
        comparer = new CompareSongTitle();
    }
    
    /**
     * tests the compare method when the two objects
     * have different titles
     */
    public void testCompareDiffTitle()
    {
        Song song1 = new Song("hey", "Taylor Swift", 1998, "pop", 1);
        Song song2 = new Song("hello", "Michael Jackson", 1997, "rock", 2);
        assertNotSame(0, comparer.compare(song1, song2));
    }
    
    /**
     * tests the compare method when the two objects
     * have the same title
     */
    public void testCompareSameTitle()
    {
        Song song1 = new Song("hey", "Taylor Swift", 1998, "pop", 1);
        Song song2 = new Song("hey", "Michael Jackson", 1997, "pop", 2);
        assertEquals(0, comparer.compare(song1, song2));
    }
    
}
