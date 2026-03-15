import java.util.*; 
public  class Graphs_day09_q5{
      public static int[] shortestPath(int V, int[][] edges, int src) {

        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        Queue<Integer> q = new LinkedList<>();
        int[] distance = new int[V];

        Arrays.fill(distance, -1);

        distance[src] = 0;
        q.add(src);

        while(!q.isEmpty()){

            int node = q.poll();

            for(int neighbour : adj.get(node)){

                if(distance[neighbour] == -1){
                    distance[neighbour] = distance[node] + 1;
                    q.add(neighbour);
                }
            }
        }

        return distance;
    } 
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0 ; i < n ; i++){
    arr[i][0] = sc.nextInt();
    arr[i][1] = sc.nextInt();
}
        int src = sc.nextInt();
       int[] res = shortestPath(V , arr , src);
        System.out.println(Arrays.toString(res));
        sc.close();

    }

}