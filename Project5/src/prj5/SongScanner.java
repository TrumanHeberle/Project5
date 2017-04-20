package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Scans a song data file and adds songs to a song list
 * 
 * @author trumanh
 * @version 4.19.2017
 */
public class SongScanner {
    private LinkedSongList<Song> songList;
    private int songNum;


    /**
     * Creates a new SongScanner object
     */
    public SongScanner() {
        songNum = 0;
        songList = new LinkedSongList<Song>();
    }


    /**
     * Creates a new SongScanner with then adds songs from the file
     * 
     * @param filename
     *            The song data file name
     * @throws FileNotFoundException
     *             If the file can't be found
     */
    public SongScanner(String filename) throws FileNotFoundException {
        this();
        this.scanSongs(filename);
    }


    /**
     * Scans the song file and adds songs accordingly
     * 
     * @param songFile
     *            The name of the song data file
     * @throws FileNotFoundException
     *             If the song file can't be found
     */
    public void scanSongs(String songFile) throws FileNotFoundException {
        Scanner file = new Scanner(new File(songFile));

        // Passes header
        if (file.hasNextLine()) {
            file.nextLine();
        }
        // Scans file
        while (file.hasNextLine()) {
            String[] values = file.nextLine().split(",");

            String title = values[0];
            String artist = values[1];
            int year = Integer.parseInt(values[2]);
            String genre = values[3];
            songNum++;

            Song song = new Song(title, artist, year, genre, songNum);
            songList.addToBack(song);
        }
        file.close();
    }


    /**
     * Returns the LinkedSongList containing all the songs
     * 
     * @return The LinkedSongList containing all the songs
     */
    public LinkedSongList<Song> getSongList() {
        return songList;
    }
}
