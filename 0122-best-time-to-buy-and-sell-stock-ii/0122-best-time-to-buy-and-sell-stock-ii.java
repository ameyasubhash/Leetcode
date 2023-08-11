class Solution {
    public int maxProfit(int[] a) {
        int pro=0;
        for(int i=1; i<a.length; i++){
            if(a[i]>a[i-1])
                pro+=(a[i]-a[i-1]);
        }
        return pro;
    }
}