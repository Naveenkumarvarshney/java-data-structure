public class Lec2_del_linkedlist {
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

    void deletionAtfirst() {
        if(head==null){
            System.out.println("Linked list is null no element deleted");
            return;
        }
        head = head.next;
    }
     
    void deletionAtlast(){
        if(head==null){
            System.out.println("Linked list is null no element deleted");
            return;
        }
        Node p=head;
        Node q=head.next;
        while(q.next!=null){
            p=p.next;
            q=q.next;
        }
        p.next=null;
    }
     
    void deletionWithaGivendata(int value){
       Node p =head;
       Node q=head.next;
       while(q.data!=value){
           p =p.next;
           q=q.next;
       }
       p.next=q.next;
    }
    void traversalLinkedlist() {
        if (head == null) {
            System.out.println("head is null");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        Lec2_del_linkedlist myobj = new Lec2_del_linkedlist();
        myobj.Atinsertfirst(50);
        myobj.Atinsertfirst(70);
        myobj.Atinsertfirst(80);

        // myobj.deletionAtfirst();
        // myobj.deletionAtlast();
        myobj.deletionWithaGivendata(70);
        myobj.traversalLinkedlist(); 

    }
}
