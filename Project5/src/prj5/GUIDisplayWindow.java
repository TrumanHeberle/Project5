package prj5;

//import java.io.FileNotFoundException;
import CS2114.Button;
import CS2114.Window;
import CS2114.WindowSide;

/**
 * Creates the GUI for the program
 * 
 * @author Truman Heberle trumanh
 * @version 4.19.2017
 */
public class GUIDisplayWindow {
    private Window window;
    private Entry leftTop;
    private Entry middleTop;
    private Entry rightTop;
    private Entry leftMiddle;
    private Entry middleMiddle;
    private Entry rightMiddle;
    private Entry leftBottom;
    private Entry middleBottom;
    private Entry rightBottom;
    private PersonScanner personScanner;
    private SongScanner songScanner;
    private DoublyLinkedList<Person> people;
    //private SONGLIST songs;
    private Button prev;
    private Button next;
    private Button artist;
    private Button title;
    private Button year;
    private Button genre;
    private Button hobby;
    private Button major;
    private Button region;
    private Button quit;
    
    public GUIDisplayWindow() {
        window = new Window();
        
        prev = new Button("Prev");
        prev.setTitle("Prev");
        prev.onClick(this, "clickedPrev");
        next = new Button("Next");
        next.setTitle("Next");
        next.onClick(this, "clickedNext");
        artist = new Button("Sort by Artist Name");
        artist.setTitle("Sort by Artist Name");
        artist.onClick(this, "clickedArtist");
        title = new Button("Sort by Song Title");
        title.setTitle("Sort by Song Title");
        title.onClick(this, "clickedTitle");
        year = new Button("Sort by Release Year");
        year.setTitle("Sort by Release Year");
        year.onClick(this, "clickedYear");
        genre = new Button("Sort by Genre");
        genre.setTitle("Sort by Genre");
        genre.onClick(this, "clickedGenre");
        hobby = new Button("Represent Hobby");
        hobby.setTitle("Represent Hobby");
        hobby.onClick(this, "clickedHobby");
        major = new Button("Represent Major");
        major.setTitle("Represent Major");
        major.onClick(this, "clickedMajor");
        region = new Button("Represent Region");
        region.setTitle("Represent Region");
        region.onClick(this, "clickedRegion");
        quit = new Button("Quit");
        quit.setTitle("Quit");
        quit.onClick(this, "clickedQuit");
        
        window.addButton(prev, WindowSide.NORTH);
        window.addButton(artist, WindowSide.NORTH);
        window.addButton(title, WindowSide.NORTH);
        window.addButton(year, WindowSide.NORTH);
        window.addButton(genre, WindowSide.NORTH);
        window.addButton(next, WindowSide.NORTH);
        window.addButton(hobby, WindowSide.SOUTH);
        window.addButton(major, WindowSide.SOUTH);
        window.addButton(region, WindowSide.SOUTH);
        window.addButton(quit, WindowSide.SOUTH);
        
        /*try {
            personScanner.scanPeople(peopleFile);
        } catch (FileNotFoundException e) {
            System.out.println("Person File Not Found.");
        }
        people = personScanner.getPeopleList();
        
        songScanner.scanSongs(songFile);
        songs = songScanner.getSongList();
        songs.sortByTitle();*/
    }
    
    public void clickedPrev(Button button) {
    }
    
    public void clickedNext(Button button) {
    }
    
    public void clickedArtist(Button button) {
    }
    
    public void clickedTitle(Button button) {
    }
    
    public void clickedYear(Button button) {
    }
    
    public void clickedGenre(Button button) {
    }
    
    public void clickedHobby(Button button) {
    }
    
    public void clickedMajor(Button button) {
    }
    
    public void clickedRegion(Button button) {
    }
    
    public void clickedQuit(Button button) {
        System.exit(0);
    }
}
