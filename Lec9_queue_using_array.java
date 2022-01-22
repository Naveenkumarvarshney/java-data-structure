import java.util.Scanner;
class queue {
    int f=-1,r=-1;
    int n = 10;
    int arr[] = new int[n];

    void enqueue(Scanner sc) {
        if(r==(n-1)){
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
                r=r+1;
                arr[r]=i;
            }
        }
    }

    void dequeue() {
        if(f==-1&&r==-1){
            System.out.println("underflow occour");
        }else{
            f=f+1;
        }
    }

    void display() {
        System.out.println("Items are.........");
        for(int j=f;j<=r;j++){
            System.out.println(arr[j]);
        }
    }
}
public class Lec9_queue_using_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        queue s = new queue();
        int l, d;
        do {
            System.out.println("Press 1 for enqueue");
            System.out.println("Press 2 for dequeue");
            System.out.println("Press 3 for display");
            System.out.println("Enter your choice");
            d = sc.nextInt();
            switch (d) {
                case 1:
                    s.enqueue(sc);
                    break;
                case 2:
                    s.dequeue();
                    break;
                case 3:
                    s.display();
                    break;
            }
            System.out.println("Enter 0 go back to main menu");

            System.out.println("Enter any key for exit other than 0");
            l = sc.nextInt();
        } while (l == 0);
        System.out.println("Exit successfully");
    }
}
