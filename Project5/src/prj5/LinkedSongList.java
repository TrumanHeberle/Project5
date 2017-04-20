/**
 * 
 */
package prj5;

import java.util.Iterator;

/**
 * @author AshlynUser
 * @version 2017.04.19
 * @param <T> the generic type
 */
public class LinkedSongList<T> extends DoublyLinkedList<T> {

    /**
     * constructor
     * @return the list
     */
    public LinkedSongList<Song> sortByTitle() {
        LinkedSongList<Song> titleList = new LinkedSongList<>();
        CompareSongTitle comparer = new CompareSongTitle();
        @SuppressWarnings("unchecked")
        Iterator<Song> iterator = (Iterator<Song>)this.iterator();
        while (iterator.hasNext()) {
            // should be length possibly?
            int size = titleList.size();
            Song currentSong = iterator.next();
            int position = 0;
            while (position < size && comparer.compare(currentSong, titleList
                .getEntry(position)) > 0) {
                position++;
            }
            titleList.add(position, currentSong);
        }
        return titleList;
    }


    /**
     * sorts by artist
     * @return
     */
    public LinkedSongList<Song> sortByArtist() {
        LinkedSongList<Song> artistList = new LinkedSongList<>();
        CompareSongArtist comparer = new CompareSongArtist();
        @SuppressWarnings("unchecked")
        Iterator<Song> iterator = (Iterator<Song>)this.iterator();
        while (iterator.hasNext()) {
            // should be length possibly?
            int size = artistList.size();
            Song currentSong = iterator.next();
            int position = 0;
            while (position < size && comparer.compare(currentSong, artistList
                .getEntry(position)) > 0) {
                position++;
            }
            artistList.add(position, currentSong);
        }
        return artistList;
    }


    /**
     * sorts by the year
     * @return
     */
    public LinkedSongList<Song> sortByYear() {
        LinkedSongList<Song> yearList = new LinkedSongList<>();
        CompareSongYear comparer = new CompareSongYear();
        @SuppressWarnings("unchecked")
        Iterator<Song> iterator = (Iterator<Song>)this.iterator();
        while (iterator.hasNext()) {
            // should be length possibly?
            int size = yearList.size();
            Song currentSong = iterator.next();
            int position = 0;
            while (position < size && comparer.compare(currentSong, yearList
                .getEntry(position)) > 0) {
                position++;
            }
            yearList.add(position, currentSong);
        }
        return yearList;
    }


    /**
     * sorts by the genre
     * @return
     */
    public LinkedSongList<Song> sortByGenre() {
        LinkedSongList<Song> genreList = new LinkedSongList<>();
        CompareSongGenre comparer = new CompareSongGenre();
        @SuppressWarnings("unchecked")
        Iterator<Song> iterator = (Iterator<Song>)this.iterator();
        while (iterator.hasNext()) {
            // should be length possibly?
            int size = genreList.size();
            Song currentSong = iterator.next();
            int position = 0;
            while (position < size && comparer.compare(currentSong, genreList
                .getEntry(position)) > 0) {
                position++;
            }
            genreList.add(position, currentSong);
        }
        return genreList;
    }

}
