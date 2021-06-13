
public class Tree_Traversal {
	Node root;
	public void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.println(root.key+" ");
			inorder(root.right);
		}
	}
	public void preorder(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.key+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	public void postorder(Node root)
	{
		if(root!=null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.key+" ");
		}
	}
	/*public int height(Node root)
	{
		if (root==null)
			return 0;
		else
			return Math.max(height(root.left),height(root.right))+1;
	}*/
	
	void inorder() {
		inorder(root);
	}
	void preorder() {
		preorder(root);
	}
	void postorder() {
		postorder(root);
	}
	/*int height() {
		return height(root);
	}*/
	

}
