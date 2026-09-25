package string;

public class DemoSyncNonSync {

	public static void main(String[] args) throws InterruptedException {
		//StringBuffer ----> synchronized
		// StringBuilder ---> non-synchronized
		
		// StringBuffer object ---> synchronized 
		StringBuffer Buffer = new StringBuffer();
		
		// StringBuilder object ---> non-sychronized
		StringBuilder Builder = new StringBuilder();
		
		// this is first thread add letter A 1000 times
		Thread th1 = new Thread(()->{
			
			for(int i = 1 ; i<=1000 ;i++) {
				Buffer.append("A"); // synchronized operation
				
				Builder.append("A"); // non synchronized operation
			}
			
		});
		
		// Second thread for B
		Thread th2 = new Thread(() ->{
			
			for(int i = 1 ; i<=1000 ; i++) {
				
				Buffer.append("B");  // synchronized operation
				
				Builder.append("B"); // non synchronized operation
			}
		});
		
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
		
		System.out.println("StringBuffer length : "+Buffer.length());
		System.out.println("StringBuilder length : "+Builder.length());

	}

}
