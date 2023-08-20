class Solution {
    public int[][] merge(int[][] num) {
        int n=num.length;
        List<int []> res = new ArrayList<>();
        if(n==0 || num==null)
            return res.toArray(new int[0][]);
        Arrays.sort(num, (a,b)->a[0]-b[0]);
        
        int s=num[0][0];
        int e=num[0][1];
        
        for(int []i: num){
            if(i[0]<=e){
                e=Math.max(e, i[1]);
            }
            else{
                res.add(new int[]{s, e});
                s=i[0];
                e=i[1];
            }
        }
        res.add(new int[]{s, e});
        return res.toArray(new int[0][]);
    }
}