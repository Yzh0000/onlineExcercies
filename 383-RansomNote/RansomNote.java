public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // count an int array to count the frequency of a-z in two Strings.
        // for each letter, we should have freq(ransomNote) <= freq(magazine).
        int[] freq = new int[26];
        
        char[] arr1 = ransomNote.toCharArray();
        char[] arr2 = magazine.toCharArray();
        
        for (int i = 0; i< arr2.length; i++) {
            freq[arr2[i] - 'a']++;
        }
        
        for (int i = 0; i< arr1.length; i++) {
            freq[arr1[i] - 'a']--;
        }
        
        for (int i = 0; i< 26; i++) {
            if (freq[i] < 0) return false;
        }
        
        return true;
        
    }
}