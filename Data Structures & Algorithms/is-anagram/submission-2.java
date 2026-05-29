class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) {
            return false;
         }
        
        // contiue and convery into character arrays:
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        // sort char arrays so characters in strings are same (if anagram):
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        //compare and return boolean value:
        return Arrays.equals(str1, str2);
    }
}

