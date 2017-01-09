public class Solution {
/* 1st version: Time exceed limit. 
String is immutable in Java!
public String reverseString(String s) {
        String rslt = "";
        for (int i = 0; i < s.length(); i++) {
            rslt += s.charAt(s.length()-1-i);
        }
        return rslt;
        
    }
*/
/* 2nd version: Time ~ 7ms
    public String reverseString(String s) {
        StringBuilder rslt = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            rslt.append(s.charAt(s.length()-1-i));
        }
        return rslt.toString();
        
    }
*/
// 3rd version: Time ~ 2ms
    public String reverseString(String s) {
        char[] sChar = s.toCharArray();
        int i = 0;
        int j = sChar.length - 1;
        
        while (i < j) {
            char temp = sChar[i];
            sChar[i] = sChar[j];
            sChar[j] = temp;
            i++;
            j--;
        }
        return new String(sChar);
          
    }
/*4th: StringBuilder has reverse() function.
public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
*/

}

// String is immutable in Java. StringBuffer, StringBuilder are better.
// StringBuilder has reverse() function.
// char[] <--> String
//toCharArray() <--> new String()