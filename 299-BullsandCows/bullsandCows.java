public class Solution {
    public String getHint(String secret, String guess) {
        if (secret.length() == 0 ) return "0A0B";
        
        char[] arr1 = secret.toCharArray();
        char[] arr2 = guess.toCharArray();
        int[] freq1 = new int[10];
        int[] freq2 = new int[10];
        int bull  = 0;
        int cow = 0;
        
        for (int i = 0; i< arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                bull++;
            } else {
                freq1[arr1[i] - '0']++;
                freq2[arr2[i] - '0']++;
            }

        }
        
        for (int i = 0; i< freq1.length; i++) {
            cow += freq1[i] < freq2[i] ? freq1[i] : freq2[i];
        }
        
        String rslt = "" + bull + "A" + cow + "B";
        return rslt;
        
        
    }
}