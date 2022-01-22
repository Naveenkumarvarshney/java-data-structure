import java.util.Scanner;

public class Lec4_del_circularlinkedlist {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
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
                new_node.next = head;
            } else {
                System.out.println("press 1 for insertion At beginning");
                System.out.println("press 2 for insertion At last");
                System.out.println("press 3 insertion at middle");
                m = scan.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        tail.next = head;
                        break;
                    case 2:

                        tail.next = new_node;
                        tail = new_node;
                        new_node.next = head;
                        break;
                    case 3:
                        System.out.println("Enter the position");
                        p = scan.nextInt();
                        Node q = head;

                        for (int i = 0; i < (p - 1); i++) {
                            q = q.next;

                        }

                        new_node.next = q.next;
                        q.next = new_node;
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
        } while (temp != head);
    }

    void deletion(Scanner scan) {
        int m, n;
        do{
           
        if (head == null) {
            System.out.println("linked list does not exist");
        } else {
            System.out.println("press 1 for deletion at first");
            System.out.println("press 2 for deletion at last");
            
            
            m = scan.nextInt();
            switch (m) {
                case 1:
                    Node temp = head;
                    temp = temp.next;
                    head = temp;
                    tail.next = head;
                    break;

                case 2:
                    temp = head;
                    Node ptr = head.next;
                    while (ptr.next != head) {
                        temp = ptr;
                        ptr = ptr.next;
                    }
                    temp.next = head;
                    tail = temp;
                    break;
            }
        }
        System.out.println("do you want to delete more element press 1 otherwise press 2");
        n=scan.nextInt();
    }while(n==1);
    }

    public static void main(String args[]) {
      Lec4_del_circularlinkedlist myobj = new Lec4_del_circularlinkedlist();
      Scanner scan = new Scanner(System.in);
      myobj.creation(scan);
      myobj.traversal();
      myobj.deletion(scan);
      myobj.traversal();
    }
}
