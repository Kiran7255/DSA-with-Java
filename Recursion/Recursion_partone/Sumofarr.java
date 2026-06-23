public class Sumofarr {
    public static int sumarr(int arr[], int i){
        if(i==arr.length){
            return 0;
        }
        int result = arr[i]+sumarr(arr,i+1);
        return result;  
    }
    public static void main(String args[]){
        int arr[]={5,1,2,4,3,6};
        System.out.print(sumarr(arr,0));
    }
    
}
