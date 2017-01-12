public class Solution {
    public boolean isAnagram(String s, String t) {
        //use an array to count freq of each letter.
        int[] freq = new int[26];
        
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        
        for (int i = 0; i< arr1.length; i++) {
            freq[arr1[i] -'a']++;
        }
        
        for (int i = 0; i< arr2.length; i++) {
            freq[arr2[i]-'a']--;
        }
        
        for (int i = 0; i< 26; i++) {
            if (freq[i] != 0) return false;

        }
        
        return true;
        
    }
}