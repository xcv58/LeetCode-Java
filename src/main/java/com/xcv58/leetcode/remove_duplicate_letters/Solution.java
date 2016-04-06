package com.xcv58.leetcode.remove_duplicate_letters;

public class Solution {
    public String removeDuplicateLetters(String s) {
        if (s == null || "".equals(s)) {
            return "";
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        int pos = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(pos)) {
                pos = i;
            }
            if (--count[s.charAt(i) - 'a'] == 0) {
                break;
            }
        }

        String remain = s.substring(pos + 1).replaceAll(String.valueOf(s.charAt(pos)), "");
        return s.charAt(pos) + removeDuplicateLetters(remain);
    }
}
