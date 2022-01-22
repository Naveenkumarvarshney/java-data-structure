import java.util.Scanner;

public class Lec3_ins_circularlinkedlist {
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

    void creation(Scanner sc) {
        int data, n, m, p;
        do {
            System.out.println("Enter data");
            data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
                tail = new_node;
                new_node.next = head;
            } else {
                System.out.println("press 1 for insertion At beginning");
                System.out.println("press 2 for insertion At last");
                System.out.println("press 3 insertion at middle");
                m = sc.nextInt();
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
                        p = sc.nextInt();
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
            n = sc.nextInt();

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

    public static void main(String args[]) {
        Lec3_ins_circularlinkedlist cir = new Lec3_ins_circularlinkedlist();
        Scanner sc = new Scanner(System.in);
        cir.creation(sc);
        cir.traversal();

    }
}
