class Solution {
public:
    bool canFinish(int numCourses, vector<pair<int, int>>& prerequisites) {
        vector<unordered_set<int>> children(numCourses);    
        //children[0]:parent0's children
        vector<int> numParents(numCourses);  
        //numParents[0]:child0's number of parents
        
        for(auto pre:prerequisites){
            int parent=pre.first;
            int child=pre.second;
            
            if(!children[parent].count(child)){
                children[parent].insert(child);
                numParents[child]++;
            }
        }
        
        for(int i=0;i<numCourses;i++)
        {
            bool hasLeadingNode=false;
            int x;
            for(int j=0;j<numCourses;j++){
                if(numParents[j]==0){
                    hasLeadingNode=true;
                    x=j;
                    break;
                }
            }
            if(!hasLeadingNode)   return false;
            
            numParents[x]=-1;
            for(int child:children[x]){
                numParents[child]--;
            }
        }
        return true;
    }
};