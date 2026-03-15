import java.util.*; 
public class Graphs_day08_q4 {
    //day 08
    //no.of islands in a adjacency matrix
    //https://leetcode.com/problems/number-of-islands/

     public static void Traverse(char[][] grid , int[][] visited  , int i , int j){
        if(j >= grid[0].length || i >= grid.length || i < 0 || j < 0){
            return; 
        }
        if(grid[i][j] == '0' || visited[i][j] == 1 ){
           
            return ; 
        }
        visited[i][j] = 1; 
        Traverse(grid , visited , i-1  , j);
        Traverse(grid , visited , i+1 , j);
        Traverse(grid , visited , i , j+1);
        Traverse(grid , visited , i , j-1);

    }
    public static int numIslands(char[][] grid) {
        int count = 0; 
        int n = grid.length; 
        int m = grid[0].length;
        int[][] visited = new int[n][m]; 
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(visited[i][j] == 0 && grid[i][j] == '1'){
                    count++; 
                    Traverse(grid , visited , i , j);
                }
            }
        }
        return count; 
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] grid = new char[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                grid[i][j] = sc.next().charAt(0);
            }
        }
        int res =  numIslands(grid);
        System.out.println(res);
        sc.close();
    }
}
