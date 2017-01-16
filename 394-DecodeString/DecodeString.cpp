class Solution {
public:
    string decodeString(string s) {
        string res;
        int digit=0;
        stack<int> digits;
        stack<string> strs;
        
        for(char c:s){
            if(isalpha(c))  res+=c;
            if(isdigit(c))  digit=digit*10+c-'0';
            if(c=='['){
                strs.push(res);
                digits.push(digit);
                digit=0;
                res="";
            }
            if(c==']'){
                int storedDigit=digits.top();
                string storedStr=strs.top();
                digits.pop();
                strs.pop();
                
                string resCopy=res;
                for(int i=0;i<storedDigit-1;i++){
                    res+=resCopy;
                }
                res=storedStr+res;
            }
        }
        return res;
    }
};