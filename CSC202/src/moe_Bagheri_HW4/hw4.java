

package moe_Bagheri_HW4;

import java.util.ArrayList;
import java.util.Scanner;


class hw4 {
	
	
	
	public static void main(String [] args) {
		
		BinaryTree bt = new BinaryTree("data.txt");
		System.out.println("The BT tree has been built.");
		System.out.println("Traverse? (1: preorder, 2: inorder, 3: postorder)");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		ArrayList nodes = null;
		if(choice == 1) {
			nodes = bt.preOrder();
			System.out.println("Preorder: " + nodes);
		}
		if(choice == 2) {
			nodes = bt.inOrder();
			System.out.println("Inorder: " + nodes);
		}
		if(choice == 3) {
			nodes = bt.postOrder();
			System.out.println("Postorder: " + nodes);
		}

		BinarySearchTree bst = new BinarySearchTree();
		for(int i=0;i<nodes.size();i++) {
			bst.add(nodes.get(i));
		}
		
		System.out.println("Given the traversal above, a BST has been built.");
		
		ArrayList bstNodes = null;
		if(choice == 1) {
			bstNodes = bst.preOrder();
			System.out.println("Preorder: " + bstNodes);
		}
		if(choice == 2) {
			bstNodes = bst.inOrder();
			System.out.println("Inorder: " + bstNodes);
		}
		if(choice == 3) {
			bstNodes = bst.postOrder();
			System.out.println("Postorder: " + bstNodes);
		}

	}
}

