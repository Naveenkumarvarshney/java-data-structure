import java.util.Scanner;
public class Lec12_bt_creation {
    static Node create(){
        int data; 
        Scanner scan1 = new Scanner(System.in);
        Node root=null;
        System.out.println("Enter value");
        data=scan1.nextInt();
        if (data==-1)
            return null;
        

        Node new_node=new Node(data);
        root=new_node;
        System.out.println("Enter left child of"+root.data);
          root.left=create();
          System.out.println("Enter right child of"+root.data);
          root.right=create();
        return root;
    }
    public static void main(String args[]){
        Node root = create();
    }
}
 
class Node {
    Node left,right;
    int data;
    public Node(int data){
        this.data=data;
        left=null;
        right = null;
      
    }
}