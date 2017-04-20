/**
 * 
 */
package prj5;

/**
 * @author AshlynUser
 * @version 2017.04.19
 */
public class SongTest extends student.TestCase {

    private Song song;
    private Song song2;
    private Song song3;
    
    /**
     * sets up the test methods
     */
    public void setUp()
    {
        song = new Song("Hello", "Adele", 2016, "Pop", 0);
        song2 = new Song("Hey", "Taylor Swift", 2010, "Pop", 1);
        song3 = new Song("Billie Jean", "Michael Jackson", 2000, "Pop", 2);
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
     
    public void testAddData()
    {
        String[] answers = new String[6];
        answers[0] = "Yes";
        answers[1] = "No";
        answers[2] = "No";
        answers[3] = "No";
        answers[4] = "Yes";
        answers[5] = "Yes";
        Person person = new Person(1, "04/10/17", "sports",
            "Other", "Southeast", answers);
        song.addData(person);
        song2.addData(person);
        song3.addData(person);
        assertEquals(1, song.getTracker().getHeard());
        assertEquals(0, song.getTracker().getLiked());
        assertEquals(0, song2.getTracker().getHeard());
        assertEquals(0, song2.getTracker().getLiked());
        assertEquals(1, song3.getTracker().getHeard());
        assertEquals(1, song3.getTracker().getLiked());
    }*/
    
}
