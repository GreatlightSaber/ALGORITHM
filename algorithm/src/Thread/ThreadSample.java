package Thread;

public class ThreadSample {

	public static void main(String[] args) {
		
		ThreadPool threadPool = new ThreadPool();
		
		for(int i = 0 ; i < 30 ; i++) {
			SingleThread singleThread = new SingleThread();
			singleThread.setSeq(i);
			Thread thread = new Thread(singleThread);
			
			threadPool.addTask(thread);
		}
		threadPool.start();
	}
	
}
