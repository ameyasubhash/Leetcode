class Solution {
    public int maxProduct(int[] nums) {
        int cur=1, max=Integer.MIN_VALUE, n=nums.length;
        
        for(int i=0; i<n; i++){
            cur*=nums[i];
            max=Math.max(max, cur);
            if(cur==0) cur=1;
        }
        cur=1;
        for(int i=n-1; i>=0; i--){
            cur*=nums[i];
            max=Math.max(max, cur);
            if(cur==0) cur=1;
        }
        return max;
    }
}