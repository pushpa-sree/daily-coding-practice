import java.util.Scanner;
//day02 Question3
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
//Finding the First and Last Positions of Element in Sorted Array
public class Arrays_day02_q3 {
     
     public static int LastOccurance(int[] nums , int target){
       int high = nums.length-1 ; 
        int low = 0; 
        int ans = -1; 
        while(low <= high){
            int mid = low + (high - low)/2; 
            if(nums[mid]  == target){
                  low = mid+1;  
                  ans =  mid;
            }else if(nums[mid] > target){
                high = mid-1; 
            }else{
                low = mid + 1; 
            }
        }
        return ans; 
    }
    public static int FirstOccurance(int[] nums , int target){
        int high = nums.length-1 ; 
        int low = 0; 
        int ans = -1; 
        while(low <= high){
            int mid = low + (high - low)/2; 
            if(nums[mid]  == target){
                  high = mid-1; 
                  ans =  mid;
            }else if(nums[mid] > target){
                high = mid-1; 
            }else{
                low = mid + 1; 
            }
        }
        return ans; 
    }
    public  static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int FirstOccur = FirstOccurance(nums , target);
        int LastOccur = LastOccurance(nums , target);
        result[0] = FirstOccur; 
        result[1] = LastOccur; 
        return result; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] finalResult = searchRange(arr , k );
        System.out.println(finalResult[0]);
        System.out.println(finalResult[1]);

    }
}
