public class binarysearch {
    public static int Binary_search(int numbers[], int key){
        int start =0; int end = numbers.length-1;
        while(start<=end){
            int mid = (start + end)/2;

            //comparisons 
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;

            }else{
                end = mid-1;
            }

            
        }
        return -1;

    }
    
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,6,8,10};
        int key = 88;
        System.out.print("index of key is:"+Binary_search(numbers, key));

    }
}
