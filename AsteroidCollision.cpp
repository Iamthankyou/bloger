class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        stack<int> stk;
        vector<int> res;
        
        for (auto i:asteroids){
            if (i>0){
                stk.push(i);
            }
            else{
                while (!stk.empty() && stk.top()>0 && stk.top()<abs(i)){
                    stk.pop();
                }
                
                if (stk.empty() || stk.top()<0){
                    stk.push(i);
                }
                else if (!stk.empty() && stk.top()==abs(i)){
                    stk.pop();
                }
                else{
                    // Nothing
                }
            }
        }
        
        while (!stk.empty()){
            res.push_back(stk.top());
            stk.pop();
        }
        
        reverse(res.begin(),res.end());
        
        return res;
    }
};
