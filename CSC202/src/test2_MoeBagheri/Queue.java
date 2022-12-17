package test2_MoeBagheri;

public class Queue {

	private int numElements;


	public Queue() {
		// TODO Auto-generated constructor stub
	}

	
	public <T> void enqueue(T element)
	// Adds element to the rear of this queue.
	{
	LLNode<T> newNode = new LLNode<T>(element);

	Object rear = null;
	if (rear == null) {
	rear = newNode;
	((LLNode<T>) rear).setLink(newNode);
	}
	else {
	LLNode<T> start = ((LLNode<T>) rear).getLink();
	((LLNode<T>) rear).setLink(newNode);
	rear = newNode;
	((LLNode<T>) rear).setLink(start);
	}
	
	numElements++;
	/*
	if (rear == null)
	rear = newNode;
	else
	rear.setLink(newNode);
	rear = newNode;
	numElements++;
	*/
	}
	
	
}
