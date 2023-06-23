import java.util.*;
public class Solution {
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        int[][] direction = {{1,0},{0,1},{-1,0},{0,-1}};
        boolean[][] visited = new boolean[n][n];
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        if(maze[0][0]==0 || maze[n-1][n-1]==0)
            return result;
        visited[0][0] = true;
        fn(0,0,maze,result,direction,n,visited);
        
        return result;
    }
    public static void fn(int i,int j,int[][] maze,ArrayList<ArrayList<Integer>> result,int[][] direction,int n,boolean[][] visited){
        if(i==n-1 && j==n-1){
            ArrayList<Integer> list = new ArrayList<>();
            for(int k=0;k<n;k++){
                for(int l=0;l<n;l++){
                    if(visited[k][l]){
                        list.add(1);
                    }
                    else{
                        list.add(0);
                    }
                }
            }
            result.add(list);
            return ;
        }

        
        for(int[] dir : direction){
            int ci = i + dir[0];
            int cj = j + dir[1];
            if(ci>=0 && cj>=0 && ci<n && cj<n && visited[ci][cj]!=true && maze[ci][cj]==1){
                visited[ci][cj] = true;
                fn(ci,cj,maze,result,direction,n,visited);
                visited[ci][cj] = false;
            }
        }
        
    }
}