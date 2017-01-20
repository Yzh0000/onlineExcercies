class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int carry=1;
        int x=1;
        vector<int> res;
        for(int i=digits.size()-1;i>=0;i--){
            int sum=digits[i]+carry;
            if(sum<10)  {carry=0;res.push_back(sum);}
            if(sum>=10)  {carry=1;res.push_back(sum%10);}
        }
        if(carry)   res.push_back(1);
        reverse(res.begin(),res.end());
        return res;
    }
};