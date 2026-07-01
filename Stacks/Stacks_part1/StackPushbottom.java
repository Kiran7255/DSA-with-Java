import java.util.*;
public class StackPushbottom {
    public static void pushAtBttom(Stack<Integer> s, int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBttom(s,data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBttom(s, 5);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
            
        }
    }
    
}
