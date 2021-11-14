package techno.JavaAssignment.LambdaExp;

public class LambdaExpMain {
	public static void main(String[] args) {
		Runnable runnable1=()->{
			for(int i=1;i>=10;i++) {
				System.out.println("1st thread");
			}
		};
		Runnable runnable2=()->{
			for(int i= 1;i>=10;i++) {
				System.out.println("1st thread");
			}
		};
		Thread thread=new Thread(runnable1);
		Thread thread1=new Thread(runnable2);
		thread.start();
		thread1.start();
		System.out.println(thread.getName());
		thread1.setName("Sandesh");
		System.out.println(thread1.getName());
	}

}
