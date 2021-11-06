
/* Develop a Program to implement thread using Runnable interface.*/

class NewThread implements Runnable{
	
	public void run() {
		
		for (int i=0; i<10;i++) {
			if (i%2==0) {
				System.out.println("NEWTHREAD is Created");
				System.out.println("=====================");	}}}}

public class ThreadUsingRunnable {

	public static void main(String[] args) {
		NewThread nt = new NewThread();
		Thread t = new Thread(nt);
		t.start();
		for (int i=0; i<10;i++) {
			if (i%2==0) {
				System.out.println("Main Thread");
				System.out.println("============");}}}}
					
			
			
		
		


	