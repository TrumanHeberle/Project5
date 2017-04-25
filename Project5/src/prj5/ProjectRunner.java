
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
        //PersonScanner personScanner = new PersonScanner(args[0]);
        //DoublyLinkedList<Person> people = personScanner.getPeopleList();
        //SongScanner songScanner = new SongScanner(args[1]);
        //LinkedSongList<Song> songs = songScanner.getSongList().sortByGenre();// .sortByTitle();
        //LinkedSongList<Song> titleSongs = songScanner.getSongList()
          //  .sortByTitle();
        GUIDisplayWindow gui = new GUIDisplayWindow();

       /** for (Song song : songs) {
            // System.out.println(songs.size());
            System.out.println("Song Title: " + song.getTitle());
            System.out.println("Song Artist: " + song.getArtist());
            System.out.println("Song Genre: " + song.getGenre());
            System.out.println("Song Year: " + song.getYear());
            System.out.println("Heard");
            System.out.print("reading:" + song.getHobbyScore(HobbyEnum.READ,
                people)[0]);
            System.out.print(" art:" + song.getHobbyScore(HobbyEnum.ART,
                people)[0]);
            System.out.print(" sports:" + song.getHobbyScore(HobbyEnum.SPORTS,
                people)[0]);
            System.out.println(" music:" + song.getHobbyScore(HobbyEnum.MUSIC,
                people)[0]);
            System.out.println("Likes");
            System.out.print("reading:" + song.getHobbyScore(HobbyEnum.READ,
                people)[1]);
            System.out.print(" art:" + song.getHobbyScore(HobbyEnum.ART,
                people)[1]);
            System.out.print(" sports:" + song.getHobbyScore(HobbyEnum.SPORTS,
                people)[1]);
            System.out.println(" music:" + song.getHobbyScore(HobbyEnum.MUSIC,
                people)[1]);
            System.out.println("");
        }

        for (Song song : titleSongs) {
            // System.out.println(songs.size());
            System.out.println("Song Title: " + song.getTitle());
            System.out.println("Song Artist: " + song.getArtist());
            System.out.println("Song Genre: " + song.getGenre());
            System.out.println("Song Year: " + song.getYear());
            System.out.println("Heard");
            System.out.print("reading:" + song.getHobbyScore(HobbyEnum.READ,
                people)[0]);
            System.out.print(" art:" + song.getHobbyScore(HobbyEnum.ART,
                people)[0]);
            System.out.print(" sports:" + song.getHobbyScore(HobbyEnum.SPORTS,
                people)[0]);
            System.out.println(" music:" + song.getHobbyScore(HobbyEnum.MUSIC,
                people)[0]);
            System.out.println("Likes");
            System.out.print("reading:" + song.getHobbyScore(HobbyEnum.READ,
                people)[1]);
            System.out.print(" art:" + song.getHobbyScore(HobbyEnum.ART,
                people)[1]);
            System.out.print(" sports:" + song.getHobbyScore(HobbyEnum.SPORTS,
                people)[1]);
            System.out.println(" music:" + song.getHobbyScore(HobbyEnum.MUSIC,
                people)[1]);
            System.out.println("");
        }*/

    }

}
