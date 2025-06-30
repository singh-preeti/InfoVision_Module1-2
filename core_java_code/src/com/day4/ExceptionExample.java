package com.day4;
// Exception object = name,description,line number

public class ExceptionExample {

	public static void main(String[] args) throws Exception {
//		try {
//		System.out.println(100);
//		System.out.println(200);
//		System.out.println(300/0);
//		System.out.println(400);
//		System.out.println(500);
//		}
//		catch(ArithmeticException ex) {
//			System.exit(0);
//		}
//		catch(NullPointerException ex1) {
//			System.out.println(ex1);
//		}
//		finally {
//			System.out.println("Release the resources!");
//		}
		
		 try
		    {
		        System.out.println (10 / 0);
		    }
		    catch (ArithmeticException ae)
		    {
		        System.out.println ("getMessage  method output");
		        System.out.println (ae.getMessage ());
		        System.out.println ("toString method output");
		        System.out.println (ae.toString ());
		        System.out.println ("printStackTrace() method output");
		        ae.printStackTrace ();
		        System.out.println ("JVM default output");
		        throw ae;
		        //by using above statement we are just re-throwing the caught exception this 
		        //exception is caught by JVM default handler and prints full exception messages 
		        //along with thread name
		    }
	}
}
