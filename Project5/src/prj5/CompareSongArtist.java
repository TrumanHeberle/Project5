package prj5;

import java.util.Comparator;

/**
 * Comparator for Song Artists
 * 
 * @author AshlynUser
 * @version 4.19.2017
 */
public class CompareSongArtist implements Comparator<Object> {
    /**
     * compares two songs based on the artist
     */
    @Override
    public int compare(Object o1, Object o2)
    {
        return ((Song)o1).getArtist().compareTo(((Song)o2).getArtist());
    }
}