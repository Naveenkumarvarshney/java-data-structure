public class Lec1_ins_linkedlist {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head;

    void Atinsertfirst(int data) {
        Node toadd = new Node(data);
        if (head == null) {
            head = toadd;
            return;
        }
        toadd.next = head;
        head = toadd;
    }
    void Atlastinsert(int data){
        Node toadd = new Node(data);
        if (head == null) {
            head = toadd;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode =currNode.next;
        }
        currNode.next=toadd;

    }
    void traversalLinkedlist(){
        if(head==null){
            System.out.println("head is null");
            return;
        }
        Node temp =head;
      while(temp!=null){
          System.out.println(temp.data);
          temp=temp.next;
      }
    }

    public static void main(String args[]) {
       Lec1_ins_linkedlist myobj = new Lec1_ins_linkedlist();
       myobj.Atinsertfirst(50);
       myobj.Atinsertfirst(70);
       myobj.Atinsertfirst(80);
    //    myobj.traversalLinkedlist();   
       
       myobj.Atlastinsert(90);
       myobj.traversalLinkedlist(); 
    }
}
