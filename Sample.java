package hackerrank;

import java.util.concurrent.TimeUnit;

//1
//public class Sample {
//
//	 public static void main(String[] args){
//	        int i = 010;
//	        int j = 07;
//	        System.out.println(i);
//	        System.out.println(j);
//	 }
//}
//2
//interface BaseI { void method(); }
//
//class BaseC
//{
//   public void method()
//   {
//      System.out.println("Inside BaseC::method");
//   }
//}
//
//public class Sample extends BaseC implements BaseI
//{
//   public static void main(String []s)
//   {
//      (new Sample()).method();
//   }
//}
//3
class SampleDemo implements Runnable {

	   private Thread t;
	   private String threadName;
	   
	   SampleDemo (String threadName){
	       this.threadName = threadName;
	   }

	   public void run() 
	   {
	       while (true)
	            System.out.print(threadName);
	   }

	   public void start ()
	   {
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         t.start ();
	      }
	   }
	}

public class Sample {

	   public static void main(String args[]) {

	      SampleDemo A = new SampleDemo( "A");
	      SampleDemo B = new SampleDemo( "B");

	      B.start();
	      A.start();
	   }
	}
