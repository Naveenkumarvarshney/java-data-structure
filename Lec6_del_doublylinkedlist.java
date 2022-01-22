import java.util.Scanner;

public class Lec6_del_doublylinkedlist {
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

    Node head=null ;
    Node tail=null ;

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
                        
                        tail.next = new_node;
                        new_node.prev=tail;
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

    void delete(Scanner scan) {
        int  m, n, p;
     
        
        do {

            if (head == null) {
                System.out.println("linked list does not exist");
            } else {
                System.out.println("press 1 for deletion at first");
                System.out.println("press 2 for deletion at last");
                System.out.println("press 3 for deletion in middle with the given data");
                m = scan.nextInt();
                switch (m) {
                    case 1:
                    Node temp = head;
                        temp = temp.next;
                        head = temp;
                        head.prev=null;
                        break;

                    case 2:
                       Node ptr = tail;
                       ptr=ptr.prev;
                       ptr.next=null;
                       tail=ptr;
                        break;
                    case 3:
                      Node temp1=head;
                       Node ptr1=temp1.next;
                        System.out.println("Enter the position do you want to delete");
                        p = scan.nextInt();
                        for (int i=1 ; i<p-1;i++) {
                            temp1 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp1.next = ptr1.next;
                        ptr1.next.prev=temp1;
                        break;

                }
            }
            System.out.println("do you want to delete more element press 1 otherwise press 2");
            n = scan.nextInt();
        } while (n == 1);
    }

    public static void main(String args[]) {
        Lec6_del_doublylinkedlist myobj1 = new Lec6_del_doublylinkedlist();
        Scanner scan = new Scanner(System.in);
        myobj1.creation(scan);
        myobj1.traversal();
        myobj1.delete(scan);
        myobj1.traversal();
    }
}
