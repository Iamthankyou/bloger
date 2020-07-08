class Solution {
    public double calculateEntropy(int[] input) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i:input){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        double res = 0;
        
        for (int i:map.keySet()){
            double x = (double)map.get(i)/input.length;
            
            res+=(-1)*x*(Math.log(x)/Math.log(2));
        }
        
        return res;
    }
}
