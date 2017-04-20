package prj5;

/**
 * Contains information about a person
 * 
 * @author Truman Heberle trumanh
 * @version 4.15.2017
 */
public class Person {
    private int identity;
    private String date;
    private HobbyEnum hobby;
    private MajorEnum major;
    private RegionEnum region;
    private String[] answers;
    private static final String YES_MAP = "yes";


    /**
     * Creates a new Person Object
     * 
     * @param id
     *            The person's id
     * @param dateS
     *            The person's date
     * @param hobbyS
     *            The person's hobby (String)
     * @param majorS
     *            The person's major (String)
     * @param regionS
     *            The person's region (String)
     * @param answersS
     *            The person's list of answers
     */
    public Person(
        int id,
        String dateS,
        String hobbyS,
        String majorS,
        String regionS,
        String[] answersS) {
        identity = id;
        date = dateS;
        hobby = this.setHobby(hobbyS);
        major = this.setMajor(majorS);
        region = this.setRegion(regionS);
        answers = answersS;
    }


    /**
     * Gets the person's id
     * 
     * @return The person's id
     */
    public int getId() {
        return identity;
    }


    /**
     * Gets the person's date
     * 
     * @return The person's date
     */
    public String getDate() {
        return date;
    }


    /**
     * Gets the person's hobby
     * 
     * @return The person's hobby
     */
    public HobbyEnum getHobby() {
        return hobby;
    }


    /**
     * Gets the person's major
     * 
     * @return The person's major
     */
    public MajorEnum getMajor() {
        return major;
    }


    /**
     * Gets the person's region
     * 
     * @return The person's region
     */
    public RegionEnum getRegion() {
        return region;
    }


    /**
     * Gets the person's response to heard a song by song number
     * 
     * @param songNum
     *            The song's reference number
     * @return The person's response
     */
    public boolean getHeard(int songNum) {
        return YES_MAP.equals(answers[2 * songNum].toLowerCase());
    }


    /**
     * Gets the person's response to liking a song by song number
     * 
     * @param songNum
     *            The song's reference number
     * @return The person's response
     */
    public boolean getLiked(int songNum) {
        try
        {
            return YES_MAP.equals(answers[1 + 2 * songNum].toLowerCase());
        }
        catch (Exception e)
        {
            
        }
        return false;
    }


    /**
     * Sets the hobby based on an input String
     * 
     * @param hobbyString
     *            The String used to compare
     * @return The corresponding HobbyEnum
     */
    private HobbyEnum setHobby(String hobbyString) {
        hobbyString = hobbyString.toLowerCase();
        if (hobbyString.equals("reading")) {
            return HobbyEnum.READ;
        }
        if (hobbyString.equals("sports")) {
            return HobbyEnum.SPORTS;
        }
        if (hobbyString.equals("music")) {
            return HobbyEnum.MUSIC;
        }
        if (hobbyString.equals("art")) {
            return HobbyEnum.ART;
        }
        return null;
    }


    /**
     * Sets the major based on an input String
     * 
     * @param majorString
     *            The String used to compare
     * @return The corresponding MajorEnum
     */
    private MajorEnum setMajor(String majorString) {
        majorString = majorString.toLowerCase();
        if (majorString.equals("computer science")) {
            return MajorEnum.COMPUTER_SCIENCE;
        }
        if (majorString.equals("math or cmda")) {
            return MajorEnum.MATH_CMDA;
        }
        if (majorString.equals("other")) {
            return MajorEnum.OTHER;
        }
        if (majorString.equals("other engineering")) {
            return MajorEnum.OTHER_ENGINEERING;
        }
        return null;
    }


    /**
     * Sets the region based on an input String
     * 
     * @param regionString
     *            The String used to compare
     * @return The corresponding RegionEnum
     */
    private RegionEnum setRegion(String regionString) {
        regionString = regionString.toLowerCase();
        if (regionString.equals("southeast")) {
            return RegionEnum.SOUTH_EAST_US;
        }
        if (regionString.equals("northeast")) {
            return RegionEnum.NORTH_EAST_US;
        }
        if (regionString.equals("united states (other than southeast or northwest)")) {
            return RegionEnum.OTHER_US;
        }
        if (regionString.equals("outside of united states")) {
            return RegionEnum.OUTSIDE_US;
        }
        return null;
    }
}
