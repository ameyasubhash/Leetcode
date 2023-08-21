class Solution {
    public List<Integer> majorityElement(int[] nums) {
//         int n=nums.length;
//         int c1=0, c2=0, k1=nums[0], k2=nums[0];
//         List<Integer> list=new ArrayList<>();
        
//         for(int i=0; i<n; i++){
//             if(nums[i]==k1)
//                 c1++;
//             else
//                 count--;
//             if(count==0){
//                 key=nums[i];
//                 count=1;
//             }
//         }
//         return list;
        
         List<Integer> ans = new ArrayList<>();
        
        int n = nums.length;
        
        int numOne = 0, numTwo = 0, countOne = 0, countTwo = 0;
        
        for(int num : nums){
            if(num == numOne) countOne++;
            else if(num == numTwo) countTwo++;
            else if(countOne == 0){
                numOne = num;
                countOne++;
            }else if(countTwo == 0){
                numTwo = num;
                countTwo++;
            }else{
                countOne--;
                countTwo--;
            }
        }
        
        
        countOne = 0;
        countTwo = 0;
        
		
		//To check if numOne or numTwo appears more than n/3 times
        for(int num : nums){
            if(numOne == num) countOne++;
            else if(numTwo == num)countTwo++;
        }
        
        if(countOne > n/3) ans.add(numOne);
        if(countTwo > n/3) ans.add(numTwo);
        
        return ans;
    }
}