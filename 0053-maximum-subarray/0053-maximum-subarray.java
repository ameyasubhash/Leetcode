class Solution {
    public int maxSubArray(int[] nums) {
        int cur=0, max= Integer.MIN_VALUE;
        for(int num:nums){
            cur+=num;
            max=Math.max(cur,max);
            if(cur<0) cur=0;
        }
        return max;
    }
}