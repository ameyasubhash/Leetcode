class Solution {
    public int majorityElement(int[] a) {
        // brute force
     //    int n=a.length;
     //    int curmax, max=0, ele=0;
     // for(int i=0; i<n; i++){
     //     curmax=0;
     //     for(int j=0; j<n; j++){
     //         if(a[i]==a[j])
     //             curmax++;
     //     }
     //  //   max= Math.max(curmax, max);
     //     if(curmax>max){
     //        ele=a[i]; 
     //        max=curmax; 
     //     }
     // }
     //    return ele;
        
        // intermediate
        Arrays.sort(a);
        int curmax=0, max=0, num=a[0];
        for(int i=0; i<a.length-1; i++){
            if(a[i]==a[i+1])
                curmax++;
            else{
                curmax=0;
            }
            if(max<curmax){
                    num=a[i];
                    max=curmax;
                    
                }
        }
        return num;
    }
}