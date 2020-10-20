class Solution {
public:
    int minDominoRotations(vector<int>& A, vector<int>& B) {
        int res = A.size();    
        vector<int> countA(7), countB(7), same(7);
        
        for (int i=0; i<A.size(); i++){
            countA[A[i]]++;
            countB[B[i]]++;
            
            if (A[i]==B[i]){
                same[A[i]]++;
            }
        }
        
        for (int i=1; i<=6; i++){
            if (countA[i]+countB[i]-same[i] == A.size()){
                int tmp = min(coutnA[i], ocount[B]-same[i]);
                
                res = min(tmp,res);
            }
        }
        
        return res==A.size()?-1:res;
    }
};
