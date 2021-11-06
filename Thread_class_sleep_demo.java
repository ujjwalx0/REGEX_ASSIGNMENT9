
/* Develop a Program to implement thread using Thread class and sleep()*/
class Threadd2 extends Thread{
	public void run() {
		System.out.println("Thread Started..........!");
		for(int i =0;i<5;i++) {
			System.out.println("Hellow..!");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Thread Ended.........!!");
	}
}
public class Thread_class_sleep_demo {

	public static void main(String[] args) {
		Threadd2 t2= new  Threadd2();
		t2.start();
      
	}

}
