package santhiyadayfourteen;

public class Producer<Q> {
	Q obj;

	public Producer(Q obj) {

		this.obj = obj;
		start();
	}

	private void start() {
		// TODO Auto-generated method stub
		
	}

	public void run() {
		int i = 0;
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println(e);
			}
			i++;
		}
	}

	public void join() {
		// TODO Auto-generated method stub
		
	}

}
