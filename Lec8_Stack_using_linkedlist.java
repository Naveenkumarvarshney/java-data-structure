import java.util.Scanner;

class Stack {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    void push(Scanner sc) {
        int d;
        System.out.println("Enter data");
        d = sc.nextInt();
        Node new_node = new Node(d);
        if (top == null) {
            top = new_node;
        } else {
            new_node.next = top;
            top = new_node;
        }
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
           Node temp=top;
           temp=temp.next;
           top=temp;

        }
    }
    void display(){
        if(top==null){
            System.out.println("top is null there is no element");
            return;
        }
        Node temp1=top;
        while(temp1!=null){
            System.out.println(temp1.data);
            temp1=temp1.next;
        }
    }

}

public class Lec8_Stack_using_linkedlist {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        int l, d;
        do {
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for display");
            System.out.println("Enter your choice");
            d = sc.nextInt();
            switch (d) {
                case 1:
                    s.push(sc);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
            }
            System.out.println("Enter 0 go back to main menu");

            System.out.println("Enter any key for exit");
            l = sc.nextInt();
        } while (l == 0);
        System.out.println("Exit successfully");
    }
}
