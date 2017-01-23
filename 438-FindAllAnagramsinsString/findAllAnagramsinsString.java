public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> rslt = new ArrayList<>();
        if (p.length() == 0 || s.length() == 0) return rslt;
        
        int[] freqP = new int[26];
        for (int i = 0; i< p.length(); i++) {
            freqP[p.charAt(i) -'a']++;
        }
        
        char[] charS = s.toCharArray();
        int i = 0;
        // !!! be careful the uperbound of i here!!!
        while (i < s.length() - p.length() + 1 ) {
            int[] temp = freqP.clone();
            for (int k = 0; k< p.length(); k++) {
                if (freqP[charS[i+k]-'a'] == 0) {
                    i = i + k + 1;
                    break;
                } else if (--temp[charS[i+k] -'a'] < 0){
                    i++;
                    break;
                }
                if (k == p.length()-1) {
                    rslt.add(i);
                    i++;
                }
            }
            
        }
        
        return rslt;
        
    }
}