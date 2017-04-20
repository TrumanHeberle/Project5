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
          track.addHear(HobbyEnum.ART, MajorEnum.COMPUTER_SCIENCE, RegionEnum.NORTH_EAST_US);
          track.addHear(HobbyEnum.READ, MajorEnum.OTHER_ENGINEERING, RegionEnum.SOUTH_EAST_US);
          track.addHear(HobbyEnum.SPORTS, MajorEnum.MATH_CMDA, RegionEnum.OTHER_US);
          track.addHear(HobbyEnum.MUSIC, MajorEnum.OTHER, RegionEnum.OUTSIDE_US);
          
          assertEquals(track.getHeardByRegion(RegionEnum.NORTH_EAST_US), 1);
          assertEquals(track.getHeardByRegion(RegionEnum.SOUTH_EAST_US), 1);
          assertEquals(track.getHeardByRegion(RegionEnum.OTHER_US), 1);
          assertEquals(track.getHeardByRegion(RegionEnum.OUTSIDE_US), 1);
          
          assertEquals(track.getHeardByMajor(MajorEnum.COMPUTER_SCIENCE), 1);
          assertEquals(track.getHeardByMajor(MajorEnum.OTHER_ENGINEERING), 1);
          assertEquals(track.getHeardByMajor(MajorEnum.MATH_CMDA), 1);
          assertEquals(track.getHeardByMajor(MajorEnum.OTHER), 1);
          
          assertEquals(track.getHeardByHobby(HobbyEnum.ART), 1);
          assertEquals(track.getHeardByHobby(HobbyEnum.READ), 1);
          assertEquals(track.getHeardByHobby(HobbyEnum.SPORTS), 1);
          assertEquals(track.getHeardByHobby(HobbyEnum.MUSIC), 1);
     }
     
     /**
      * tests the addLike method
      */
     public void testAddLike()
     {
          track.addLike(HobbyEnum.ART, MajorEnum.COMPUTER_SCIENCE, RegionEnum.NORTH_EAST_US);
          track.addLike(HobbyEnum.READ, MajorEnum.OTHER_ENGINEERING, RegionEnum.SOUTH_EAST_US);
          track.addLike(HobbyEnum.SPORTS, MajorEnum.MATH_CMDA, RegionEnum.OTHER_US);
          track.addLike(HobbyEnum.MUSIC, MajorEnum.OTHER, RegionEnum.OUTSIDE_US);
          
          assertEquals(track.getLikedByRegion(RegionEnum.NORTH_EAST_US), 1);
          assertEquals(track.getLikedByRegion(RegionEnum.SOUTH_EAST_US), 1);
          assertEquals(track.getLikedByRegion(RegionEnum.OTHER_US), 1);
          assertEquals(track.getLikedByRegion(RegionEnum.OUTSIDE_US), 1);
          
          assertEquals(track.getLikedByMajor(MajorEnum.COMPUTER_SCIENCE), 1);
          assertEquals(track.getLikedByMajor(MajorEnum.OTHER_ENGINEERING), 1);
          assertEquals(track.getLikedByMajor(MajorEnum.MATH_CMDA), 1);
          assertEquals(track.getLikedByMajor(MajorEnum.OTHER), 1);
          
          assertEquals(track.getLikedByHobby(HobbyEnum.ART), 1);
          assertEquals(track.getLikedByHobby(HobbyEnum.READ), 1);
          assertEquals(track.getLikedByHobby(HobbyEnum.SPORTS), 1);
          assertEquals(track.getLikedByHobby(HobbyEnum.MUSIC), 1);
     }
}
