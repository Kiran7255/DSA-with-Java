public class RatInMaze {
    static int N =4;

    static boolean solve(int maze[][], int x, int y, int sol[][]){

        //Destination reached
        if(x==N-1 && y==N-1 && maze[x][y] ==1){
            sol[x][y] = 1;
            return true;
        }
        //check valid cell
        if(x>=0 && x<N && y>=0 && y<N && maze[x][y]==1){
            sol[x][y] = 1;

            //down
            if(solve(maze, x+1, y, sol))
                return true;
            //right
            if(solve(maze, x, y+1, sol))
                return true;
            //Backtrak
            sol[x][y] = 0;
        }
        return false;
    }
    static void printSolution(int sol[][]){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int maze[][] = {
            {1,0,0,0},
            {1,1,0,0},
            {0,1,0,0},
            {1,1,1,1}
        };

        int sol[][] = new int [N][N];

        if(solve(maze, 0, 0, sol))
            printSolution(sol);
        else
            System.out.println("No Path Exists");
   }
    
}
