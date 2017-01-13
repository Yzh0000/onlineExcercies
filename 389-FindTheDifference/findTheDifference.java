public class Solution {
    public char findTheDifference(String s, String t) {
        // use ^ operation.
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int rslt = 0;
        
        for (int i = 0; i< charS.length; i++) {
            rslt ^= charS[i];
        }
        
        for (int i = 0; i< charT.length; i++) {
            rslt^=charT[i];
        }
        
        return (char)rslt;
        
    }
}