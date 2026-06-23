public class SortedandRotatedArray {
    public static int SortedandRotated(int arr[], int tar, int si, int ei){
        //base case 
        if(si>tar){
            return -1;
        }
        //kam 
        int mid = si + (ei-si)/2;
        //case found 
        if(arr[mid]==tar){
            return mid;
        }
        //mid of L1
        if(arr[si]<= mid){
            if(arr[si]<= tar && tar<= arr[mid]){
                return SortedandRotated(arr, tar, si, mid-1);
            }
            return SortedandRotated(arr, tar, mid+1, ei);
        }
        //mid of L2
        else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                return SortedandRotated(arr, tar, mid+1, ei);
            }else{
                return SortedandRotated(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[]= {4,5,6,7,0,1,2,3};
        int tar = 7;
        int index = SortedandRotated(arr, tar, 0, arr.length-1);
        System.out.print(index);
    }
    
}
