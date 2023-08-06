class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int result [] = new int[2];
        
        // brute force
        // int sum=0;
        // for(int i=0; i<nums.length;i++){
        //     sum=nums[i];
        //     for(int j=i+1;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==target){
        //             result[0]=i;
        //             result[1]=j;
        //             return result;
        //         }
        //         else
        //             sum-=nums[j];
        //     }
        // }
        // return result;
        
        
        // optimised
        Map <Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                result[0]= i;
                result[1]= map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}