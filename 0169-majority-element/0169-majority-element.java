class Solution {
    public int majorityElement(int[] nums) {
        int count=1,key=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]==key) 
                count++;
            else 
                count--;
            if(count==0){
               key=nums[i]; 
                count=1;
            }  
        }
        return key;
    }
}