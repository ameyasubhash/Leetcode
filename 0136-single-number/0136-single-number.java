class Solution {
    public int singleNumber(int[] nums) {
                Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(nums[0]!=nums[1])
                return nums[0];
            if(nums[i]!=nums[i+1])
                if(nums[i+1]!=nums[i+2])
                    return nums[i+1];
            
        }
        return nums[nums.length-1];
//         int k=0;
//         int i;
//         // brute force
//         Arrays.sort(nums);
//         for(i=0; i<nums.length-2; i+=2){
//             if(nums[0]!=nums[1])
//                 return nums[0];
//             // if(nums[i]!=nums[i+1])
//             //     if(nums[i+1]!=nums[i+2]){
//             //         k=nums[i+1];
//             //         return k;
//             //     }
//             if(nums[i]!=nums[i+1])
//                 if(nums[i+1]!=nums[i+2])
//                     return nums[i+1];
            
//         }
//         return nums[nums.length-1];
    }
}