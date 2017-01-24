class Solution {
public:
    string getHint(string secret, string guess) {
        map<char,int> m;
        int bulls = 0, cows = 0;
        for(int i=0;i<secret.size();i++){
            char s=secret[i];
            char g=guess[i];
            
            if(s==g)    bulls++;
            else{
                if(m[s]>0)  cows++;
                if(m[g]<0)  cows++;
                    
                m[s]--;
                m[g]++;
            }
        }
        return to_string(bulls) + "A" + to_string(cows) + "B";
    }
};