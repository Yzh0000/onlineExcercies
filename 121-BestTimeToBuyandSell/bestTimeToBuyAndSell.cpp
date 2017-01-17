class Solution {
public:
    int maxProfit(vector<int>& prices) {
        if(prices.empty())  return 0;
        int prevMin=prices[0];
        int profit=0;
        for(int i=1;i<prices.size();i++){
            profit=max(profit,prices[i]-prevMin);
            prevMin=min(prevMin,prices[i]);
        }
        return profit;
    }
};