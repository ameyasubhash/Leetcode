class Solution {
    public int maxSubArray(int[] nums) {
        // brute force
        // int maxSum=Integer.MIN_VALUE,sum;
        // int n=nums.length;
        // for(int i=0; i<n; i++){
        //     sum=0;
        //     for(int j=i; j<n; j++){
        //         sum+=nums[j];
        //         maxSum=Math.max(sum, maxSum);
        //     }
        // }
        // return maxSum;
        
        // optimised
        int curSum=0, max=Integer.MIN_VALUE;
        for(int i: nums){
            curSum+=i;
            max= Math.max(curSum, max);
            if(curSum<0)
                curSum=0;
        }
        return max;
    }
}