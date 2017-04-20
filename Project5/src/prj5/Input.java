/**
 * 
 */
package prj5;

import java.io.FileNotFoundException;

/**
 * @author AshlynUser
 *
 */
public class Input {

    /**
     * Runs the program
     * @param args the person file and song file in that order
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException {
        PersonScanner personScanner = new PersonScanner(args[0]);
        SongScanner songScanner = new SongScanner(args[1]);
        GUIDisplayWindow gui;
        gui = new GUIDisplayWindow();
        LinkedSongList<Song> songs = (LinkedSongList<Song>)new LinkedSongList<Song>().sortByTitle();
        songs.sortByTitle();
        for (int i = 0; i < songs.size(); i++)
        {
            
        }
        System.out.print("hello");
    }
}
