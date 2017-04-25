/**
 * 
 */
package prj5;

import java.util.Comparator;

/**
 * @author AshlynUser
 * @version 2017.04.19
 */
public class CompareSongYear implements Comparator<Object> {
    
    /**
     * compares two songs based on the year
     */
    @Override
    public int compare(Object o1, Object o2)
    {
        int diff = ((Song)o1).getYear() - ((Song)o2).getYear();
        return diff;
    }

}
