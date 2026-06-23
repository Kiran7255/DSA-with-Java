public class checkoddandeven {
    public static void evenorodd(int n){
        int bitmask = 1;
       if((n&bitmask)==0) {
        System.out.println("Even no");
       }else{
        System.out.println("odd no");
       }
    }


    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    

    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }


    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }


    public static int UpdateIthBit(int n, int i, int newBit){
        // if(newBit ==0){
        //     return clearIthBit(n,i);
        // }else{
        //     return setIthBit(n,i);
        // }

        n=clearIthBit(n,i);
        int BitMask = newBit << i;
        return n|BitMask;
        
    }

    public static int clearlastIBits(int n, int i){
        int BitMask = (~0)<<i;
        return n & BitMask;
    }

    public static int clearRangeofbits(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int BitMask = a|b;
        return n&BitMask;
    }

    
    public static void main(String args[]){
        evenorodd(3);
        evenorodd(11);
        evenorodd(6);
        System.out.println(getIthBit(10,2));
        System.out.println(setIthBit(10,2));
        System.out.println(clearIthBit(10,1));
        System.out.println(UpdateIthBit(10,2,1));
        System.out.println(clearlastIBits(15,2));
        System.out.println(clearRangeofbits(10,2,4));

    }
    
}
