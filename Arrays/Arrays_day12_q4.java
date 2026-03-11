import java.util.*; 
public class Arrays_day12_q4 {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; 
        int maxProfit =0; 
        for(int cost : prices){
            if(minPrice > cost){
                minPrice = cost;
            }
            maxProfit = Math.max(cost-minPrice , maxProfit);
            
            
        }
        return maxProfit; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0 ; i < n ; i++){
            prices[i] = sc.nextInt();
        }
        int ans = maxProfit(prices);
        System.out.println(ans);
    }
}
