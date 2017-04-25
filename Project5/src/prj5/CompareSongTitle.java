/**
 * 
 */
package prj5;

import java.util.Comparator;

/**
 * @author AshlynUser
 * @version 2017.04.19
 */
public class CompareSongTitle implements Comparator<Object> {

    /**
     * compares two songs based on the title
     */
    @Override
    public int compare(Object o1, Object o2)
    {
        return ((Song)o1).getTitle().compareTo(((Song)o2).getTitle());
    }
}
