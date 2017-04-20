package prj5;

import java.util.Comparator;

/**
 * Comparator for Song Genres
 * 
 * @author AshlynUser
 * @version 4.19.2017
 */
public class CompareSongGenre implements Comparator<Object> {
    /**
     * compares two songs based on the genre
     */
    @Override
    public int compare(Object o1, Object o2) {
        return ((Song)o1).getGenre().compareTo(((Song)o2).getGenre());
    }
}
