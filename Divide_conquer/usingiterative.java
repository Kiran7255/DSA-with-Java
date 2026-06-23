public class usingiterative {
    public static int iterativesortedandRotatedArray(int arr[], int tar){

        int si = 0;
        int ei = arr.length-1;

        //base case 
        while(si<=ei){
        //kam 
        int mid = si + (ei-si)/2;

        if(arr[mid]==tar){
            return mid;
        }

        if(arr[si]<=arr[mid]){

            if(arr[si]<= tar && tar <= arr[mid]){
                ei = mid -1;
            }else{
                si = mid + 1;
            }
        }
        else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                si = mid + 1;
            }else{
                ei = mid - 1;
            }
        }
    }
    return -1;
}
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2,3};
        int tar = 6;
        int index = iterativesortedandRotatedArray(arr, tar);
        System.out.print(index);
    }
    
}
