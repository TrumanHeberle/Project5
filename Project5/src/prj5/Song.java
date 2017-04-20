package prj5;

/**
 * Contains information about a song
 * 
 * @author Truman Heberle trumanh
 * @version 4.15.2017
 */
public class Song {
    private String title;
    private String artist;
    private int year;
    private String genre;
    private int songNum;
    private Tracker tracker;


    /**
     * Creates a new Song object
     * 
     * @param title1
     *            The song title
     * @param artist1
     *            The artist name
     * @param year1
     *            The production year
     * @param genre1
     *            The song genre
     * @param songNum1
     *            The song identifier
     */
    public Song(
        String title1,
        String artist1,
        int year1,
        String genre1,
        int songNum1) {
        title = title1;
        artist = artist1;
        year = year1;
        genre = genre1;
        songNum = songNum1;
        tracker = new Tracker();
    }


    /**
     * Returns the title of the song
     * 
     * @return The title of the song
     */
    public String getTitle() {
        return title;
    }


    /**
     * Returns the name of the artist
     * 
     * @return The name of the artist
     */
    public String getArtist() {
        return artist;
    }


    /**
     * Returns the year of production
     * 
     * @return The year of production
     */
    public int getYear() {
        return year;
    }


    /**
     * Returns the genre of the song
     * 
     * @return The genre of the song
     */
    public String getGenre() {
        return genre;
    }


    /**
     * Adds the data of a person to the song's tracker
     * 
     * @param person
     *            The person to check
     */
    public void addData(Person person) {
        if (person.getLiked(songNum)) {
            tracker.addHear(person.getHobby(), person.getMajor(), person
                .getRegion());
            tracker.addLike(person.getHobby(), person.getMajor(), person
                .getRegion());
        }
        else if (person.getHeard(songNum)) {
            tracker.addHear(person.getHobby(), person.getMajor(), person
                .getRegion());
        }
    }


    /**
     * Returns the song's Tracker
     * 
     * @return The song's Tracker
     */
    public Tracker getTracker() {
        return tracker;
    }
}
