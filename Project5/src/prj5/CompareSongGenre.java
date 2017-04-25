
package prj5;

import java.util.Comparator;

/**
 * @author AshlynUser
 * @version 2017.04.19
 */
public class CompareSongGenre implements Comparator<Object> {

    /**
     * compares two songs based on the genre
     * @param o1
     * @param o2
     * @return 
     */
    @Override
    public int compare(Object o1, Object o2)
    {
        return ((Song)o1).getGenre().compareTo(((Song)o2).getGenre());
    }
}
