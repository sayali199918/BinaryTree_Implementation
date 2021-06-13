
public class Runner {

	public static void main(String[] args) {
		//Node root=null;
		//System.out.println("Tree is Empty");
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
		//root.height=new Node(10);
		
		Tree_Traversal t1=new Tree_Traversal();
		System.out.print("Inorder Traversal:");
		t1.inorder(root);
		System.out.println("-------------");
		System.out.print("Preorder Traversal: ");
		t1.preorder(root);
		System.out.println("-------------");
		System.out.print("Postorder Traversal: ");
		t1.postorder(root);
		//System.out.print("Height of Binary Tree: ");
		//t1.height(root);
		
		
		
	}

}
