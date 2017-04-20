/**
 * 
 */
package prj5;

import java.util.Iterator;

/**
 * @author AshlynUser
 *
 */
public class LinkedSongList<T> extends DoublyLinkedList<T> {
    
    public DoublyLinkedList<Song> sortByTitle()
    {
        DoublyLinkedList<Song> titleList = new DoublyLinkedList<>();
        CompareSongTitle comparer = new CompareSongTitle();
        @SuppressWarnings("unchecked")
        Iterator<Song> iterator = (Iterator<Song>)this.iterator();
        while (iterator.hasNext())
        {
            //should be length possibly?
            int size = titleList.size();
            Song currentSong = iterator.next();
            int position = 1;
            while (position <= size && comparer.compare(currentSong,titleList.getEntry(position)) > 0)
            {
                position++;
            }
            titleList.add(position, currentSong);
        }
        return titleList;
    }
    
    public DoublyLinkedList<Song> sortByArtist()
    {
        DoublyLinkedList<Song> artistList = new DoublyLinkedList<>();
        CompareSongArtist comparer = new CompareSongArtist();
        @SuppressWarnings("unchecked")
        Iterator<Song> iterator = (Iterator<Song>)this.getIterator();
        while (iterator.hasNext())
        {
            //should be length possibly?
            int size = artistList.size();
            Song currentSong = iterator.next();
            int position = 1;
            while (position <= size && comparer.compare(currentSong, artistList.getEntry(position)) > 0)
            {
                position++;
            }
            artistList.add(position, currentSong);
        }
        return artistList;
    }
    
    public DoublyLinkedList<Song> sortByYear()
    {
        DoublyLinkedList<Song> yearList = new DoublyLinkedList<>();
        CompareSongYear comparer = new CompareSongYear();
        @SuppressWarnings("unchecked")
        Iterator<Song> iterator = (Iterator<Song>)this.getIterator();
        while (iterator.hasNext())
        {
            //should be length possibly?
            int size = yearList.size();
            Song currentSong = iterator.next();
            int position = 1;
            while (position <= size && comparer.compare(currentSong, yearList.getEntry(position)) > 0)
            {
                position++;
            }
            yearList.add(position, currentSong);
        }
        return yearList;
    }
    
    public DoublyLinkedList<Song> sortByGenre()
    {
        DoublyLinkedList<Song> genreList = new DoublyLinkedList<>();
        CompareSongGenre comparer = new CompareSongGenre();
        @SuppressWarnings("unchecked")
        Iterator<Song> iterator = (Iterator<Song>)this.getIterator();
        while (iterator.hasNext())
        {
            //should be length possibly?
            int size = genreList.size();
            Song currentSong = iterator.next();
            int position = 1;
            while (position <= size && comparer.compare(currentSong, genreList.getEntry(position)) > 0)
            {
                position++;
            }
            genreList.add(position, currentSong);
        }
        return genreList;
    }
    
}
