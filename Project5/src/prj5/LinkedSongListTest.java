package prj5;

//import java.io.FileNotFoundException;
import student.TestCase;

/**
 * Tests the PersonScanner class
 * 
 * @author Truman Heberle trumanh
 * @version 4.19.2017
 */
public class LinkedSongListTest extends TestCase {
    private LinkedSongList<Song> list;
    private Song song1;
    private Song song2;
    private Song song3;


    /**
     * Runs before each test case
     */
    public void setUp() {
        list = new LinkedSongList<Song>();
        song1 = new Song("Watching the Detectives", "Elvis Costello", 1977,
            "punk", 1);
        song2 = new Song("Upside Down", "Diana Ross", 1980, "disco", 2);
        song3 = new Song("Uma Thurman", "Fall Out Boy", 2015, "rock", 3);
        list.add(0, song1);
        list.add(1, song2);
        list.add(2, song3);
    }


    /**
     * Tests the sortByTitle method
     */
    public void testSortByTitle() {
        LinkedSongList<Song> list1 = new LinkedSongList<Song>();
        song1 = new Song("Watching the Detectives", "Elvis Costello", 1977,
            "punk", 1);
        song2 = new Song("Upside Down", "Diana Ross", 1980, "disco", 2);
        song3 = new Song("Uma Thurman", "Fall Out Boy", 2015, "rock", 3);
        list1.add(0, song3);
        list1.add(1, song2);
        list1.add(2, song1);
        assertEquals(list.sortByTitle(), list1);
    }


    /**
     * Tests the sortByArtist method
     */
    public void testSortByArtist() {
        LinkedSongList<Song> list1 = new LinkedSongList<Song>();
        song1 = new Song("Watching the Detectives", "Elvis Costello", 1977,
            "punk", 1);
        song2 = new Song("Upside Down", "Diana Ross", 1980, "disco", 2);
        song3 = new Song("Uma Thurman", "Fall Out Boy", 2015, "rock", 3);
        list1.add(0, song2);
        list1.add(1, song1);
        list1.add(2, song3);
        assertEquals(list.sortByArtist(), list1);
    }


    /**
     * Tests the sortByYear method
     */
    public void testSortByYear() {
        LinkedSongList<Song> list1 = new LinkedSongList<Song>();
        song1 = new Song("Watching the Detectives", "Elvis Costello", 1977,
            "punk", 1);
        song2 = new Song("Upside Down", "Diana Ross", 1980, "disco", 2);
        song3 = new Song("Uma Thurman", "Fall Out Boy", 2015, "rock", 3);
        list1.add(0, song1);
        list1.add(1, song2);
        list1.add(2, song3);
        assertEquals(list.sortByTitle(), list1);
    }


    /**
     * Tests the sortByGenre method
     */
    public void testSortByGenre() {
        LinkedSongList<Song> list1 = new LinkedSongList<Song>();
        song1 = new Song("Watching the Detectives", "Elvis Costello", 1977,
            "punk", 1);
        song2 = new Song("Upside Down", "Diana Ross", 1980, "disco", 2);
        song3 = new Song("Uma Thurman", "Fall Out Boy", 2015, "rock", 3);
        list1.add(0, song2);
        list1.add(1, song1);
        list1.add(2, song3);
        assertEquals(list.sortByTitle(), list1);
    }
}
