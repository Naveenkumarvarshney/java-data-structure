import java.util.Scanner;
class queue2 {
    int f=-1,r=-1;
    int n = 10;
    int arr[] = new int[n];

    void enqueue(Scanner sc) {
        if(f==(r+1)%n){
            System.out.println("Overflow occur");
        }
        else{
            System.out.println("Enter data");
            int i= sc.nextInt();
            if(f==-1&&r==-1){
                f=0;
                r=0;
                arr[r]=i;
            }
            else{
                r=(r+1)%n;
                arr[r]=i;
            }
        }
    }

    void dequeue() {
        if(f==-1&&r==-1){
            System.out.println("underflow occour");
        }
        else if(f==r){
            System.out.println("underflow occour");
            f=-1;
            r=-1;
        }
        else{
            f=(f+1)%n;
        }
    }

    void display() {
        
        System.out.println("Items are.........");
        for(int j=f;j!=r;j=(j+1)%n){
            System.out.println(arr[j]);
        }
        System.out.println(arr[f]);
    }
}
public class Lec11_circularqueue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        queue2 s2 = new queue2();
        int l, d;
        do {
            System.out.println("Press 1 for enqueue");
            System.out.println("Press 2 for dequeue");
            System.out.println("Press 3 for display");
            System.out.println("Enter your choice");
            d = sc.nextInt();
            switch (d) {
                case 1:
                    s2.enqueue(sc);
                    break;
                case 2:
                    s2.dequeue();
                    break;
                case 3:
                    s2.display();
                    break;
            }
            System.out.println("Enter 0 go back to main menu");

            System.out.println("Enter any key for exit other than 0");
            l = sc.nextInt();
        } while (l == 0);
        System.out.println("Exit successfully");
    }
}
