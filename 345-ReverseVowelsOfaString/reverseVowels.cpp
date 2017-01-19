class Solution {
public:
    bool isVowel(char c)
    {
        unordered_set<char> v={'a','e','i','o','u','A','E','I','O','U'};
        return v.find(c)!=v.end();;
    }

    string reverseVowels(string s) {
        int p1=0,p2=s.size()-1;
        while(p1<p2){
            while(!isVowel(s[p1])&&p1<p2) p1++;
            while(!isVowel(s[p2])&&p1<p2)  p2--;
            swap(s[p1],s[p2]);
            p1++;p2--;
        }
        return s;
    }
};