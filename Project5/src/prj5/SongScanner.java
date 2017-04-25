package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author AshlynUser
 * @version 2017.04.19
 */
public class SongScanner {
    private LinkedSongList<Song> songList;
     private int songNum;


    /**
     * constructor
     */
    public SongScanner() {
         songNum = 0;
        songList = new LinkedSongList<Song>();
    }


    /**
     * constructor with param
     * 
     * @param filename
     *            the file
     * @throws FileNotFoundException
     */
    public SongScanner(String filename) throws FileNotFoundException {
        this();
        this.scanSongs(filename);
    }


    /**
     * scans the file of songs
     * 
     * @param songFile the file
     * @return the list of songs
     * @throws FileNotFoundException
     */
    public void scanSongs(String songFile)
        throws FileNotFoundException {
        try {
            Scanner file = new Scanner(new File(songFile));
            int index = 0;
            file.nextLine();
            while (file.hasNextLine()) {
                String line = file.nextLine();
                //System.out.println(line);
                String[] songArray = line.split(" *, *");
                for (int i = 0; i < songArray.length; i += 4) {
                    songList.addToBack(new Song(songArray[i], songArray[i + 1],
                        Integer.valueOf(songArray[i + 2]), songArray[i + 3],
                        index));
                    index += 2;
                }
            }
        }
       /** Scanner file = new Scanner(new File(songFile));
             //Passes header
             if (file.hasNextLine()) {
             file.nextLine();
             }
             //Scans file
             while (file.hasNextLine()) {
             String[] values = file.nextLine().split(",");
            String title = values[0];
             String artist = values[1];
             int year = Integer.parseInt(values[2]);
             String genre = values[3];

             Song song = new Song(title, artist, year, genre, songNum);
             songList.addToBack(song);
             songNum++;
             }
            file.close();
        }*/
        catch (FileNotFoundException e) {
            System.out.println("File name is invalid");
        }
        }
        //return songList;
    


    /**
     * returns the list of songs
     * 
     * @return the list of songs
     */
    public LinkedSongList<Song> getSongList() {
        return songList;
    }
}
