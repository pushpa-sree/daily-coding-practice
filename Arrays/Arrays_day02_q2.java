import java.util.*; 
public class Arrays_day02_q2 {
    //day 02
    //finding the minimum number in the Rotated Sorted Array
    //https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

     public static int findMin(int[] nums) {
        int high =  nums.length - 1; 
        int low = 0; 
    
        while(low < high){
            int mid = low + (high - low)/2; 
            if(nums[mid] <= nums[high]){
                high = mid; 
            }else{
                  low = mid + 1; 
            }
        }
        return nums[low];
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
       int mini = findMin(arr);
       System.out.println(mini);
    }
}
    

    

