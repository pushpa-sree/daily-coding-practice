import java.util.*; 
class Graphs_day06_q2{
    //day06
    //https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
    //traversing graph using dfs
     public void traverse(int[] visited, ArrayList<Integer> res, int curr,
                         ArrayList<ArrayList<Integer>> adj) {

        res.add(curr);
        visited[curr] = 1;

        for (int i : adj.get(curr)) {
            if (visited[i] == 0) {
                traverse(visited, res, i, adj);
            }
        }
    }

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> res = new ArrayList<>();
        int[] visited = new int[adj.size()];

        traverse(visited, res, 0, adj);

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter edges (u v):");

        for (int i = 0; i < E; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u); 
        }

        Graphs_day06_q2 obj = new Graphs_day06_q2();

        ArrayList<Integer> res = obj.dfs(adj);

        System.out.println("DFS Traversal:");
        System.out.println(res);
    }
}
