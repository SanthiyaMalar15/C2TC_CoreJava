package santhiyadayfourteen;

public class Consumer<Q> {
	Q obj; 

	public Consumer(Q obj) {
		this.obj = obj;
		start();
	}

	private void start() {
		// TODO Auto-generated method stub
		
	}

	public void run() {
			while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
	}

	public void join() {
		// TODO Auto-generated method stub
		
	}
}



