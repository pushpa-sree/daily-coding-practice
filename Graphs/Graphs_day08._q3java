import java.util.*; 
public class Graphs_day08_q3 {
 //day08
 //rotten oranges
 //https://leetcode.com/problems/rotting-oranges/

    public static int orangesRotting(int[][] grid) {
        int rows = grid.length; 
        int cols = grid[0].length; 
        Queue<int[]> q = new LinkedList<>();
        int ans = 0; 
        for(int i = 0 ; i < rows; i++){
            for(int j = 0 ; j < cols ; j++){
                if( grid[i][j] == 2){
                   int[] curr = {i , j , 0};
                   q.add(curr);
                }
            }
        } 
        while(!q.isEmpty()){
               int[] present = q.poll();
               int row = present[0] , col = present[1] , time = present[2];
               if(row+1 < rows && grid[row+1][col] == 1   ){
                 
                   grid[row+1][col] = 2; 
                   int[] curr = {row+1 , col , time+1};
                   ans = Math.max( ans , time+1);
                   q.add( curr);
               }
               if( row-1 >= 0 && grid[row-1][col] == 1 ){
                
                 grid[row-1][col] = 2; 
                 int[] curr = { row-1 , col , time+1};
                  ans = Math.max( ans , time+1);
                 q.add(curr);
               }
               if( col-1 >= 0 && grid[row][col-1] == 1   ){
               
                 grid[row][col-1] = 2; 
                 int[] curr = { row , col-1, time+1};
                  ans = Math.max( ans , time+1);
                 q.add(curr);
               }
               if(  col+1 < cols && grid[row][col + 1] == 1){

                 grid[row][col+1] = 2; 
                 int[] curr = { row , col+1 , time+1};
                  ans = Math.max( ans , time+1);
                 q.add(curr);
               }
               
        }

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++ ){
                if(grid[i][j] == 1){
                    return -1; 
                }
            }
        }
        return ans; 

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] grid = new int[row][col];
        for(int i = 0 ; i < row ;i++){
            for(int j = 0 ; j < col ; j++){
                    grid[i][j] = sc.nextInt();
            }
        }
        int ans = orangesRotting(grid);
        System.out.println(ans);
    }
}