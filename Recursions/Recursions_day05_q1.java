import java.util.*; 
public class Recursions_day05_q1 {
  // day05
  //recursion
  //https://leetcode.com/problems/subsets/
     public static  void GenerateSubsets(List<List<Integer>> result , List <Integer> temp, int[] nums , int current){
        if(current >= nums.length){
            result.add(new ArrayList<>(temp));
            return ; 
        }
        ;
        temp.add(nums[current]);
        GenerateSubsets(result , temp , nums , current+1);
        temp.remove(temp.size()-1);
        GenerateSubsets(result , temp , nums , current+1);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length - 1; 
        List<List<Integer>> result = new ArrayList<>();
        List <Integer> temp = new ArrayList<>();
        GenerateSubsets(result , temp ,  nums , 0);
        return result; 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> res = subsets(arr);
        for (List<Integer> i : res) {
            System.out.println(i);
        }
    }
    
}
