import java.util.Scanner;

public class creation2Darrays {
    public static boolean searchindex(int matric[][],int key){
        for(int i=0; i<matric.length; i++){
            for(int j=0; j<matric[0].length; j++){
                if(matric[i][j]==key){
                    System.out.println("key index is found ("+i+" "+j+")");
                    return true;
                }
            }
        }
        System.out.println("key index is not found");
        return false;
    }

    public static int findlargest(int matric[][]){
        int max=matric[0][0];
        for(int i=0; i<matric.length; i++){
            for(int j=0; j<matric[0].length; j++){
                if(matric[i][j]>max){
                    max=matric[i][j];
                }
            }
        }
        return max;
    }

    public static int findsmallest(int matric[][]){
        int min = matric[0][0];
        for(int i=0; i<matric.length; i++){
            for(int j=0; j<matric[0].length; j++){
                if(matric[i][j]<min){
                    min = matric[i][j];
                }
            }
        }
        return min;
    }
    
    
        
    public static void main(String args[]){
        int matric[][] = new int [3][3];
        int n=matric.length; int m=matric[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matric[i][j]=sc.nextInt();
            }
            System.out.println();
        }
          //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matric[i][j]+" ");
            }
            System.out.println();
        }
            searchindex(matric,5);

            int largest = findlargest(matric);
            System.out.println("Largest element is:"+largest);
            int smallest = findsmallest(matric);
            System.out.println("Smallest element is:"+smallest);

    }
}
