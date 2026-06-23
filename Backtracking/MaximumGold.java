public class MaximumGold {
    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};

    static int solve(int x, int y, int grid[][], int n,int m){
        int gold = grid[x][y];
        //gold collected marks the curr cell as 0
        grid[x][y]=0;
        int ans=0;
        for(int k=0; k<4; k++){

            int nx = x+dx[k];
            int ny = y+dy[k];
            if(nx>=0 && nx<n && ny>=0 && ny<m && grid[nx][ny]!=0){
                // which ever direcction gives is the max gold
                ans = Math.max(ans, solve(nx,ny, grid, n,m));
            }
        }
        grid[x][y] = gold; //..restore
        // curr cell gold + max(left, right, down, up);
        return gold+ans;
    }

    public int getMaximumGold(int grid[][]){
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                // we can start from hs some gold in it 
                if(grid[i][j]!=0){
                    // amount of gold collected if we start from i, j cell
                    int value = solve(i,j,grid,n,m);

                    if(value>ans)
                        ans = value;
                }

            }
        }
        return ans;
    }
    public static void main(String args[]){
        int grid [][]= {
            {0,6,0},
            {5,8,7},
            {0,9,0}
        };
        MaximumGold obj = new MaximumGold();
        System.out.println(obj.getMaximumGold(grid));
    }
    
}
