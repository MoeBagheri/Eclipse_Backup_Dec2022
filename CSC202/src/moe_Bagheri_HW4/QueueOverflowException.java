package moe_Bagheri_HW4;

public class QueueOverflowException extends RuntimeException {
	public QueueOverflowException() {
		super();
	}

	public QueueOverflowException(String message) {
		super(message);
	}
}