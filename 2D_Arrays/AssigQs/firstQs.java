// Print the number of 7's that are in the 2d array.
//Example input - int[][] array = {{4,7,8},{8,8,7}}  output - 2 

public class firstQs {
    public static void first_Qs(int array[][]){
        int counter = 0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j]==7){
                    counter++;
                }
            }
        }

        System.out.println("Counter of 7 is:"+counter);

    }
    public static void main(String args[]){
        int array [][]={{4,7,8},
                        {8,8,7}
                    };
         first_Qs(array);
    }

    
}
