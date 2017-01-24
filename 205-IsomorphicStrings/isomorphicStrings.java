public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] map = new int[512];
        
        for (int i = 0; i< s.length(); i++) {
            if (map[s.charAt(i)] != map[t.charAt(i)+256]) return false;
            map[s.charAt(i)] = map[t.charAt(i)+256] = i+1;// should use i+1 to avoid default value 0 in map.
        }
        return true;
        
    }
}