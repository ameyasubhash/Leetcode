class Solution {
    public int majorityElement(int[] nums) {
        int ansKey=0,count=1;
        for(int i=1; i<nums.length;i++){
            if(nums[i] == nums[ansKey]) count++;
            else count--;
            if(count<0){
                count=1;
                ansKey=i;
            }
        }
        count=1;
        for(int n:nums){
            if(n==nums[ansKey]){
                count++;
                if(count>(nums.length/2))
                    return nums[ansKey];
            }
        }
        return 0;
    }
}