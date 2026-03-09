import java.util.*; 
class Graphs_day10_q7{
    //day10
    //https://leetcode.com/problems/course-schedule/
     public static  boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < prerequisites.length; i++){
            int[] curr = prerequisites[i];
            adj.get(curr[1]).add(curr[0]);
            indegree[curr[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        int count = 0;

        // Add nodes with indegree 0
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int node = q.poll();
            count++;

            for(int nei : adj.get(node)){
                indegree[nei]--;
                if(indegree[nei] == 0){
                    q.add(nei);
                }
            }
        }

        return count == numCourses;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numcourses = sc.nextInt();
        int m = sc.nextInt();
        int[][]  prerequisites = new int[m][2];
        for(int i = 0 ; i < m ; i++){
            prerequisites[i][0] = sc.nextInt();
            prerequisites[i][1] = sc.nextInt();
        }
        boolean result = canFinish(numcourses, prerequisites);
        System.out.println(result);
        sc.close();

    }
}