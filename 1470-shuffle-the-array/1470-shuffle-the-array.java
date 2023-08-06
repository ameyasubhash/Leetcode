class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res []= new int [2*n];
        int c=0;
        for(int i = 0; i<n*2; i+=2){
            res[i]=nums[c];
            res[i+1]=nums[c+n];
            c++;
        }
        return res;
    }
}