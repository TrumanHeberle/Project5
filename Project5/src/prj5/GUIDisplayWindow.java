package prj5;

import java.awt.Color;
//import java.io.FileNotFoundException;
import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
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
        window.setSize(800, 500);
        
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
        createGlyph();
        createLegend();
        
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
    
    /**
     * creates a default glyph
     * 
     */
    public void createGlyph()
    {
        TextShape title = new TextShape(40, 5, "All These Things I've Done", Color.BLACK);
        title.setBackgroundColor(Color.WHITE);
        window.addShape(title);
        TextShape artist = new TextShape(80, 25, "by The Killers", Color.BLACK);
        artist.setBackgroundColor(Color.WHITE);
        window.addShape(artist);
        Shape line = new Shape(120, 45, 7, 48, Color.BLACK);
        window.addShape(line);
        Shape leftPink = new Shape(90, 45, 30, 12, Color.MAGENTA);
        window.addShape(leftPink);
        Shape rightPink = new Shape(127, 45, 20, 12, Color.MAGENTA);
        window.addShape(rightPink);
        Shape leftBlue = new Shape(70, 57, 50, 12, Color.BLUE);
        window.addShape(leftBlue);
        Shape rightBlue = new Shape(127, 57, 40, 12, Color.BLUE);
        window.addShape(rightBlue);
        Shape leftYellow = new Shape(80, 69, 40, 12, Color.ORANGE);
        window.addShape(leftYellow);
        Shape rightYellow = new Shape(127, 69, 30, 12, Color.ORANGE);
        window.addShape(rightYellow);
        Shape leftGreen = new Shape(75, 81, 45, 12, Color.GREEN);
        window.addShape(leftGreen);
        Shape rightGreen = new Shape(127, 81, 25, 12, Color.GREEN);
        window.addShape(rightGreen);
    }
    
    /**
     * creates the legend
     */
    public void createLegend()
    {
        Shape box = new Shape(640, 180, 120, 180, Color.BLACK);
        box.setBackgroundColor(Color.WHITE);
        window.addShape(box);
        TextShape hobbyLegend = new TextShape(650, 190, "Hobby Legend", Color.BLACK);
        hobbyLegend.setBackgroundColor(Color.WHITE);
        window.addShape(hobbyLegend);
        window.moveToFront(hobbyLegend);
        TextShape read = new TextShape(650, 210, "Read", Color.MAGENTA);
        read.setBackgroundColor(Color.WHITE);
        window.addShape(read);
        window.moveToFront(read);
        TextShape art = new TextShape(650, 230, "Art", Color.BLUE);
        art.setBackgroundColor(Color.WHITE);
        window.addShape(art);
        window.moveToFront(art);
        TextShape sports = new TextShape(650, 250, "Sports", Color.ORANGE);
        sports.setBackgroundColor(Color.WHITE);
        window.addShape(sports);
        window.moveToFront(sports);
        TextShape music = new TextShape(650, 270, "Music", Color.GREEN);
        music.setBackgroundColor(Color.WHITE);
        window.addShape(music);
        window.moveToFront(music);
        TextShape songTitle = new TextShape(665, 290, "Song Title", Color.BLACK);
        songTitle.setBackgroundColor(Color.WHITE);
        window.addShape(songTitle);
        window.moveToFront(songTitle);
        Shape blackBox = new Shape(700, 310, 5, 44, Color.BLACK);
        window.addShape(blackBox);
        window.moveToFront(blackBox);
        TextShape heard = new TextShape(650, 325, "Heard", Color.BLACK);
        heard.setBackgroundColor(Color.WHITE);
        window.addShape(heard);
        window.moveToFront(heard);
        TextShape likes = new TextShape(710, 325, "Likes", Color.BLACK);
        likes.setBackgroundColor(Color.WHITE);
        window.addShape(likes);
        window.moveToFront(likes);
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
