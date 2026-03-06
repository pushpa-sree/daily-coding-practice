import java.util.*; 
public class Recursions_day07_q3 {
    //day06
    //binary String without zeroes to adjucent
    //https://leetcode.com/problems/generate-binary-strings-without-adjacent-zeros/submissions/1938944840/

    public static void backtrack(String current, int remaining, char prev, List<String> ans) {
        if (remaining == 0) {
            ans.add(current);
            return;
        }
        backtrack(current + "1", remaining - 1, '1', ans);
        if (prev != '0') {
            backtrack(current + "0", remaining - 1, '0', ans);
        }
    }
    public static List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        backtrack("", n, '1', ans); 
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> res = validStrings(n);
        for(String i : res){
            System.out.println(i);
        }
    }

}
    

