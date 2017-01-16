public class Solution {
    public int maxProfit(int[] prices) {


        
        int rslt = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i =0; i< prices.length; i++) {
            min = min < prices[i] ? min : prices[i];//min up to now
            int diff = prices[i] > min ? prices[i] -min : 0;
            rslt = rslt > diff ? rslt : diff;
        }

        

        
        return rslt;



        
    }
}