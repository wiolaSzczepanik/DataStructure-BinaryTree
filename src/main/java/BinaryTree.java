public class BinaryTree {
    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public void insert(int value){
        if(value<root.value){
            if(root.left!=null){
                insert(value);
            } else{
                System.out.println("Inserted "+ value + " to left of " + root.value);
                root.left = new Node(value);
            }
        }if(value>root.value){
            if(root.right !=null){
                insert(value);
            } else{
                System.out.println("Inserted "+ value + " to left of " + root.value);
                root.right = new Node(value);
            }
        }
    }
}
