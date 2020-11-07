class Solution {
public:
    bool find132pattern(vector<int>& nums) {
        if (nums.size()<3){
            return false;
        }
        
        vector<int> minArr(nums.size(),INT_MAX);
        stack<int> stk;
        
        for (int i=1; i<nums.size(); i++){
            minArr[i] = min(minArr[i-1],nums[i-1]);
        }
        
        cout << endl;
        
        for (int i=nums.size()-1; i>=0; i--){
            while (!stk.empty() && stk.top()<=minArr[i]){
                stk.pop();
            }    
            
            if (!stk.empty() && stk.top()<nums[i]){
                return true;
            }
            
            stk.push(nums[i]);
        }
        
        return false;      
    }
};
