public class FriendsPairingone{
    public static int friendspairing(int n){
        if(n==0 || n==1){
            return 1;
        }
        int single = friendspairing(n-1);
        int pair = single* friendspairing(n-2);
        return single + pair;
    }
    public static void main(String args[]){
        System.out.print(friendspairing(3));

    }
    
}