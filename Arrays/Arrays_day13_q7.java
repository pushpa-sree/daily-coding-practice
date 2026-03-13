import java.util.Arrays;
import java.util.Scanner;

public class Arrays_day13_q7 {
    //day 13
    //https://leetcode.com/problems/running-sum-of-1d-array/
    public static int[] runningSum(int[] nums) {
        int n = nums.length; 
        int[] res = new int[n];
        int sum = 0; 
       for(int i = 0 ; i < n ; i++){
            sum = sum + nums[i];
            res[i] = sum; 
       }
       return res; 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int[] res = runningSum(arr);
        System.out.println(Arrays.toString(res));
    }
}
