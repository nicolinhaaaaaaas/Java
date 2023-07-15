public class MulthithreadThing implements Runnable{

	private int threadNumber;
	public MulthithreadThing (int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	@Override
	public void run() {
		for(int i =1 ; i <=5 ; i++) {
			System.out.println(i+ " da thread: "+threadNumber);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class Multithreading {

	public static void main(String[] args) {
		
		for(int i=0 ; i<=3 ; i++) {
			MulthithreadThing myThing = new MulthithreadThing(i);
			Thread thread = new Thread(myThing);
			thread.start();
			
			//thread.join();       serve para que uma thread espera a outra terminar para começar
			//thread.isAlive();    retorna um true ou falso dizendo se a thread ainda ta rodando
		}
	}
}
