public class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        String rslt = "";
        
        for (int i = 0; i< 8; i++) { //using while will be easier
            int num1 = num >>> (4 * i);
            if (num1 != 0) {
            int numb = num1 & 15;
            
            // switch (numb) {
            //     case 10: 
            //         rslt = "a" + rslt;
            //         break;
            //     case 11:
            //         rslt = "b" + rslt;
            //         break;
            //     case 12: 
            //         rslt = "c" + rslt;
            //         break;
            //     case 13:
            //         rslt = "d" + rslt;
            //         break;
            //     case 14: 
            //         rslt = "e" + rslt;
            //         break;
            //     case 15: 
            //         rslt = "f" + rslt;
            //         break;
            //     default:
            //         rslt = ""+ numb + rslt;
            //         break;
                    
            // }
            if ( numb >= 10) {
                rslt = (char)('a'+ (numb -10)) + rslt;
            } else {
                rslt = "" + numb + rslt;
            }
            }
            
            
        }
        return rslt;
        
    }
}