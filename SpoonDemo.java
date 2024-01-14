import java.lang.Thread;
class Spoon{
	boolean t=true;
	String Handler1,Handler2;
	synchronized void sharingspoon(String Handler1,String Handler2){
		
		this.Handler1=Handler1;
		this.Handler2=Handler2;
		
		while(t){
			notify();
			System.out.println(Handler1 + " is eating "+ Handler2 +"is waiting"); 
			try{
				wait();
			}
			catch(InterruptedException ie){
				System.out.println("InterruptedException ");
			}
			
		}
	}

}
class Father implements Runnable{
	Spoon s;
	Father(Spoon s){
		this.s=s;
		new Thread(this,"Father").start();
	}
	public void run(){
		
		s.sharingspoon("Father","Son");
		
	}	
}
class Son implements Runnable{
	Spoon s;
	Son(Spoon s){
		this.s=s;
		new Thread(this,"Son").start();
	}
	public void run(){
		
		s.sharingspoon("Son","Father");
		
	}

}
class SpoonDemo{
	public static void main(String args[]){
		Spoon sp = new Spoon();
		new Father(sp);
		new Son(sp);
	}
}





 