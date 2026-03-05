import java.util.*; 
class Recursions_day05_q2{

    // day 05
    //Recursions
    //https://leetcode.com/problems/permutations/
      public static void permutation(int[] nums, List<Integer> current,
                                   boolean[] used, List<List<Integer>> result) {

        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;   
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) continue;

            used[i] = true;
            current.add(nums[i]);

            permutation(nums, current, used, result);

            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        permutation(nums, new ArrayList<>(), used, result);

        return result;
    }
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             int[] nums = new int[n];
             for(int i = 0 ; i < n ; i++){
                nums[i] = sc.nextInt();
             }
             List<List<Integer>> res = permute(nums);
            for (List<Integer> i : res) {
            System.out.println(i);
              }

         }
}