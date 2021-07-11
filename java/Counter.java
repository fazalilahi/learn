public class Counter implements Runnable {

	private int limit;
	private boolean isEven;

	public Counter(int limit, boolean isEven) {
		this.limit = limit;
		this.isEven = isEven;
	}

	@Override
	public void run() {

		int first = isEven ? 0 : 1;
		String type = isEven ? "Even" : "Odd";

		try {
			for (int i = first; i <= limit; i += 2) {
				System.out.println(i + " (" + type + ")");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(type + " thread has been Interrupted");
		}
	}

	public static void main(String[] args) throws Exception {
		Thread odd = new Thread(new Counter(10, false));
		Thread even = new Thread(new Counter(10, true));
		even.setPriority(Thread.MAX_PRIORITY);
		odd.start();
		even.start();
	}
}