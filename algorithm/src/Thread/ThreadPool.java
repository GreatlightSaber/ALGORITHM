package Thread;

import java.util.LinkedList;

public class ThreadPool {

	private int maxThreadCount = 5;
	private static int threadCount = 0;
	private LinkedList<Thread> queue = new LinkedList<>();
	
	// �ִ� ������ pool ���� ����
	public void setMaxThreadCount(int maxThreadCount) {
		this.maxThreadCount = maxThreadCount;
	}
	
	// �۾� ť �� ����
	public void addTask(Thread task) {
		queue.add(task);
	}
	
	public void start() {
		while(queue.size() > 0) {
			if(threadCount < maxThreadCount) {
				Thread t1 = new Thread(queue.get(0));
				t1.start();
				queue.remove(0);
				
				threadCount--;
			}else {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
