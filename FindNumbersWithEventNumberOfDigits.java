class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        
        for (int i:nums){
            res+=choose(i)%2==0?1:0;
        }
        
        return res;
    }
    
    private int choose(int n){
        if (n<10){
            return 1;
        }
        else if (n<100){
            return 2;
        }
        else if (n<100){
            return 2;
        }
        else if (n<1000){
            return 3;
        }
        else if (n<10000){
            return 4;
        }
        else if (n<100000){
            return 5;
        }
        else if (n<1000000){
            return 6;
        }
        else if (n<10000000){
            return 7;
        }
        else if (n<100000000){
            return 8;
        }
        else if (n<1000000000){
            return 9;
        }
        
        return 10;
    }
}
