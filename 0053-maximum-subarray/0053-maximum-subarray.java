class Solution {
    public int maxSubArray(int[] nums) {
        int cur=0, max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            cur+=nums[i];
            // if(cur>max)
            //     max=cur;
            // this will not work for negative value so use Math.max
            max= Math.max(max, cur);
            if(cur<0)
                cur=0;
        }
        return max;
    }
}