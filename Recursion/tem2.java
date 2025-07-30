
// ** Height of a binary tree ** //

class Node{

    int data;
    Node left,right;

    Node(int data){
        this.data=data;
        left=right=null;
    }

}

public class  tem2 {

    public static int height(Node root){

        if(root==null){
            return -1;  // Base case
        }

        int right = height(root.right);
        int left = height(root.left);

        return 1+Math.max(right,left);

    }


    public static void main(String[] args) {
        
       
        Node root = new Node(2);
        root.left = new Node(8);
        root.right = new Node(12);
        root.right.right = new Node(15);

        System.out.println(height(root));
    }
    


    
}
