//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        // int n=nums.length;
        // String res="";
        // Arrays.sort(nums);
        // for(int i=1; i<n-2; i++){
        //     if(nums[i-1]==nums[i])
        // }
        int n=nums.length;
        int res [] = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int z=0;
        for(int i=0; i<n; i++){
            if(map.get(nums[i])==1){
                res[z++]=nums[i];
            }
            // if(map.get(nums[i])!=1){
            //     map.remove(nums[i]);
            // }
        }
        Arrays.sort(res);
        return res;
    }
}