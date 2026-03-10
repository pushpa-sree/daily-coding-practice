import java.util.*; 
public class Strings_day11_q2 {
      public static boolean isAnagram(String s, String t) {
        int[] store = new int[26];
        if(s.length() != t.length()){
            return false; 
        }
        int n = s.length();
        int m = t.length();
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            store[ch-'a']++; 
        }
        for(int j = 0 ; j < m ; j++){
            char ch = t.charAt(j);
            store[ch-'a']--; 
        }
        for(int i = 0 ; i < 26 ; i++){
            if(store[i] > 0){
                return false; 
            }
        }
        return true; 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean isTrue = isAnagram(s , t);
        System.out.println(isTrue);
    }
}

