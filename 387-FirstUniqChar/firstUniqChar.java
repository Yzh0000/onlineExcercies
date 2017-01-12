public class Solution {
    public int firstUniqChar(String s) {
        
        char[] arr = s.toCharArray();
        // alphabet[i] = the appearing index of ith letter
        // If freq of ith letter > 1, change it to negative. 
        int[] alphabet = new int[26];
        int rslt = arr.length + 1;
        
        for (int i = 0; i< arr.length; i++) {
            int idx = arr[i] - 'a';
            // separate the appearing index with default value 0 in arr.
            if (alphabet[idx] == 0) {
                alphabet[idx] = i+1;
            } else if (alphabet[idx] > 0) {
                alphabet[idx]  *= -1;
            }
            
        }
        
        for (int i =0; i< 26; i++) {
            if (alphabet[i] > 0) {
                rslt = rslt < alphabet[i] ? rslt: alphabet[i];
            }
        }
        
        return rslt == arr.length +1 ? -1 : rslt -1;
        
    }
}