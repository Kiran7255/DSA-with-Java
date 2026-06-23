
public class BacktrackingArrays {
    public static void chnageArr(int arr[], int i, int val){
        //base case 
        if(i==arr.length){
            printArr(arr);
            return;
        }
        arr[i] = val;
        chnageArr(arr, i+1,val+1);
        arr[i] = arr[i]-2;


    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        chnageArr(arr, 0, 1);
        printArr(arr);
    }

    
}