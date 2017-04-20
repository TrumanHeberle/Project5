
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
        DoublyLinkedList<Person> people = personScanner.getPeopleList();
        SongScanner songScanner = new SongScanner(args[1]);
        LinkedSongList<Song> songs = songScanner.getSongList().sortByTitle();
        /**for (Song song: songs) {
            for (Person person: people) {
                song.addData(person);
            }
        }*/
        songs.sortByTitle();
        for (int i = 0; i < songs.size(); i++)
        {
            Song currentSong = songs.getEntry(i);
            System.out.println("Song Title: " + currentSong.getTitle());
            System.out.println("Song Artist: " + currentSong.getArtist());
            System.out.println("Song Genre: " + currentSong.getGenre());
            System.out.println("Song Year: " + currentSong.getYear());
            System.out.println("Heard");
            System.out.print("reading:" + currentSong.getHobbyScore(HobbyEnum.READ, people)[0]);
            System.out.print(" art:" + currentSong.getHobbyScore(HobbyEnum.ART, people)[0]);
            System.out.print(" sports:" + currentSong.getHobbyScore(HobbyEnum.SPORTS, people)[0]);
            System.out.println(" music:" + currentSong.getHobbyScore(HobbyEnum.MUSIC, people)[0]);
            System.out.println("Likes");
            System.out.print("reading:" + currentSong.getHobbyScore(HobbyEnum.READ, people)[1]);
            System.out.print(" art:" + currentSong.getHobbyScore(HobbyEnum.ART, people)[1]);
            System.out.print(" sports:" + currentSong.getHobbyScore(HobbyEnum.SPORTS, people)[1]);
            System.out.println(" music:" + currentSong.getHobbyScore(HobbyEnum.MUSIC, people)[1]);
            System.out.println("");
        }
        GUIDisplayWindow gui;
        gui = new GUIDisplayWindow();
    }
}
