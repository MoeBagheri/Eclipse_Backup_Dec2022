
package Moe_Bagheri_HW6;


public class MyLinkedList<T> {
	private LLNode<T> head;
	private LLNode<T> tail;
	private LLNode<T> cursor;
	private int size;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
		this.cursor = null;
	}

	public void add(T data) {
		if(tail == null) {
			head = new LLNode(data);
			tail = head;
		}
		else {
			tail.setLink(new LLNode(data));
			tail = tail.getLink();
		}
		size++;
	}
	
	public boolean remove(T data) {
		if(head.getInfo().equals(data)) {
			LLNode<T> newHead = new LLNode<T>(data);
			newHead.setLink(head);
			head = newHead;
			size--;
			return true;
		}
		
		LLNode runner = head;
		while(runner.getLink() != null) {
			if(runner.getLink().getInfo().equals(data)) {
				runner.setLink(runner.getLink().getLink());
				size--;
				return true;
			}
			runner = runner.getLink();
		}
		return false;
	}
	
	public int size() {
		return size;
	}
	
	public T front() {
		return head.getInfo();
	}
	
	public boolean contains(T data) {
		LLNode runner = head;
		while(runner != null) {
			if(runner.getInfo().equals(data)) {
				return true;
			}
		}
		return false;
	}
	
	public void dumpList() {
		LLNode<T> runner = head;
		while(runner != null) {
			System.out.print("[" + runner.getInfo() + "], ");
			runner = runner.getLink();
		}
		System.out.println();
	}
	
	public void begin() {
		cursor = head;
	}
	public T next() {
		T data = cursor.getInfo();
		cursor = cursor.getLink();
		return data;
	}
	public boolean end() {
		return cursor == null;
	}
	
	
	
}
