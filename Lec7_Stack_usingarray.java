import java.util.Scanner;

class Stack {
    int top = -1;
    int n = 10;
    int arr[] = new int[n];

    void push(Scanner scan) {
        if (top == (n - 1)) {
            System.out.println("overflow");
        } else {
            int i;
            System.out.println("Enter data");
            
            i = scan.nextInt();
            top = top + 1;
            arr[top] = i;
            System.out.println("Item inserted");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            top = top - 1;
            System.out.println("Item deleted");
        }
    }

    void display() {
        for (int j = top; j > 0; j--) {
            System.out.println(arr[j]);
        }
    }
}

public class Lec7_Stack_usingarray {
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
