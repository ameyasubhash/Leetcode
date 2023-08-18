class Solution {
    public void swap(int a[], int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    
    
    public void sortColors(int[] a) {
        int n=a.length;
        
        
        // bubble sort
        // for(int i=0; i<n-1; i++){
        //     boolean swap = false;
        //     for(int j=0; j<n-1-i; j++){
        //         if(a[j+1]<a[j]){
        //             swap= true;
        //             swap(a, j+1, j);
        //         }
        //     }
        // }
        
        // insertion sort
        for(int i=1; i<n; i++){
            int j=i-1;
            int temp= a[i];
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
    }
}