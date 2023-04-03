class Solution {
   
    public int search(int[] nums, int target) {
        int mid=0,first=0,last=nums.length-1;
        while(first<=last){
            mid=first+(last-first)/2;
            if(nums[mid]==target) return mid;
            
            else if(nums[mid]<target) first=mid+1;
            
            else  last=mid-1;
        }
        return -1;
        
    }
}