

/* Develop a Program to implement thread using Thread class.
*/

class NeW_Threadd extends Thread{
	
	public void run() {
		for (int i=0;i<10;i++) {
			if(i%2==0) {
				System.out.println("======================");
				System.out.println("NEWTHREAD1 is created");}}}}
public class ThreadClassDemo {

	public static void main(String[] args) {
		
		NeW_Threadd n = new NeW_Threadd();
		n.start();
		for (int i=0; i<10;i++) {
			if (i%2==0) {
				System.out.println("======__________======");
				System.out.println("Main Thread1 is created");
				}}}}
					