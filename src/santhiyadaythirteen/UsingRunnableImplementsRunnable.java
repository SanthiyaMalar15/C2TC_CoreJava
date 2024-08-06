package santhiyadaythirteen;

public class UsingRunnableImplementsRunnable {
	Thread thread;
    int high, low;
    String msg;

    public UsingRunnableImplementsRunnable(int low, int high, String msg) {
        this.high = high;
        this.low = low;
        this.msg = msg;
        thread = new Thread("Child Thread");
        thread.start();
    }

    
    public void run() {
        for (int i = low; i <= high; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println(msg + i);
        }
    }

    public static void main(String[] args) {
        new UsingRunnableImplementsRunnable(1, 5, "Count: ");
    }
}

	 
	


