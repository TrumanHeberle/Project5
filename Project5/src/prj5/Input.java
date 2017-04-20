
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
        GUIDisplayWindow gui = new GUIDisplayWindow();
        songScanner.sortByTitle();
        LinkedSongList<Song> songs = songScanner.getSongList();
        for (int i = 0; i < songs.size(); i++)
        {
            Song currentSong = songs.getEntry(i);
            System.out.println("Song Title: " + currentSong.getTitle());
            System.out.println("Song Artist: " + currentSong.getGenre());
            System.out.println("Song Genre: " + currentSong.getGenre());
            System.out.println("Song Year: " + currentSong.getYear());
            System.out.println("Heard");
            System.out.print("reading:" + currentSong.getTracker().getHeardByHobby(HobbyEnum.READ));
            System.out.print(" art:" + currentSong.getTracker().getHeardByHobby(HobbyEnum.ART));
            System.out.print(" sports:" + currentSong.getTracker().getHeardByHobby(HobbyEnum.SPORTS));
            System.out.println(" music:" + currentSong.getTracker().getHeardByHobby(HobbyEnum.MUSIC));
            System.out.println("Likes");
            System.out.print("reading:" + currentSong.getTracker().getLikedByHobby(HobbyEnum.READ));
            System.out.print(" art:" + currentSong.getTracker().getLikedByHobby(HobbyEnum.ART));
            System.out.print(" sports:" + currentSong.getTracker().getLikedByHobby(HobbyEnum.SPORTS));
            System.out.println(" music:" + currentSong.getTracker().getLikedByHobby(HobbyEnum.MUSIC));
            System.out.println("");
        }
    }
}
