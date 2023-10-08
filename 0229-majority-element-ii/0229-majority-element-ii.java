class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        
        int c1=0, c2=0, n1=0, n2=0, n=nums.length;
        
        for(int i=0; i<n; i++){
            if(nums[i]==nums[n1]) c1++;
            else if(nums[i]==nums[n2]) c2++;
            else if(c1==0){ n1=i; c1++;}
            else if(c2==0){ n2=i; c2++;}
            else{c1--; c2--;}
        }
        c1=0; c2=0; n1=nums[n1]; n2=nums[n2];
        
        for(int num:nums){
            if(n1==num) c1++;
            else if(n2==num) c2++;
        }
        if(c1>(n/3)) list.add(n1);
        if(c2>n/3) list.add(n2);
        
        return list;
        
//         List<Integer> list= new ArrayList<Integer>();
        
//         int key=0, count=1, n=nums.length ;
//         for(int i=0; i<n; i++){
//             if(nums[])
//         }
    }
}