
/*  Develop a Program to implement thread using Thread class and yield()
  */

class Threadd3 extends Thread{
	public void run() {
		for(int i= 1;i<5;i++) {
			Thread.yield();
		
			System.out.println("hey this is Thread 1");
		}
	}
}
public class Threads_YieldMethod {

	public static void main(String[] args) {
		Threadd3 t3= new Threadd3();
		t3.start();
		for(int i= 1;i<5;i++) {
			System.out.println("hellow This is Main thread");
		}

	}

}
