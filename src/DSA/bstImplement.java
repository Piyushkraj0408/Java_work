package DSA; /******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.*;
class Node{
    int val;
    Node left,right;
    public Node(int val){
        this.val = val;
        this.left = this.right = null;
    }
}

class BSTNode{
    public static Node insert(Node root,int ele){
        if(root==null){
            return new Node(ele);
        }
        if(ele<root.val){
            root.left = insert(root.left,ele);
        }else if(ele>root.val){
            root.right = insert(root.right,ele);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.val);
            inorder(root.right);
        }
    }
    public static void preorder(Node root){
        if(root!=null){
            System.out.println(root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.val);
        }
    }
    public static Node findMin(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static Node deleteNode(Node root,int ele){
        if(root==null){
            System.out.println("Element not found");
            return root;
        }
        if(ele < root.val){
            root.left = deleteNode(root.left,ele);
        } else if(ele > root.val){
            root.right = deleteNode(root.right,ele);
        } else{
            if(root.left==null){
                root = root.right;
            } else if(root.right == null){
                root = root.left;
            } else if(root.left!=null && root.right != null){
                int min = findMin(root.right).val;
                root.val = min;
                root.right = deleteNode(root.right,min);
            }
        }
        return root;
    }
}
public class bstImplement
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op,x;
        Node root = null;
        while(true){
            System.out.println("1.Insert 2.Delete 3.Preorder Traversal 4.Inorder Traversal 5.exit");
            System.out.println("Enter your option");
            op = sc.nextInt();
            switch(op){
                case 1:System.out.println("Enter an element to be inserted : ");
                    x=sc.nextInt();
                    root = BSTNode.insert(root,x);
                    break;

                case 2:System.out.println("Enter the element to be Deleted :");
                    x=sc.nextInt();
                    root = BSTNode.deleteNode(root,x);
                    break;

                case 3:if(root == null) {
                    System.out.println("Binary Search Tree is empty.");
                } else {
                    System.out.println("Elements of the BST (pre-order traversal): ");
                    BSTNode.preorder(root);
                    System.out.println("\n");
                }
                    break;

                case 4:if(root == null) {
                    System.out.println("Binary Search Tree is empty.");
                } else {
                    System.out.println("Elements of the BST (In-order traversal): ");
                    BSTNode.inorder(root);
                    System.out.println("\n");
                }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}