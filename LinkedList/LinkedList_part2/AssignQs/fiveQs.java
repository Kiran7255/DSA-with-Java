import java.util.PriorityQueue;

public class fiveQs {

    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }    
    }

    public Node  mergeXLists(Node [] lists){
        PriorityQueue<Node> pq = 
        new PriorityQueue<>((a,b) -> a.data - b.data);

        for(Node node:lists){
            if(node != null){
                pq.offer(node);
            }
        }
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (!pq.isEmpty()) {
            Node smallest = pq.poll();

            tail.next = smallest;
            tail = tail.next;

            if(smallest.next != null){
                pq.offer(smallest.next);
            }
            
        }
        return dummy.next;
    }
    public static void main(String args[]){

        fiveQs obj = new fiveQs();

        //first List : 1 -> 4 -> 5
        Node head1 = new Node(1);
        head1.next = new Node(4);
        head1.next.next = new Node(5);

        //Second List : 1 -> 3 -> 4 
        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);
        
        //Third List : 2-> 6
        Node head3 = new Node(2);
        head3.next = new Node(6);

        Node[] lists = {head1, head2, head3};

        Node ans = obj.mergeXLists(lists);

        System.out.println("Merged Linked List:");
        while (ans != null) {
            System.out.print(ans.data + "->");
            ans = ans.next;
            
        }
        System.out.println("null");
    }
    
}
