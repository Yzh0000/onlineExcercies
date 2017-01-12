public class Solution {
    public int longestPalindrome(String s) {
        //ASCII: A-Z (65-90), a-z(97-122)
        // a palindrome should have 2n+1 or 2n digits
        char[] arr = s.toCharArray();
        if (arr.length <= 1) return arr.length;
        
        int rslt = 0;
        int[] freq = new int[52];
        boolean oneMore = false;
        
        for (int i = 0; i< arr.length; i++) {
            char temp = arr[i];
            if (temp < 'a') {
                freq[temp -'A']++;
            } else {
                freq[temp - 'a'+ 26]++;
            }
        }
        
        for (int i = 0; i< 52; i++) {
            //!!! (freq[i] & 1) == 1, use round brackets!!!
            if ((freq[i] & 1) == 1) { //odd
                oneMore = true;
                rslt += freq[i]-1;
            } else {
                rslt += freq[i];
            }
        }
        
        return oneMore == true ? rslt + 1: rslt;
        
    }
}