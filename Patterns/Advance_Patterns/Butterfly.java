public class Butterfly {
    public static void Butterfly_pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for(int k=1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            for(int x=1; x<=i; x++){
                System.out.print("*");
            }

            System.out.println();
        }


        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for(int k=1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            for(int x=1; x<=i; x++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String args[]){
        Butterfly_pattern(4);
    }
    
}
