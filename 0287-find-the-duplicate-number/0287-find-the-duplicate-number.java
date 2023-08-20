class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]==nums[1]) return nums[0];
        
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1])
                return nums[i];
        }
        return 0;
    }
}