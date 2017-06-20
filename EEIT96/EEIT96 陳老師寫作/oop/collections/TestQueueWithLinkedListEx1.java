package tw.leonchen.myproject.oop.collections;

import java.util.LinkedList;

public class TestQueueWithLinkedListEx1 {

	private LinkedList queue;

	public void processStoreQueue() {
		queue = new LinkedList();
		queue.offer("signal");
		queue.offer("thunder");
	}

	public void processRetrieveQueue() {
//		for(int i=0;i<queue.size();i++){
//			String data = (String)queue.poll();
//			System.out.println("data:" + data);
//		}
		
		while (queue.peek() != null) {
			String data = (String)queue.poll();
			System.out.println("data:" + data);
		}
	}

	public static void main(String[] args) {
		TestQueueWithLinkedListEx1 test1 = new TestQueueWithLinkedListEx1();
		test1.processStoreQueue();
		test1.processRetrieveQueue();
	}

}
