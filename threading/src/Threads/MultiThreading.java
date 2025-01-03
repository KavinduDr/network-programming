package Threads;

public class MultiThreading extends Thread {
	
	private int thread_number;
	
	public MultiThreading(int t) {
		this.thread_number = t;
	}

	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Thread " + thread_number + " Value " + i);
			
//			if(thread_number == 2) {
//				throw new RuntimeException();
//			}
			
			try {
				Thread.sleep(1000); //in ms
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
