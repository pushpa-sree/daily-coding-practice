import java.util.*; 
class Graphs_day17_q8{
    //reachable nodes from a src node in a graph using bfs
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int edges = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0 ; i < edges ; i++){
            int v = sc.nextInt();
            int u = sc.nextInt();
            adj.get(v).add(u);
            adj.get(u).add(v);
         }
         int src = sc.nextInt();
         ArrayList<Integer> res = new ArrayList<>();
         int[] visited = new int[n];
         Queue <Integer> q = new LinkedList<>();
         q.add(src);
         visited[src] = 1; 
         while(!q.isEmpty()){
            int curr = q.poll();
            res.add(curr);
            for(int i : adj.get(curr)){
                if(visited[i] != 1){
                    q.add(i);
                    visited[i] = 1; 
                }
            }

         }   
         
         System.out.println(res);


    }
}