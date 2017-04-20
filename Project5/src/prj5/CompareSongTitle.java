package prj5;

import java.util.Comparator;

/**
 * Comparator for Song Titles
 * 
 * @author AshlynUser
 * @version 4.19.2017
 */
public class CompareSongTitle implements Comparator<Object> {
    /**
     * compares two songs based on the title
     */
    @Override
    public int compare(Object o1, Object o2) {
        return ((Song)o1).getTitle().compareTo(((Song)o2).getTitle());
    }
}
