

public class CheckPalindromell {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data){
        // step 1 - Create new node 
        Node newnode = new Node(data);
        size++;

        if(head==null){
            head=tail=newnode;
            return;
        }
        //step 2 - newNode next = head
        newnode.next = head; //link 

        // step3 - head = newNode
        head = newnode;
    }

    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }



    //Slow-Fast Approach    
    public Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next;//+2
        }
        return slow; // slow is my midNode
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step 1 - find mid
        Node midNode = findMidNode(head);

        // step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next =  curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;   
        }

        Node right = prev; // right half head
        Node left = head;



        // step 3 - check left half and right half 

        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
            
        }
        return true;
    }
    public static void main (String args[]){
        CheckPalindromell ll = new CheckPalindromell();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();

        System.out.println(ll.checkPalindrome());
    }
    
}
