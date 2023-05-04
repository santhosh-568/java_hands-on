package cg.model;

public class Testingthread extends Thread {
	public void run() {
		System.out.println("the thread is running");
				for(int i=0;i<5;i++) {
			try {
				Thread.sleep(200);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
			
		}
	}
	public static void main(String args[]) {
		Testingthread t1=new Testingthread();
		Testingthread t2=new Testingthread();
		Testingthread t3=new Testingthread();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
