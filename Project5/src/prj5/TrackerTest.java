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
     
     /**
      * Runs before each test case
      */
     public void setUp() {
         track = new Tracker();
     }
     
     /**
      * tests the addHear method
      */
     public void testAddHear()
     {
          track.addHear(ART, COMPUTER_SCIENCE, NORTH_EAST_US);
          track.addHear(READ, OTHER_ENGINEERING, SOUTH_EAST_US);
          track.addHear(SPORTS, MATH_CMDA, OTHER_US);
          track.addHear(MUSIC, OTHER, OUTSIDE_US);
          
          assertEquals(track.getHeardByRegion(NORTH_EAST_US), 1);
          assertEquals(track.getHeardByRegion(SOUTH_EAST_US), 1);
          assertEquals(track.getHeardByRegion(OUTHER_US), 1);
          assertEquals(track.getHeardByRegion(OUTSIDE_US), 1);
          
          assertEquals(track.getHeardByMajor(COMPUTER_SCIENCE), 1);
          assertEquals(track.getHeardByMajor(OTHER_ENGINEERING), 1);
          assertEquals(track.getHeardByMajor(MATH_CMDA), 1);
          assertEquals(track.getHeardByMajor(OTHER), 1);
          
          assertEquals(track.getHeardByHobby(ART), 1);
          assertEquals(track.getHeardByHobby(READ), 1);
          assertEquals(track.getHeardByHobby(SPORTS), 1);
          assertEquals(track.getHeardByHobby(MUSIC), 1);
     }
     
     /**
      * tests the addLike method
      */
     public void testAddLike()
     {
          track.addLike(ART, COMPUTER_SCIENCE, NORTH_EAST_US);
          track.addLike(READ, OTHER_ENGINEERING, SOUTH_EAST_US);
          track.addLike(SPORTS, MATH_CMDA, OTHER_US);
          track.addLike(MUSIC, OTHER, OUTSIDE_US);
          
          assertEquals(track.getLikedByRegion(NORTH_EAST_US), 1);
          assertEquals(track.getLikedByRegion(SOUTH_EAST_US), 1);
          assertEquals(track.getLikedByRegion(OUTHER_US), 1);
          assertEquals(track.getLikedByRegion(OUTSIDE_US), 1);
          
          assertEquals(track.getLikedByMajor(COMPUTER_SCIENCE), 1);
          assertEquals(track.getLikedByMajor(OTHER_ENGINEERING), 1);
          assertEquals(track.getLikedByMajor(MATH_CMDA), 1);
          assertEquals(track.getLikedByMajor(OTHER), 1);
          
          assertEquals(track.getLikedByHobby(ART), 1);
          assertEquals(track.getLikedByHobby(READ), 1);
          assertEquals(track.getLikedByHobby(SPORTS), 1);
          assertEquals(track.getLikedByHobby(MUSIC), 1);
     }
}
