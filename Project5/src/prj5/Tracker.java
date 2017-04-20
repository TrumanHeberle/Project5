package prj5;

/**
 * Stores data about a song
 * 
 * @author Truman Heberle trumanh
 * @version 4.19.2017
 */
public class Tracker {
    private int liked;
    private int heard;
    private int heardRead;
    private int heardArt;
    private int heardSports;
    private int heardMusic;
    private int likedRead;
    private int likedArt;
    private int likedSports;
    private int likedMusic;
    private int heardCompSci;
    private int heardMathCMDA;
    private int heardOtherEnge;
    private int heardOther;
    private int likedCompSci;
    private int likedMathCMDA;
    private int likedOtherEnge;
    private int likedOther;
    private int heardNE;
    private int heardSE;
    private int heardOtherUS;
    private int heardOutside;
    private int likedNE;
    private int likedSE;
    private int likedOtherUS;
    private int likedOutside;


    /**
     * Creates a tracker with all zero data
     */
    public Tracker() {
        liked = 0;
        heard = 0;
        heardRead = 0;
        heardArt = 0;
        heardSports = 0;
        heardMusic = 0;
        likedRead = 0;
        likedArt = 0;
        likedSports = 0;
        likedMusic = 0;
        heardCompSci = 0;
        heardMathCMDA = 0;
        heardOtherEnge = 0;
        heardOther = 0;
        likedCompSci = 0;
        likedMathCMDA = 0;
        likedOtherEnge = 0;
        likedOther = 0;
        heardNE = 0;
        heardSE = 0;
        heardOtherUS = 0;
        heardOutside = 0;
        likedNE = 0;
        likedSE = 0;
        likedOtherUS = 0;
        likedOutside = 0;
    }


    /**
     * Returns the total amount of people who liked the song
     * 
     * @return The total amount of people who liked the song
     */
    public int getLiked() {
        return liked;
    }


    /**
     * Returns the total amount of people who heard the song
     * 
     * @return The total amount of people who heard the song
     */
    public int getHeard() {
        return heard;
    }


    /**
     * Returns the number of people who heard the song by hobby
     * 
     * @param hobby
     *            The specific type of hobby which people heard the song
     * @return The number of people who have a specified hobby that heard the
     *         song
     */
    public int getHeardByHobby(HobbyEnum hobby) {
        if (hobby.equals(ART))
        {
            return heardArt;
        }
        else if (hobby.equals(READ))
        {
            return heardRead;
        }
        else if (hobby.equals(SPORTS))
        {
            return heardSports;
        }
        else if (hobby.equals(MUSIC))
        {
            return heardMusic;
        }
        else
        {
            throw new IllegalArgumentException("That enum is invalid");
        }
    }


    /**
     * Returns the number of people who liked the song by hobby
     * 
     * @param hobby
     *            The specific type of hobby which people liked the song
     * @return The number of people who have a specified hobby that liked the
     *         song
     */
    public int getLikedByHobby(HobbyEnum hobby) {
        if (hobby.equals(ART))
        {
            return likedArt;
        }
        else if (hobby.equals(READ))
        {
            return likedRead;
        }
        else if (hobby.equals(SPORTS))
        {
            return likedSports;
        }
        else if (hobby.equals(MUSIC))
        {
            return likedMusic;
        }
        else
        {
            throw new IllegalArgumentException("That enum is invalid");
        }
    }


    /**
     * Returns the number of people who heard the song by major
     * 
     * @param major
     *            The specific type of major which people heard the song
     * @return The number of people who have a specified major that heard the
     *         song
     */
    public int getHeardByMajor(MajorEnum major) {
        if (major.equals(COMPUTER_SCIENCE))
        {
            return heardCompSci;
        }
        else if (major.equals(OTHER_ENGINEERING))
        {
            return heardOtherEnge;
        }
        else if (major.equals(MATH_CMDA))
        {
            return heardMathCMDA;
        }
        else if (major.equals(OTHER))
        {
            return heardOther;
        }
        else
        {
            throw new IllegalArgumentException("That enum is invalid");
        }
    }


    /**
     * Returns the number of people who liked the song by major
     * 
     * @param major
     *            The specific type of major which people liked the song
     * @return The number of people who have a specified major that liked the
     *         song
     */
    public int getLikedByMajor(MajorEnum major) {
        if (major.equals(COMPUTER_SCIENCE))
        {
            return likedCompSci;
        }
        else if (major.equals(OTHER_ENGINEERING))
        {
            return likedOthlikeerEnge;
        }
        else if (major.equals(MATH_CMDA))
        {
            return likedMathCMDA;
        }
        else if (major.equals(OTHER))
        {
            return likedOther;
        }
        else
        {
            throw new IllegalArgumentException("That enum is invalid");
        }
    }


