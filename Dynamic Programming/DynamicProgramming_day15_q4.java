import java.util.*; 
public class DynamicProgramming_day15_q4 {
    //day15
    //https://leetcode.com/problemset/
     public static int rob(int[] nums) {
        int n = nums.length; 
       // int[] dp = new int[n];
        int money = 0; 
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0] , nums[1]);
        }
        int prev1 = nums[0];
        int prev2 = Math.max(nums[0] , nums[1]);
        int current = 0; 
    //    dp[0] = nums[0];
    //     dp[1] = Math.max(nums[0] , nums[1]);
        for(int i = 2 ; i < n ; i++){
            // dp[i] = Math.max(nums[i]+dp[i-2] , dp[i-1]);
              current = Math.max(nums[i] + prev1 , prev2);
              prev1 = prev2; 
              prev2 = current; 
              
        }
        // return dp[n-1];
        return current; 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ;i++){
            nums[i] = sc.nextInt();
        }
        int res = rob(nums);
        System.out.println(res);
        sc.close();
    }
}
