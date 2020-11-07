class Solution {
public:
    int smallestDivisor(vector<int>& nums, int threshold) {
        int l=1,r=10e6;
        
        while (l<=r){
            int mid = l+ (r-l)/2;
            int sum = 0;
            
            for (auto i:nums){
                sum+=ceil((float)i/mid);
            }
            
            if (sum<=threshold){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        
        return l;
    }
    
};
