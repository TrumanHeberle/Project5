package prj5;

import student.TestCase;

/**
 * Tests the Tracker class
 * 
 * @author Truman Heberle
 * @version 4.19.2017
 */
public class TrackerTest extends TestCase {
     private Tracker track;
     private Person a;
     private Person b;
     private Person c;
     
     /**
      * Runs before each test case
      */
     public void setUp() {
         track = new Tracker();
     }
}
