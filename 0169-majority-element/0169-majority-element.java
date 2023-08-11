class Solution {
    public int majorityElement(int[] a) {
        int n=a.length;
        int curmax, max=0, ele=0;
     for(int i=0; i<n; i++){
         curmax=0;
         for(int j=0; j<n; j++){
             if(a[i]==a[j])
                 curmax++;
         }
      //   max= Math.max(curmax, max);
         if(curmax>max){
            ele=a[i]; 
            max=curmax; 
         }
     }
        return ele;
    }
}