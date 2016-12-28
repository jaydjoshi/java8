package java8.lambda.example2;

public class Java7RunnableDemo {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10;i++){
					System.out.println("Tick tock count "+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		t.start();
	}

}
