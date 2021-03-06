
package prj5;

import java.util.Comparator;

/**
 * @author Ashlyn McDonald (mashlyn6)
 * @author Truman Heberle (trumanh)
 * @author Shivani Garg (shivanig)
 * @version 2017.04.26
 * 
 * This class compares two songs by the song's genre.
 */
public class CompareSongGenre implements Comparator<Object> { 

    /**
     * Compares two songs based on the Song Genre
     * @param o1 the first object
     * @param o2 the second object
     * @return the integer value that represents whether
     * the first Genre comes before or after the second
     * one in alphabetical order (0 if they are the same,
     * some other integer if they are not)
     */
    @Override
    public int compare(Object o1, Object o2)
    {
        return ((Song)o1).getGenre().compareTo(((Song)o2).getGenre());
    }
}
