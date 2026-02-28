import java.util.*; 
// Subarray Sum Equals K
//https://leetcode.com/problems/subarray-sum-equals-k/description/
//day 01
class Arrays_day01_q1{
        public static int subarraySum(int[] nums, int k) {
        HashMap <Integer , Integer> store = new HashMap<>();
        int right = 0;
        int sum = 0;
        int count = 0; 
        store.put(0 , 1); 
        while(right < nums.length){
            sum = sum + nums[right];
            if(store.containsKey(sum-k)){
                count = count + store.get(sum-k);
            }
            store.put(sum , store.getOrDefault(sum , 0)+1);
            
            right++; 
        }
        return count; 
    }   
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i = 0 ; i < n ; i++){
        arr[i] = sc.nextInt();
       }
       int k = sc.nextInt();
       int result = subarraySum(arr, k);
       System.out.println(result);

   }
}
