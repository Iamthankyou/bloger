class Solution {

 TreeMap<Integer, Integer> map;
    Random rand;
    int totalWeight;
    int[] weight;

    public Solution(int[] w) {
        this.weight = w;
        map = new TreeMap();
        totalWeight = 0;
        rand = new Random();

        for (int i = 0; i < weight.length; i++) {
            totalWeight += weight[i];
            map.put(totalWeight, i);
        }
    }

    public int pickIndex() {
        int randWeight = rand.nextInt(totalWeight) + 1;
        int key = map.ceilingKey(randWeight);
        return map.get(key);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
