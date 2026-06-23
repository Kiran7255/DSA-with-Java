public class Reverselinkelist {
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
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next ;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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
    public static void main(String args[]){
        Newlinkedlist ll = new  Newlinkedlist();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(4);
        ll.print();

        ll.reverse();
        ll.print();

    }
}

