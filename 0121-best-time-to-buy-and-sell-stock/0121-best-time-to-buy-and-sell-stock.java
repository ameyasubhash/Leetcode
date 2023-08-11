class Solution {
    public int maxProfit(int[] a) {
        int minSoFar=a[0], maxPro=0;
        for(int i=0; i<a.length; i++){
            minSoFar = Math.min(minSoFar, a[i]);
            int pro = a[i]-minSoFar;
            maxPro = Math.max(maxPro, pro);
        }
        return maxPro;
    }
}