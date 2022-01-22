import java.util.Scanner;
public class Lec5_ins_doubly_linkedlist {
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev=null;
        }

    }

    Node head = null;
    Node tail = null;

    void creation(Scanner scan) {
        int data, n, m, p;
        
        do {
            System.out.println("Enter data");
            data = scan.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
                tail = new_node;
                
            } else {
                System.out.println("press 1 for insertion At beginning");
                System.out.println("press 2 for insertion At last");
                System.out.println("press 3 insertion at middle");
                m = scan.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head.prev = new_node;
                        head=new_node;
                        break;
                    case 2:
                        new_node.prev=tail;
                        tail.next = new_node;
                        tail=new_node;
                        break;
                    case 3:
                        System.out.println("Enter the position");
                        p = scan.nextInt();
                        Node temp = head;
                        Node ptr = temp.next;
                       

                        for (int i = 1; i < (p - 1); i++) {
                            temp=ptr;
                            ptr=ptr.next;
                        }
                        
                        new_node.prev=temp;
                        new_node.next=ptr;
                        temp.next=new_node;
                        ptr.prev=new_node;
                        break;
                }
            }
            System.out.println("Do you want to more data 'press 1' otherwise 'press 2' for exit");
            n = scan.nextInt();

        } while (n == 1);
    }

    void traversal() {
        if (head == null) {
            System.out.println("head is null");
            return;
        }
        Node temp = head;

        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != null);
    }
    public static void main(String args[]){
          Lec5_ins_doubly_linkedlist myobj = new Lec5_ins_doubly_linkedlist();
          Scanner scan = new Scanner(System.in);
          myobj.creation(scan);
          myobj.traversal();
    }
}
