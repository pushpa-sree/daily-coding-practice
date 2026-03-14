import java.util.*; 
public class DynamicProgramming_day14 {
     public static int climbStairs(int n) {
        if(n == 1  || n == 0){
            return 1; 
        }
        int[] dp = new int[n+1];
        dp[0] = 1; 
        dp[1] = 1; 
        dp[2] = 2; 
        int counter = 3; 
        while(counter <= n){
            dp[counter] = dp[counter-1] + dp[counter-2];
            counter++; 
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = climbStairs(n);
        System.out.println(res);
    }
}

