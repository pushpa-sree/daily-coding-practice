import java.util.*; 
//day 06
//https://leetcode.com/problems/number-of-provinces/
//no .of provinces 
public class Graphs_day07_q2 {

    public static void findBfs(int[][] isConnected, int[] visited, Queue<Integer> q){

        while(!q.isEmpty()){
            int node = q.poll();

            for(int i = 0; i < isConnected.length; i++){

                if(visited[i] != 1 && isConnected[node][i] == 1){

                    visited[i] = 1;
                    q.add(i);
                }
            }
        }
    }

    public static int findCircleNum(int[][] isConnected){

        int n = isConnected.length;
        int[] visited = new int[n];
        int res = 0;

        for(int i = 0; i < n; i++){

            if(visited[i] != 1){

                Queue<Integer> q = new LinkedList<>();

                visited[i] = 1;
                q.add(i);

                findBfs(isConnected, visited, q);

                res++;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] Connected = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                Connected[i][j] = sc.nextInt();
            }
        }
       int res =   findCircleNum(Connected);
       System.out.println(res);
    }
}
    

