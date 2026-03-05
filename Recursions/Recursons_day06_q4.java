import java.util.*; 
class Recursions_day06_q4{
    //day06
    //sum of combination of elements from given array whose sum is equal to the target
    //https://leetcode.com/problems/combination-sum/


     public static void dfs(int index, int[] candidates, int target,
                    List<Integer> current, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        if (index == candidates.length || target < 0) {
            return;
        }
        current.add(candidates[index]);
        dfs(index, candidates, target - candidates[index], current, ans);
        current.remove(current.size() - 1);  
        dfs(index + 1, candidates, target, current, ans);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
       List<List<Integer>> ans = combinationSum(arr, target);
       for(List<Integer> i : ans){
        System.out.println(i);
       }

    }
}

