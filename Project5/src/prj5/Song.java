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
    
    /**
     * constructor
     * @param title1 the title
     * @param artist1 the artist
     * @param year1 the year
     * @param genre1 the genre
     * @param songNum1 the song number
     */
    public Song(String title1, String artist1, 
        int year1, String genre1, int songNum1) {
        title = title1;
        artist = artist1;
        year = year1;
        genre = genre1;
        songNum = songNum1;
    }
    
    /**
     * returns the title
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * returns the artist
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }
    
    /**
     * returns the year
     * @return the year
     */
    public int getYear() {
        return year;
    }
    
    /**
     * returns the genre
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }
    
    /**
     * returns the number of heard and liked by major
     * @return the int array of heard and liked
     */
    public int[] getMajorScore(MajorEnum major, DoublyLinkedList<Person> list)
    {
        double yesHeard = 0;
        double noHeard = 0;
        double yesLiked = 0;
        double noLiked = 0;
        int[] score = new int[2];
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
        //calculate score here
        double totalHeard = yesHeard + noHeard;
        double scoreHeard = yesHeard / totalHeard;
        double totalLiked = yesLiked + noLiked;
        double scoreLiked = yesLiked / totalLiked;
        score[0] = (int)(scoreHeard * 100);
        score[1] = (int)(scoreLiked * 100);
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
        //calculate score here
        double totalHeard = yesHeard + noHeard;
        double scoreHeard = yesHeard / totalHeard;
        double totalLiked = yesLiked + noLiked;
        double scoreLiked = yesLiked / totalLiked;
        score[0] = (int)(scoreHeard * 100);
        score[1] = (int)(scoreLiked * 100);
        return score;
    }
    
    /**
     * returns the number of heard and liked by region
     * @return the int array of heard and liked
     */
    public int[] getRegionScore(RegionEnum region, 
    DoublyLinkedList<Person> list)
    {
        int yesHeard = 0;
        int noHeard = 0;
        int yesLiked = 0;
        int noLiked = 0;
        int[] score = new int[2];
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
        //calculate score here
        double totalHeard = yesHeard + noHeard;
        double scoreHeard = yesHeard / totalHeard;
        double totalLiked = yesLiked + noLiked;
        double scoreLiked = yesLiked / totalLiked;
        score[0] = (int)(scoreHeard * 100);
        score[1] = (int)(scoreLiked * 100);
        return score;
    }
}
