class Solution {
    public void swap(int [] a, int i, int j){
        int temp= a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void reverse(int [] a, int i, int j){
        while(i<j)
            swap(a, i++, j--);
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        if(i>=0){
            int j=n-1;
            while(j>=0 && nums[j]<=nums[i]) j--;
            swap(nums, i, j);
        }
        reverse(nums, i+1, n-1);
    }
}