
public class firstQs {
    
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }    
    }
    public Node getIntersectionNode(Node headA, Node headB){
        Node p1 = headA;
        Node p2 = headB;

        while (p1 != p2) {
            if(p1==null){
                p1 = headB;
            }else{
                p1=p1.next;
            }
            if(p2 == null){
                p2 = headA;
            }else{
                p2 = p2.next;
            }  
        }
        return p1;
    }
    public static void main(String args[]){
    firstQs ll = new firstQs();

    Node headA, headB ,common;

    common = new Node(30);
    common.next = new Node(40);
    common.next.next = new Node(50);
    
    headA = new Node(10);
    headA.next = new Node(20);
    headA.next.next = common;

    headB = new Node(3);
    headB.next = new Node(4);
    headB.next.next = common;

   Node ans = ll.getIntersectionNode(headA, headB);

   if(ans != null){
    System.out.println("Intersection Node = "+ans.data);
   }else{
    System.out.println("No Intersection");
   } 
  }
    
}
