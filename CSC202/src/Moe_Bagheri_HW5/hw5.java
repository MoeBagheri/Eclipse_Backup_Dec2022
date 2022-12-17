

package Moe_Bagheri_HW5;

import java.util.ArrayList;
import java.util.Scanner;


class hw5 {
	
	
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		BinaryTree bt = new BinaryTree("data.txt");
		/*
		BinaryTree bt = new BinaryTree();
		int input = -1;
		while(input != 0) {
			System.out.println("Type a number or 0 to quit");
			input = sc.nextInt();
			if(input != 0) {
				bt.add(input);
			}
			
		}
		*/
		//System.out.println("Test here!!");
		
		System.out.println("The BT tree has been built.");
		System.out.println("Traverse? (1: preorder, 2: inorder, 3: postorder, 4: levelorder)");
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
		if(choice == 4) {
			nodes = bt.levelOrder();
			System.out.println("Levelorder: " + nodes);
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
		if(choice == 4) {
			bstNodes = bst.levelOrder();
			System.out.println("Levelorder: " + bstNodes);
		}

	}
}

