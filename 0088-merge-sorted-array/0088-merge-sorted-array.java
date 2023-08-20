class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int i=m+n-1;
        // while(i>=0){
        //     if()
        //     nums1[i]=Math.max(nums1[n-1],nums[m-1]);
        //     i--;
        // }
        // for(int i=0; i<m+n; i++){
        //     int temp=nums1[i];
        //     if(i<n)
        //     if(nums1[i]>=nums2[i]){
        //         nums1[i]=nums2[i];
        //     }
        // }
        int k=0;
        for(int i=m; i<m+n; i++){
            nums1[i]=nums2[k++];
        }
        Arrays.sort(nums1);
    }
}