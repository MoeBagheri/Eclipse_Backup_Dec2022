
package Moe_Bagheri_HW5;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class BinaryTree<T> extends BinarySearchTree<T> {
	
	public BinaryTree() {
		root = null;
	}
	
	public BinaryTree(String filename) {
		
		try {
			ArrayList<BSTNode<T>> nodes = new ArrayList<BSTNode<T>>();
			
			// nodes = [null, null, null, null, null, <5>, null, null, null, null]
			
			Scanner file_in = new Scanner(new File(filename));
			while(file_in.hasNextLine()) {
				String line = file_in.nextLine();
				System.out.println(line);
				
				// split into an array of strings
				String[] lineParts = line.split(", ");
				
				// create an integer array of the same size
				Integer[] numbers = new Integer[lineParts.length];
				
				// go through each of the numbers on this line (eg: 5, 9)
				for(int i=0;i<lineParts.length;i++) {
					// parse the next number into the array (5, etc)
					numbers[i] = Integer.parseInt(lineParts[i]);
					// if we don't have that index in our arraylist, keep adding until we do
					while(numbers[i] >= nodes.size()) {
						nodes.add(null);
					}
				}
				
				// get the node for "X" from the numbers array at "X"
				// root is id# of numbers[0] (first number in line, eg 5)
				BSTNode<T> root = nodes.get(numbers[0]);
				if(root == null) {
					root = new BSTNode<T>((T)numbers[0]); // create new node holding the value (5)
					nodes.set(numbers[0],root); // put it in the array
				}
				
				// left node is null if length is only 1 (shouldn't happen)
				BSTNode<T> left = null;
				if(numbers.length > 1) { // more than 1 node means we have a left
					left = nodes.get(numbers[1]); // get numbers[1], eg 9
					if(left == null) {
						left = new BSTNode<T>((T)numbers[1]);
						nodes.set(numbers[1], left);
					}
				}

				// same with right
				BSTNode<T> right = null;
				if(numbers.length > 2) { // more than 1 node means we have a left
					right = nodes.get(numbers[2]); // get numbers[1], eg 9
					if(right == null) {
						right = new BSTNode<T>((T)numbers[2]);
						nodes.set(numbers[2], right);
					}
				}
				
				// set left and right
				root.setLeft(left);
				root.setRight(right);
			}
			
			// for every node we have, consider it as a possible top
			// any node that is the left or right of another can not be the top
			BSTNode<T> top = null;
			for(int i=0;i<nodes.size();i++) {
				boolean couldBeTop = true;
				for(int j=0;j<nodes.size();j++) {
					if(i != j) {
						// if this node is the left or right of another node
						if(nodes.get(i) == nodes.get(j).getLeft() || nodes.get(i) == nodes.get(j).getRight()) {
							couldBeTop = false;
						}
					}
				}
				if(couldBeTop == true) {
					System.out.println("Node " + i + " might be the top!");
					top = nodes.get(i);
				}
			}
			
			root = top;
			
		}
		catch(FileNotFoundException ex) {
			System.out.println("FILE NOT FOUND!");
		}
		
	}
	
	public ArrayList inOrder1() {
		ArrayList q = new ArrayList();
		this.inOrder1(root, q);
		return q;
	}
	
	public void inOrder1(BSTNode node, ArrayList q) {
		if(node == null) {
			return;
		}
		
		inOrder1(node.getLeft(), q);
		q.add(node.getInfo());
		inOrder1(node.getRight(), q);
	}
	
	public ArrayList preOrder1() {
		ArrayList q = new ArrayList();
		this.preOrder1(root, q);
		return q;
	}
	
	public void preOrder1(BSTNode node, ArrayList q) {
		if(node == null) {
			return;
		}
		
		q.add(node.getInfo());
		preOrder1(node.getLeft(), q);
		preOrder1(node.getRight(), q);
	}
	
	public ArrayList postOrder1() {
		ArrayList q = new ArrayList();
		this.postOrder1(root, q);
		return q;
	}
	
	public void postOrder1(BSTNode node, ArrayList q) {
		if(node == null) {
			return;
		}
		
		postOrder1(node.getLeft(), q);
		postOrder1(node.getRight(), q);
		q.add(node.getInfo());	
	}
	
	public ArrayList levelOrder() {
		ArrayList q = new ArrayList();
		if(root == null) {
			return q;
		}
		Queue<BSTNode<T>> processing = new LinkedList();
		processing.add(root);
		while(processing.size() > 0) {
			BSTNode<T> working = processing.remove();
			q.add(working.getInfo());
			if(working.getLeft() != null) {
				processing.add(working.getLeft());
			}
			if(working.getRight() != null) {
				processing.add(working.getRight());
			}
		}
		return q;
	}
	
	private BSTNode<T> getNodeRec(T target, BSTNode<T> node) 
	// Returns the BSTNode if it's in the tree, otherwise returns null
	{
		
		if (node == null)
			return null; // target is not found
		else if (comp.compare(target, node.getInfo()) < 0)
			if(node.getLeft() == null)
				return node;
			else
				return getNodeRec(target, node.getLeft()); // Search left subtree
		else if (comp.compare(target, node.getInfo()) > 0)
			if(node.getRight() == null)
				return node;
			else
				return getNodeRec(target, node.getRight()); // Search right subtree
		else
			return node; // target is found
	}
	
	
	public BSTNode getNode(T target) 
	// Returns the BSTNode if it's in the tree, otherwise returns null
	{
		return getNodeRec(target, root);
	}
	
	public boolean add(T element)
	// Adds element to this BST. The tree retains its BST property.
	{
		//root = recAdd(element, root);
		BSTNode<T> parent = getNode(element);
		if(parent == null)
			root = new BSTNode<T>(element);		
		else if (comp.compare(element, parent.getInfo()) < 0)
			parent.setLeft(new BSTNode<T>(element));
		else if (comp.compare(element, parent.getInfo()) > 0)
			parent.setRight(new BSTNode<T>(element));
		else {
			System.out.println("CANT PALCE " + element + " IN " + parent.getInfo());
		}
			
		return true;
		

	}
	
	
}