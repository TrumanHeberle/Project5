package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SongScanner {
    private LinkedSongList<Song> songList;
    private int songNum;

    public SongScanner() {
        songNum = 0;
        songList = new LinkedSongList<Song>();
    }


    public SongScanner(String filename) throws FileNotFoundException {
        this();
        this.scanSongs(filename);
    }


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


    public LinkedSongList<Song> getSongList() {
        return songList;
    }
}
