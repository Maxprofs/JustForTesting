package tw.joe.myproject;

import java.util.LinkedList;

interface ActionQueue {
	public void action();
}

public class QueueAndLinkedListTest {
	
	private LinkedList queue;

	@SuppressWarnings({ "unchecked"})
	private void processStoreQueue() {
		queue = new LinkedList();

		queue.add(new ActionQueue() {

			@Override
			public void action() {
				int num = (int) (Math.random() * 10) + 1;
				System.out.println("num= " + num);
			}
		});
	}

	private void processRetrieveQueue() {
		while (queue.peek() != null) {
			ActionQueue myAction = (ActionQueue) queue.poll();
			myAction.action();
		}
	}

	public static void main(String[] args) {

		QueueAndLinkedListTest test2 = new QueueAndLinkedListTest();
		test2.processStoreQueue();
		test2.processRetrieveQueue();
	}

}
