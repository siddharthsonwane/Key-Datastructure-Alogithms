package main.arraystring;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams sol = new GroupAnagrams();
        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(sol.groupAnagrams(strs1));
    }

    private List<List<String>> groupAnagrams(String[] strs ) {
        Map<String,List<String>>map = new HashMap<>();

        for (String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());
    }

}
