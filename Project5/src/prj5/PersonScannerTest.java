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
    
    /**
     * Runs before each test case
     */
    public void setUp() {
        ps = new PersonScanner();
        list = new DoublyLinkedList<Person>();
    }
    
    public void testScanPeople() {
        try {
            ps.scanPeople("MusicSurveyDataTest1.csv");
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
        
        list = ps.getPeopleList();
    }
}
