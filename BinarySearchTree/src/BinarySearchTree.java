public class BinarySearchTree {
	Node root = null;

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(50);
		bst.add(25);
		bst.add(30);
		bst.add(12);
		bst.add(60);
		bst.add(55);
		bst.add(75);
		bst.inOrder(bst.root);
	}

	void add(int d) {
		Node newnode = new Node(d);
		if (root == null) {
			root = newnode;
			System.out.print(root.data + "\t");
		} else {
			Node parent = root;
			while (parent != null) {
				if (parent.data > newnode.data) {
					parent = parent.left;
				} else {
					parent = parent.right;
				}
			}
			parent = newnode;
			System.out.print(parent.data + "\t");
		}
	}

	public void inOrder(Node parent) {
		if(parent!=null){
			
			int i=0;
			System.out.println(i++);
			
			
			inOrder(parent.left);
			System.out.print(parent.data + "\t");
			inOrder(parent.right);
		}
	}
}
