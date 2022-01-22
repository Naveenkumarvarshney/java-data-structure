import java.util.Scanner;

class queuelinkedlist {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node f = null;
    Node r = null;

    void enqueue(Scanner sc) {
        int d;
        System.out.println("Enter data");
        d = sc.nextInt();
        Node new_node = new Node(d);
        if (f == null) {
            f = new_node;
            r = new_node;
        } else {
            r.next=new_node;
            r=new_node;
        }
    }

    void dequeue() {
        if (f == null&& r==null) {
            System.out.println("queue is empty");
        } else {
           f=f.next;
           
        }
    }
    void display(){
        if(f==null){
            System.out.println("top is null there is no element");
            return;
        }else{
            Node temp3=f;
            while(temp3!=null){
                System.out.println(temp3.data);
                temp3=temp3.next;
            }
        }
        
    }

}

public class Lec10_queue_using_Linkedlist {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        queuelinkedlist q1 = new queuelinkedlist();
        int l, d;
        do {
            System.out.println("Press 1 for enqueue");
            System.out.println("Press 2 for dequeue");
            System.out.println("Press 3 for display");
            System.out.println("Enter your choice");
            d = sc.nextInt();
            switch (d) {
                case 1:
                    q1.enqueue(sc);
                    break;
                case 2:
                    q1.dequeue();
                    break;
                case 3:
                    q1.display();
                    break;
            }
            System.out.println("Enter 0 go back to main menu");

            System.out.println("Enter any key for exit");
            l = sc.nextInt();
        } while (l == 0);
        System.out.println("Exit successfully");
    }
}
