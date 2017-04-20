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
    
    /**
     * test the addData method when the person liked the song
     */
    public void testAddData()
    {
        String[] answers = new String[6];
        answers[0] = "yes";
        answers[1] = "no";
        answers[2] = "no";
        answers[3] = "no";
        answers[4] = "yes";
        answers[5] = "yes";
        Person person = new Person(1, "04/10/17", "ART", "MATH_CMDA", "OTHER_US", answers);
        song.addData(person);
        assertEquals(song.getTracker().getHeard(), 1);
        assertEquals(song.getTracker().getLiked(), 0);
    }
    
}
