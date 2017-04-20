package prj5;

import java.io.FileNotFoundException;
import student.TestCase;

/**
 * Tests the SongScanner class
 * 
 * @author trumanh
 * @version 4.19.2017
 */
public class SongScannerTest extends TestCase {
    private SongScanner ss;
    private LinkedSongList<Song> list;


    /**
     * Runs before each test case
     */
    public void setUp() {
        ss = new SongScanner();
        list = new LinkedSongList<Song>();
    }


    /**
     * Tests the scanPeople method
     */
    public void testScanPeople() {
        try {
            ss.scanSongs("SongListTest1.csv");
        }
        catch (FileNotFoundException e) {
            e.getMessage();
        }

        list = ss.getSongList();
    }
    
    /**
     * Tests the auto constructor
     */
    public void testConstructor() {
        try {
            ss = new SongScanner("SongListTest1.csv");
        }
        catch (FileNotFoundException e) {
            e.getMessage();
        }
        
        list = ss.getSongList();
    }
}
