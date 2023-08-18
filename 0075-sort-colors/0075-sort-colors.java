class Solution {
    public void swap(int a[], int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    
    
    public void sortColors(int[] a) {
        
        // bubble sort
        
        int n=a.length;
        for(int i=0; i<n-1; i++){
            boolean swap = false;
            for(int j=0; j<n-1-i; j++){
                if(a[j+1]<a[j]){
                    swap= true;
                    swap(a, j+1, j);
                }
            }
        }
    }
}