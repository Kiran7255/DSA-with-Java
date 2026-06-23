public class TowerofHanoi {
    public static void towerofhanoi(int n, char src, char helper, char des){
        if(n==1){
            System.out.println("Move disk 1 from "+src + " to "+des);
            return;
        }
        towerofhanoi(n-1, src, des, helper);
        System.out.println("Move disk "+n+" from "+src+" to "+des);
        towerofhanoi(n-1, helper, src, des);

    }
    public static void main(String args[]){
        int n=3;
        towerofhanoi(n, 'A', 'B', 'C');

    }
    
}
