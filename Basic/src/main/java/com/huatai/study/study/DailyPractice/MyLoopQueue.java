package com.huatai.study.study.DailyPractice;

public class MyLoopQueue {
	// 队列数组
	private int[] array;

	// 数组头
	private int front;

	// 队列尾部
	private int rear;

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		MyLoopQueue m = new MyLoopQueue(6);
		m.enQueue(3);
		m.enQueue(5);
		m.enQueue(6);
		m.enQueue(8);
		m.enQueue(1);

		m.deQueue();
		m.deQueue();
		m.deQueue();

		m.output();

		m.enQueue(2);
		m.enQueue(4);
		m.enQueue(9);

		m.output();
	}

	public MyLoopQueue(int cap) {
		this.array = new int[cap];
	}

	public void enQueue(int ele) throws Exception {
		// 队列尾部加1等于队列首，追上队列，就满
		if ((rear + 1) % array.length == front) {
			throw new Exception("队列满");
		}

		array[rear] = ele;

		rear = (rear + 1) % array.length;

	}

	public int deQueue() throws Exception {

		if (rear == front) {
			throw new Exception("队列满");
		}

		// 队首从0开始，出对一次，往后移动一次
		int deQueueEle = array[front];

		front = (front + 1) % array.length;

		return deQueueEle;
	}

	public void output() {

		for (int i = front; i != rear; i = (i + 1) % array.length) {

			System.out.println(array[i]);
		}
	}

}
