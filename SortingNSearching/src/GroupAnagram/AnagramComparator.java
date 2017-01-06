package GroupAnagram;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by jay on 1/4/17.
 */
public class AnagramComparator implements Comparator<String> {

    private String sortString (String s) {

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    @Override
    public int compare(String s1, String s2) {
        return sortString(s1).compareTo(sortString(s2));
    }
}
