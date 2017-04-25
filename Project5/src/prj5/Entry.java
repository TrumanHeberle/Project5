/**
 * 
 */
package prj5;

import java.awt.Color;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;

/**
 * @author Ashlyn McDonald
 * @version 2017.04.25
 * 
 * Represents an individual entry for a song on the display
 *
 */
public class Entry {
    
    /**
     * constructor
     * @param song the song
     */
    public Entry(Song song, Window window)
    {
        TextShape title = new TextShape(40, 5, song.getTitle().toString(), Color.BLACK);
        title.setBackgroundColor(Color.WHITE);
        window.addShape(title);
        TextShape artist = new TextShape(80, 25, song.getArtist().toString(), Color.BLACK);
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
    

}
