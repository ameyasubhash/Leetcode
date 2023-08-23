class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        
//         brute force
//         int res[] = new int[n1];
//         boolean present = false;
        
//         for(int i=0; i<n1; i++){
//             for(int j=0; j<n2; j++){
//                 if(nums1[i]==nums2[j]){
//                     present=true;
//                 }
//                 if(present){
//                     if(nums1[i]<nums2[j]){
//                         res[i]=nums2[j];
//                         break;
//                     }
//                     else{
//                         res[i]=-1;
//                     }
//                 }
//             }
//             present=false;
//         }
//         return res;
        
        // optimised code
        HashMap <Integer, Integer> map = new HashMap<>();
        Stack <Integer> s = new Stack<>();
        
        for(int num: nums2){
            while(!s.isEmpty() && s.peek()<num)
                map.put(s.pop(), num);
            s.push(num);
        }
        for(int i=0; i<n1; i++)
            nums1[i]= map.containsKey(nums1[i]) ? map.get(nums1[i]) : -1;
        return nums1;
    }
}