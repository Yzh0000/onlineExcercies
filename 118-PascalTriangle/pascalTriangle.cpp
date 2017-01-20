class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> res;
        if (numRows<1)  return res;
        vector<int> preLayer={1};
        res.push_back(preLayer);
        
        for(int i=2;i<=numRows;i++){
            vector<int> curLayer(i);
            curLayer[0]=1;
            curLayer[i-1]=1;
            for(int j=1;j<i-1;j++){
                curLayer[j]=preLayer[j-1]+preLayer[j];
            }
            res.push_back(curLayer);
            preLayer=curLayer;
        }
        return res;
    }
};