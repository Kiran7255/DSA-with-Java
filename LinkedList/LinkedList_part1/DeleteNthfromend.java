public class DeleteNthfromend {
        //calculate size 
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
    public void deleteNthfromEnd(int n){
        // calculaate size
        int sz = 0; 
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;  
        }

        if(n==sz){
            head = head.next; // removefirst
            return;
        }
        //sz-n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while (i<iToFind) {
            prev = prev.next;
            i++;  
        }

        prev.next = prev.next.next;
        return;
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
        DeleteNthfromend ll = new  DeleteNthfromend();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(4);
        ll.print();

        ll.deleteNthfromEnd(3);
        ll.print();
    }

    
    
}
