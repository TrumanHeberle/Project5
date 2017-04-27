
package prj5;

import java.io.FileNotFoundException;

import java.util.Iterator;

/**
 * @author AshlynUser
 *
 */
public class ProjectRunner {

    /**
     * Runs the program
     * 
     * @param args
     *            the person file and song file in that order
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length == 2)
        {
            PersonScanner personScanner = new PersonScanner(args[0]);
            DoublyLinkedList<Person> people = personScanner.getPeopleList();
            SongScanner songScanner = new SongScanner(args[1]);
            LinkedSongList<Song> songs = songScanner.getSongList();
            GUIDisplayWindow gui = new GUIDisplayWindow(people, songs);
        }
        else
        {
            PersonScanner personScanner = new PersonScanner("MusicSurveyData2017S.csv");
            DoublyLinkedList<Person> people = personScanner.getPeopleList();
            SongScanner songScanner = new SongScanner("SongList2017S.csv ");
            LinkedSongList<Song> songs = songScanner.getSongList();
            GUIDisplayWindow gui = new GUIDisplayWindow(people, songs);
        }
       
    }

}
