public class binToDec {
    public static void binaryToDec(int binNum){
        int pow = 0;
        int decNum = 0;
        int original = binNum;

        while(binNum>0){
            int lastDigit = binNum%10;
            decNum = decNum + (int)(lastDigit * Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of"+original+"="+decNum);
    }


    public static void Decialtobinary(int n){
        int pow  = 0;
        int binNum = 0;
        int original = n;

        while(n>0){
            int rem = n%2;
            binNum = binNum + (int) (rem * Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.print("Binary of "+original+ "="+binNum);
    }

    public static void main(String args[]){
        binaryToDec(1101);
        Decialtobinary(7);
    }
    
}
