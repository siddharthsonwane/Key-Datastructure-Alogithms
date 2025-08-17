package main.arraystring;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram sol = new ValidAnagram();
        String s = "anagram", t = "nagaram";
        System.out.println(sol.isAnagrams(s,t));
    }

    private boolean isAnagrams(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character,Integer>map = new HashMap<>();

        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +  1);
        }
        for (char c : t.toCharArray()){
            map.put(c,map.getOrDefault(c, 0) - 1);
            if (map.get(c) < 0)  return  false;
        }

        for (int val : map.values()){
            if (val !=0)return false;
        }
        return true;
    }
}
