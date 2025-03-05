class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
         for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        return maxprofit(nums,n-1,dp);
    }
    public int maxprofit(int nums[],int n,int dp[]){
             if(n<0) return 0;
             if(n==0){
                return nums[0];
             }
             if(dp[n]!=-1){
                return dp[n];
             }
             else{
                dp[n]= Math.max(nums[n]+maxprofit(nums,n-2,dp),maxprofit(nums,n-1,dp));
              
             }
               return dp[n];
    }
}
