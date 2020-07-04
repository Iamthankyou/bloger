https://leetcode.com/problems/super-pow
class Solution {
    public int superPow(int a, int[] b) {
        int res = 1;
        
        for (int i:b){
            res = pow(res,10)*pow(a,i)%1337;
        }
        
        return res;
    }
    
    private int sqr(int x){
        return x*x;
    }
    
//     private int pow(int a,int b){
//         if (b==0){
//             return 1%1337;
//         }
        
//         if (b==1){
//             return a%1337;
//         }

//         return b%2==0?sqr(pow(a,b/2))%1337:(a*(sqr(pow(a,b/2))%1337))%1337;
//     }
    
    private int pow(int a, int b){
        if (b==0){
            return 1;
        }
        
        if (b==1){
            return a%1337;
        }
        
        // return b%2==0?sqr(pow(a%1337,b/2))%1337:(a%1337)*sqr(pow(a%1337,b/2))%1337;
        return pow(a%1337,b/2)*pow(a%1337,b-b/2)%1337;
    }
}
