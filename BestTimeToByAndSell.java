// duynotes.blogspot.com
class Solution {
    public int maxProfit(int[] prices) {
        int peak = 0;
        int valey = 0;
        int profit = 0, i=0;
        
        while(i+1<prices.length){
            for (;i+1<prices.length && prices[i]>=prices[i+1];i++);
            valey = prices[i];
            for (;i+1<prices.length && prices[i]<=prices[i+1];i++);
            peak = prices[i];
            profit += peak-valey; 
        }
        
        return profit;
    }
}
