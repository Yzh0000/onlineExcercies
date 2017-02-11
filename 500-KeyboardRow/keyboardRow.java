public class Solution {
    public String[] findWords(String[] words) {
        // empty input
        if (words.length == 0) return new String[0];
        // else
        List<String> rslt = new ArrayList<>();

        
        for (int i = 0; i< words.length; i++) {
            char[] temp = words[i].toCharArray();
            int row = findRow(temp[0]);
            //temp is contained in one row or not
            boolean isOneRow = true;
            for (int j = 0; j < temp.length; j++) {
                if (findRow(temp[j]) != row) {
                    isOneRow = false;
                    break;
                }
            }
            if (isOneRow) rslt.add(words[i]);
            
        }
        return rslt.toArray(new String[rslt.size()]);
    }
    
    public int findRow(char ch) {
        int rslt = -1;
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";
        if (row1.indexOf(ch) != -1) rslt = 1;
        if (row2.indexOf(ch) != -1) rslt = 2;
        if (row3.indexOf(ch) != -1) rslt = 3;
        return rslt;
    }
}