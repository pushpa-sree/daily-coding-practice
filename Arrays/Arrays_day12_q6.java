import java.util.*; 
public class Arrays_day12_q6 {

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count  = 0; 
        int pointer = 0; 
        int i = 0 ; 
       while(i < g.length && pointer < s.length){
             if( g[i] <= s[pointer]){
                count++; 
                s[pointer] = 0;
                pointer++;  
                i++; 
             }else if(g[i] > s[pointer]){
                pointer++; 
             }
        }
        return count; 
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] g = new int[n];
    for(int i = 0 ; i < n ; i++){
        g[i] = sc.nextInt();
    }

    int m = sc.nextInt();
    int[] s = new int[m];
    for(int i = 0 ; i < m ; i++){
        s[i] = sc.nextInt();
    }

    int res = findContentChildren(g, s);
    System.out.println(res);
}
}
    

