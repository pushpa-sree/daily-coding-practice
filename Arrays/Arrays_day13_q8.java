 import java.util.*; 
 class NumArray {
    //day13
    //https://leetcode.com/problems/range-sum-query-immutable/
    int[] prefixSums;  
    public NumArray(int[] nums) {
        int n = nums.length; 
        prefixSums = new int[n+1];
        prefixSums[0] = 0; 
        for(int i = 1 ; i <= n ; i++){
              prefixSums[i] = prefixSums[i-1]+ nums[i-1];
        }
     
    }
    
    public int sumRange(int left, int right) {
        
        return prefixSums[right+1] - prefixSums[left]; 
    }
}
public class Arrays_day13_q8 {
   public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        NumArray obj = new NumArray(arr);   

        int left = sc.nextInt();
        int right = sc.nextInt();

        int result = obj.sumRange(left, right);

        System.out.println(result);
   }
}