    /**
     * Returns the number of people who heard the song by region
     * 
     * @param region
     *            The specific type of region which people heard the song
     * @return The number of people who have a specified region that heard the
     *         song
     */
    public int getHeardByRegion(RegionEnum region) {
        if (region.equals(NORTH_EAST_US))
        {
            return heardNE;
        }
        else if (region.equals(SOUTH_EAST_US))
        {
            return heardSE;
        }
        else if (region.equals(OTHER_US))
        {
            return heardOtherUS;
        }
        else if (region.equals(OUTSIDE_US))
        {
            return heardOutside;
        }
        else
        {
            throw new IllegalArgumentException("That enum is invalid");
        }
    }


    /**
     * Returns the number of people who liked the song by region
     * 
     * @param region
     *            The specific type of region which people liked the song
     * @return The number of people who have a specified region that liked the
     *         song
     */
    public int getLikedByRegion(RegionEnum region) {
        if (region.equals(NORTH_EAST_US))
        {
            return likedNE;
        }
        else if (region.equals(SOUTH_EAST_US))
        {
            return likedSE;
        }
        else if (region.equals(OTHER_US))
        {
            return likedOtherUS;
        }
        else if (region.equals(OUTSIDE_US))
        {
            return likedOutside;
        }
        else
        {
            throw new IllegalArgumentException("That enum is invalid");
        }
    }


    /**
     * Adds one too each respectful heard variable based on:
     * major, hobby, and region
     * 
     * @param hobby
     *            The person's hobby who heard the song
     * @param major
     *            The person's major who heard the song
     * @param region
     *            The person's region who heard the song
     */
    public void addHear(HobbyEnum hobby, MajorEnum major, RegionEnum region) {
        heard++;
        if (hobby.equals(ART))
        {
            heardArt++;
        }
        else if (hobby.equals(READ))
        {
            heardRead++;
        }
        else if (hobby.equals(SPORTS))
        {
            heardSports++;
        }
        else if (hobby.equals(MUSIC))
        {
            heardMusic++;
        }

        if (major.equals(COMPUTER_SCIENCE))
        {
            heardCompSci++;
        }
        else if (major.equals(OTHER_ENGINEERING))
        {
            heardOtherEnge++;
        }
        else if (major.equals(MATH_CMDA))
        {
            heardMathCMDA++;
        }
        else if (major.equals(OTHER))
        {
            heardOther++;
        }

        if (region.equals(NORTH_EAST_US))
        {
            heardNE++;
        }
        else if (region.equals(SOUTH_EAST_US))
        {
            heardSE++;
        }
        else if (region.equals(OTHER_US))
        {
            heardOtherUS++;
        }
        else if (region.equals(OUTSIDE_US))
        {
            heardOutside++;
        }
        }
    }


    /**
     * Adds one too each respectful liked variable based on:
     * major, hobby, and region
     * 
     * @param hobby
     *            The person's hobby who liked the song
     * @param major
     *            The person's major who liked the song
     * @param region
     *            The person's region who liked the song
     */
    public void addLike(HobbyEnum hobby, MajorEnum major, RegionEnum region) {
        liked++;
        if (hobby.equals(ART))
        {
            likedArt++;
        }
        else if (hobby.equals(READ))
        {
            likedRead++;
        }
        else if (hobby.equals(SPORTS))
        {
            likedSports++;
        }
        else if (hobby.equals(MUSIC))
        {
            likedMusic++;
        }

        if (major.equals(COMPUTER_SCIENCE))
        {
            likedCompSci++;
        }
        else if (major.equals(OTHER_ENGINEERING))
        {
            likedOthlikeerEnge++;
        }
        else if (major.equals(MATH_CMDA))
        {
            likedMathCMDA++;
        }
        else if (major.equals(OTHER))
        {
            likedOther++;
        }

        if (region.equals(NORTH_EAST_US))
        {
            likedNE++;
        }
        else if (region.equals(SOUTH_EAST_US))
        {
            likedSE++;
        }
        else if (region.equals(OTHER_US))
        {
            likedOtherUS++;
        }
        else if (region.equals(OUTSIDE_US))
        {
            likedOutside++;
        }
    }
}
