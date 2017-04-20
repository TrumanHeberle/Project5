package prj5;

import java.io.FileNotFoundException;
import student.TestCase;

/**
 * Tests the PersonScanner class
 * 
 * @author Truman Heberle trumanh
 * @version 4.18.2017
 */
public class PersonScannerTest extends TestCase {
    private PersonScanner ps;
    private DoublyLinkedList<Person> list;
    private PersonScanner scanner;


    /**
     * Runs before each test case
     */
    public void setUp() {
        ps = new PersonScanner();
        list = new DoublyLinkedList<Person>();
    }

    /**
     * Tests the scanPeople method
     */
    public void testScanPeople() {
        try {
            ps.scanPeople("MusicSurveyDataTest1.csv");
        }
        catch (FileNotFoundException e) {
            e.getMessage();
        }

        list = ps.getPeopleList();
        assertEquals(6, list.size());
        assertEquals(MajorEnum.COMPUTER_SCIENCE, list.getBack().getMajor());
    }
    
    /**
     * tests the scanner when the file is empty
     */
    public void testScanPeopleEmpty()
    {
        try {
            ps.scanPeople("input1");
        }
        catch (FileNotFoundException e)
        {
            e.getMessage();
        }
        assertEquals(0, ps.getPeopleList().size());
    }
    
    /**
     * tests the scanner when the file has one line
     */
    public void testScanPeopleOneLine()
    {
        try {
            ps.scanPeople("input2");
        }
        catch (FileNotFoundException e)
        {
            e.getMessage();
        }
        assertEquals(0, ps.getPeopleList().size());
    }
    
    /**
     * tests the scanner when the file has two lines
     */
    public void testScanPeopleTwoLines()
    {
        try {
            ps.scanPeople("input3");
        }
        catch (FileNotFoundException e)
        {
            e.getMessage();
        }
        assertEquals(0, ps.getPeopleList().size());
    }
    
    /**
     * tests the auto constructor
     */
    public void testConstructor()
    {
        try
        {
            scanner = new PersonScanner("MusicSurveyDataTest1");
        }
        catch (FileNotFoundException e)
        {
            e.getMessage();
        }
        list = ps.getPeopleList();
        assertEquals(6, list.size());
    }
    

}
