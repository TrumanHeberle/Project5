/**
 * 
 */
package prj5;

import java.util.Iterator;

/**
 * @author AshlynUser
 * @version 2017.04.19
 */
public class Song {

    private String title;
    private String artist;
    private int year;
    private String genre;
    private int songNum;
    private Tracker tracker;
    
    /**
     * constructor
     * @param title1
     * @param artist1
     * @param year1
     * @param genre1
     * @param songNum1
     */
    public Song(String title1, String artist1, 
        int year1, String genre1, int songNum1) {
        title = title1;
        artist = artist1;
        year = year1;
        genre = genre1;
        songNum = songNum1;
        tracker = new Tracker();
    }
    
    /**
     * returns the title
     * @return
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * returns the artist
     * @return
     */
    public String getArtist() {
        return artist;
    }
    
    /**
     * returns the year
     * @return
     */
    public int getYear() {
        return year;
    }
    
    /**
     * returns the genre
     * @return
     */
    public String getGenre() {
        return genre;
    }
    
    /**
     * adds data
     * @param person
     
    public void addData(Person person) {
        if (person.getLiked(songNum)) {
            tracker.addHear(person.getHobby(), person.getMajor(), 
                person.getRegion());
            tracker.addLike(person.getHobby(), person.getMajor(), 
                person.getRegion());
        }
        else if (person.getHeard(songNum)) {
            tracker.addHear(person.getHobby(), person.getMajor(), 
                person.getRegion());
        }
    }
    */
    
    /**
     * returns the tracker
     * @return
     */
    public Tracker getTracker() {
        return tracker;
    }
    
    
    /**
     * returns the number of heard and liked by major
     * @return the int array of heard and liked
     */
    public int[] getMajorScore(MajorEnum major, DoublyLinkedList<Person> list)
    {
        int yesHeard = 0;
        int noHeard = 0;
        int yesLiked = 0;
        int noLiked = 0;
        int[] score = new int[2];
        //later add methods here for getting the percentage, which we can use
        //for the visual aspect
        //need to define this personList class
        DoublyLinkedList<Person> majorList = list.getChosenMajorList(major);
        Iterator<Person> iter = majorList.iterator();
        while (iter.hasNext())
        {
            Person person = iter.next();
            if (person.getAnswers()[songNum].equalsIgnoreCase("yes"))
            {
                yesHeard++;
            }
            else if (person.getAnswers()[songNum].equalsIgnoreCase("no"))
            {
                noHeard++;
            }
            if (person.getAnswers()[songNum + 1].equalsIgnoreCase("yes"))
            {
                yesLiked++;
            }
            else if (person.getAnswers()[songNum + 1].equalsIgnoreCase("no"))
            {
                noLiked++;
            }
        }
        //calculate score here later (percentage) and have to use doubles, not ints
        score[0] = yesHeard;
        score[1] = yesLiked;
        return score;
    }
    
    /**
     * returns the number of heard and liked by hobby
     * @return the int array of heard and liked
     */
    public int[] getHobbyScore(HobbyEnum hobby, DoublyLinkedList<Person> list)
    {
        int yesHeard = 0;
        int noHeard = 0;
        int yesLiked = 0;
        int noLiked = 0;
        int[] score = new int[2];
        //later add methods here for getting the percentage, which we can use
        //for the visual aspect
        //need to define this personList class
        DoublyLinkedList<Person> hobbyList = list.getChosenHobbyList(hobby);
        Iterator<Person> iter = hobbyList.iterator();
        while (iter.hasNext())
        {
            Person person = iter.next();
            if (person.getAnswers()[songNum].equalsIgnoreCase("yes"))
            {
                yesHeard++;
            }
            else if (person.getAnswers()[songNum].equalsIgnoreCase("no"))
            {
                noHeard++;
            }
            if (person.getAnswers()[songNum + 1].equalsIgnoreCase("yes"))
            {
                yesLiked++;
            }
            else if (person.getAnswers()[songNum + 1].equalsIgnoreCase("no"))
            {
                noLiked++;
            }
        }
        //calculate score here later (percentage) and have to use doubles, not ints
        score[0] = yesHeard;
        score[1] = yesLiked;
        return score;
    }
    
    /**
     * returns the number of heard and liked by region
     * @return the int array of heard and liked
     */
    public int[] getRegionScore(RegionEnum region, DoublyLinkedList<Person> list)
    {
        int yesHeard = 0;
        int noHeard = 0;
        int yesLiked = 0;
        int noLiked = 0;
        int[] score = new int[2];
        //later add methods here for getting the percentage, which we can use
        //for the visual aspect
        //need to define this personList class
        DoublyLinkedList<Person> regionList = list.getChosenRegionList(region);
        Iterator<Person> iter = regionList.iterator();
        while (iter.hasNext())
        {
            Person person = iter.next();
            if (person.getAnswers()[songNum].equalsIgnoreCase("yes"))
            {
                yesHeard++;
            }
            else if (person.getAnswers()[songNum].equalsIgnoreCase("no"))
            {
                noHeard++;
            }
            if (person.getAnswers()[songNum + 1].equalsIgnoreCase("yes"))
            {
                yesLiked++;
            }
            else if (person.getAnswers()[songNum + 1].equalsIgnoreCase("no"))
            {
                noLiked++;
            }
        }
        //calculate score here later (percentage) and have to use doubles, not ints
        score[0] = yesHeard;
        score[1] = yesLiked;
        return score;
    }
}
