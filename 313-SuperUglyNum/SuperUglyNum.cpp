class Solution {
public:
    int nthSuperUglyNumber(int n, vector<int>& primes) {
        vector<int> index(primes.size(),0);
        vector<int> uglynums(n);
        uglynums[0]=1;
        int p;
        
        for(int i=1;i<n;i++){
            int nextUgly=INT_MAX;
            for(int j=0;j<index.size();j++){
                if(uglynums[index[j]]*primes[j]<nextUgly){    
                    nextUgly=uglynums[index[j]]*primes[j];
                }
            }
            for(int j=0;j<index.size();j++){
                if(nextUgly==uglynums[index[j]]*primes[j])
                    index[j]++;
            }
            uglynums[i]=nextUgly;
        }
        return uglynums[n-1];
    }
};