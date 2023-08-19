class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0], max=0;
        for(int i=0; i<prices.length; i++){
            min=Math.min(min, prices[i]);
            int pro=prices[i]-min;
            max=Math.max(pro, max);
        }
        return max;
    }
}