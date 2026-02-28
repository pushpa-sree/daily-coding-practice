import java.util.*; 
//Longest Substring without Repeating Characters
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
//day 01
class Strings_day01_q1 {
    public static int lengthOfLongestSubstring(String s) {
        int[] chars = new int[256];
        int right = 0; 
        int left = 0; 
        int resu = 0; 
        while (right < s.length()) {
            char ch = s.charAt(right);
            while (chars[ch] > 0) {
                char leftChar = s.charAt(left);
                left++; 
                chars[leftChar]--; 
            }
            chars[ch]++; 
            resu = Math.max(resu, right - left + 1);
            right++; 
        }
        return resu; 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Strings_day01_q1 obj = new Strings_day01_q1();   // Create object
        int result = obj.lengthOfLongestSubstring(s);    // Call method
        System.out.println(result);
        sc.close();
    }
}