import java.util.*; 
public class Graphs_day09_q6 {
   public static boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> arr = new ArrayList<>();
        boolean[] visited = new boolean[n];
        Queue <Integer> q = new LinkedList<>();
        for(int i = 0 ; i < n ; i++){
            arr.add(new ArrayList<>());
        }
        for(int[] e : edges){
            arr.get(e[0]).add(e[1]);
            arr.get(e[1]).add(e[0]);
        }
        q.add(source);
        while(!q.isEmpty()){
            int curr = q.poll();
            if(destination == curr){
                return true; 
            }
            for(int i : arr.get(curr)){
                if(!visited[i]){
                    visited[i] = true; 
                    q.add(i);
                }
            }
        }
        return false; 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0 ; i < n ; i++){
             arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int src = sc.nextInt();
        int destination = sc.nextInt();
        boolean isTrue = validPath(n, arr, src, destination);
        System.out.println(isTrue);

    }
    
}
