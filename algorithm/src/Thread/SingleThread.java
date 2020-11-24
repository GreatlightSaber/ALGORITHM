package Thread;

public class SingleThread implements Runnable{

	private int seq;
	
	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	@Override
	public void run() {
		System.out.println("seq -> " + seq);
	}
	
}
