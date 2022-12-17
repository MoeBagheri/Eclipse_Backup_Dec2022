package Moe_Bagheri_HW5;


public interface QueueInterface<T> {
		void enqueue(T element) throws QueueOverflowException;
		char dequeue() throws QueueOverflowException, Exception;
		boolean isFull();
		boolean isEmpty();
		int size();
		void enqueue(char ch);
		char dequeue1() throws Exception;
	}


