class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        
        Stack<Integer> s =new Stack<>();
        int arr [] = new int[n];
        
        for(int i = 2 * n - 1; i >= 0; i--){
            while(!s.isEmpty() && s.peek()<=nums[i%n])    // <= or else it will not give ans
                s.pop();
            if(i<n)
                arr[i%n] = s.isEmpty() ? -1 : s.peek();
            s.push(nums[i%n]);
        }
        return arr;
    }
}