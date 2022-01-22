import java.util.Scanner;

public class Lec13_bt_and_order_traversal {
    static Node create() {
        Node root = null;
        Scanner sc = new Scanner(System.in);
        int data;
        System.out.println("Enter value");
        data = sc.nextInt();
        Node new_node = new Node(data);
        root = new_node;
        if (data == -1) {
            return null;
        }
        System.out.println("Enter left child of" + root.data);
        root.left = create();
        System.out.println("Enter right child of" + root.data);
        root.right = create();
        return root;
    }

    static void inorder(Node root) {
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    static void postorder(Node root) {
        postorder(root.left);

        postorder(root.right);
        System.out.println(root.data);
    }

    static void preorder(Node root) {
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]) {
        Node root = create();
        preorder(root);
        inorder(root);
        postorder(root);

    }

}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;

    }
}
