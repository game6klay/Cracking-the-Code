package GroupAnagram;

import java.util.*;

/**
 * Created by jay on 1/4/17.
 */
public class SolutionA {

    public List<List<String>> groupAnagrams (String[] strs) {

        if (strs == null || strs.length== 0) {

            return new ArrayList<List<String>>();
        }

        Map<String , List<String>> mapList = new HashMap<String, List<String>>();
        Arrays.sort(strs);
        for (String s : strs) {

            char[] ca =s.toCharArray();
            Arrays.sort(ca);
            String keyString = String.valueOf(ca);
            if (!mapList.containsKey(keyString)) {

                mapList.put(keyString, new ArrayList<>());

            }

            mapList.get(keyString).add(s);
        }

        return new ArrayList<List<String>>();

    }



}
