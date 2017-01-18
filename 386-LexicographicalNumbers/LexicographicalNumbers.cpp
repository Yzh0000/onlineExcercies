class Solution {
public:
    vector<int> lexicalOrder(int n) {
        vector<int> res(n);
        if(n==0)    return res;
        res[0]=1;
        int x=1;
        
        for(int i=1;i<n;i++){
            if(x*10<=n) x*=10;
            else{
                if(x==n) x/=10;
                x++;
                while(x%10==0)  x/=10;
            }
            res[i]=x;
        }
        return res;
    }
};