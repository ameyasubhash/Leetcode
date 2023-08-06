class Solution {
    public int singleNumber(int[] nums) {
        
        // brute force
        // Arrays.sort(nums);
        // for(int i=0; i<nums.length-2; i++){
        //     if(nums[0]!=nums[1])
        //         return nums[0];
        //     if(nums[i]!=nums[i+1])
        //         if(nums[i+1]!=nums[i+2]){
        //              return nums[i+1];
        //         }
        // }
        // return nums[nums.length-1];
        
        // better
        // HashMap <Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(int i=0; i<nums.length; i++){
        //     if(map.get(nums[i])==1)
        //         return nums[i];
        // }
        // return 0;
        
        // optimised
        int k=0;
       
        for(int i:nums){
            k^=i;
        }
        return k;
    }
}