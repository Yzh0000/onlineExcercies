class Solution {
public:
    vector<int> grayCode(int n) {
        int k=pow(2,n);
        
        vector<int> res(k);
        for(int i=0;i<k;i++){
            res[i]=i^(i>>1);
        }
        return res;
    }
};