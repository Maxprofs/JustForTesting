package tw.joe.myproject;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAndLinkedList {
	@SuppressWarnings("rawtypes")
	private Queue queue;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void executeStoreQueue() {
		queue = new LinkedList();
		queue.offer("signal");
		queue.offer("thunder");
	}

	public void executeRetrieveQueue() {
		while (queue.peek() != null) {
			String info = (String) queue.poll();
			System.out.println("Info: " + info);
		}
	}

	public static void main(String[] args) {
		QueueAndLinkedList processQueue = new QueueAndLinkedList();
		processQueue.executeStoreQueue();
		processQueue.executeRetrieveQueue();
	}

}
