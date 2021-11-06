
/* Develop a Program to get and set name of thread.*/

class Threadd1 extends Thread{
	public void run() {
		//System.out.println("hey this is thread1");
	}
}
public class ThreadNameDemo {

	public static void main(String[] args) {
		Threadd1 t1=new Threadd1();
		t1.start();
		System.out.println("thread name by default:");
		System.out.println(t1.getName()+"\n");
		System.out.println("========================"+"\n");
		System.out.println("after setting Thread name:");
		t1.setName("THREADD1");
		System.out.println(t1.getName());

	}

}
