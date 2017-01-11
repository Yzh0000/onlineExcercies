class Solution {
public:
    string minWindow(string s, string t) {
	    vector<int> mp(128);
	    for (auto c : t) mp[c]++;

	    int begin = 0, end = 0, count = t.size(), head = 0, d = INT_MAX;

	    while (end < s.size()) {
		    if (mp[s[end]] > 0) count--;
		    mp[s[end]]--;
		    end++;

		    while (count == 0) {
			    if (end - begin < d) {
				    head = begin;
				    d = end - begin;
			    }
			    mp[s[begin]]++;

			    if (mp[s[begin]] > 0)   count++;
			    begin++;
		    }
	    }
	    return d==INT_MAX?"":s.substr(head,d);
    }
};