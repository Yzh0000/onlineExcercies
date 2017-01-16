class Solution {
public:
    vector<string> readBinaryWatch(int num) {
        vector<string> res;
        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){
                if(bitset<32>(h).count()+bitset<32>(m).count()==num){
                    res.push_back(to_string(h)+(m < 10 ? ":0" : ":") + to_string(m));
                }
            }
        }
        return res;
    }
};