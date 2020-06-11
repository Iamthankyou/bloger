class Solution {
    public void sortColors(int[] nums) {
        int choose[] = new int[3];
        
        for (int i:nums){
            choose[i]++;
        }
        
        int index = 0;
        
        for (int i=0; i<choose.length; i++){
            if (choose[i]>0){
                for (int j=0; j<choose[i]; j++){
                    nums[index++] = i;
                }
            }
        }
    }
}
