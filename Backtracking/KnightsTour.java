public class KnightsTour {

    static int N=5;
    static int dx[]={-2,-2,2,2,-1,-1,1,1};
    static int dy[] = {-1,1,-1,1,-2,2,-2,2};

    static boolean solve(int x, int y, int move, int board[][]){
            if(move ==N*N){
                return true;
            }
            for(int k=0; k<8; k++){
                int nx = x+dx[k];
                int ny = y+dy[k];

                if(nx>=0 && nx<N && ny>=0 && ny<N && board[nx][ny] ==-1){
                    board[nx][ny]=move;
                    if(solve(nx, ny, move+1, board)==true)
                        return true;
                    board[nx][ny] = -1;

                }

            }
            return false;

        }

    static void print(int board[][]){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int board[][] = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                board[i][j] = -1;//not visited
            }
        }
        board[0][0] = 0;
        //error handling
        if(solve(0,0,1,board)==false){
            System.out.println("Not Possible");
        }else{
            print(board);
        }
    }
}
