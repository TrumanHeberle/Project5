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
        switch (hobby) {
            case ART:
                return heardArt;
            case READ:
                return heardRead;
            case SPORTS:
                return heardSports;
            case MUSIC:
                return heardMusic;
            default:
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
        switch (hobby) {
            case ART:
                return likedArt;
            case READ:
                return likedRead;
            case SPORTS:
                return likedSports;
            case MUSIC:
                return likedMusic;
            default:
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
        switch (major) {
            case COMPUTER_SCIENCE:
                return heardCompSci;
            case OTHER_ENGINEERING:
                return heardOtherEnge;
            case MATH_CMDA:
                return heardMathCMDA;
            case OTHER:
                return heardOther;
            default:
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
        switch (major) {
            case COMPUTER_SCIENCE:
                return likedCompSci;
            case OTHER_ENGINEERING:
                return likedOtherEnge;
            case MATH_CMDA:
                return likedMathCMDA;
            case OTHER:
                return likedOther;
            default:
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
        switch (region) {
            case NORTH_EAST_US:
                return heardNE;
            case SOUTH_EAST_US:
                return heardSE;
            case OTHER_US:
                return heardOtherUS;
            case OUTSIDE_US:
                return heardOutside;
            default:
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
        switch (region) {
            case NORTH_EAST_US:
                return likedNE;
            case SOUTH_EAST_US:
                return likedSE;
            case OTHER_US:
                return likedOtherUS;
            case OUTSIDE_US:
                return likedOutside;
            default:
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
        switch (hobby) {
            case ART:
                heardArt++;
                break;
            case READ:
                heardRead++;
                break;
            case SPORTS:
                heardSports++;
                break;
            case MUSIC:
                heardMusic++;
                break;
            default:
                break;
        }

        switch (major) {
            case COMPUTER_SCIENCE:
                heardCompSci++;
                break;
            case OTHER_ENGINEERING:
                heardOtherEnge++;
                break;
            case MATH_CMDA:
                heardMathCMDA++;
                break;
            case OTHER:
                heardOther++;
                break;
            default:
                break;
        }

        switch (region) {
            case NORTH_EAST_US:
                heardNE++;
                break;
            case SOUTH_EAST_US:
                heardSE++;
                break;
            case OTHER_US:
                heardOtherUS++;
                break;
            case OUTSIDE_US:
                heardOutside++;
                break;
            default:
                break;
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
        switch (hobby) {
            case ART:
                likedArt++;
                break;
            case READ:
                likedRead++;
                break;
            case SPORTS:
                likedSports++;
                break;
            case MUSIC:
                likedMusic++;
                break;
            default:
                break;
        }

        switch (major) {
            case COMPUTER_SCIENCE:
                likedCompSci++;
                break;
            case OTHER_ENGINEERING:
                likedOtherEnge++;
                break;
            case MATH_CMDA:
                likedMathCMDA++;
                break;
            case OTHER:
                likedOther++;
                break;
            default:
                break;
        }

        switch (region) {
            case NORTH_EAST_US:
                likedNE++;
                break;
            case SOUTH_EAST_US:
                likedSE++;
                break;
            case OTHER_US:
                likedOtherUS++;
                break;
            case OUTSIDE_US:
                likedOutside++;
                break;
            default:
                break;
        }
    }
}
