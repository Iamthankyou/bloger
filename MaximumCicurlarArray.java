//duynotes.blogspot.com
class Solution {
    public int maxSubarraySumCircular(int[] A) {
        boolean isNegative = true;
        int min = Integer.MIN_VALUE;
        int sum = 0;
            
        for (int i:A){
            min = Math.max(min,i);
            sum += i;
            
            if (i>0){
                isNegative = false;
            }
        }
        
        if (isNegative){
            return min;
        }
        
        int caseOne = maxSequence(A);
        
        for (int i=0; i<A.length; i++){
            A[i]*=-1;
        }
        
        int caseTwo = sum + maxSequence(A);
        
        System.out.println(caseOne+","+caseTwo);
        
        return Math.max(caseOne,caseTwo);
        
    }
    
    private int maxSequence(int[] arr){
        int currSum = arr[0];
        int bestSum = arr[0];
        
        for (int i=1; i<arr.length; i++){
            currSum = Math.max(arr[i],arr[i]+currSum);
            bestSum = Math.max(currSum,bestSum);
        }
        
        return bestSum;
    }
}
