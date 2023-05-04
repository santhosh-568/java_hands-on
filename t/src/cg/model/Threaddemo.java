package cg.model;

public class Threaddemo extends Thread {
	public void run() {
		System.out.println("running");
	}
		
		public static void main(String args[]) {
			Threaddemo t1=new Threaddemo();	
			
			t1.start();
			t1.start();
		}
	

}
