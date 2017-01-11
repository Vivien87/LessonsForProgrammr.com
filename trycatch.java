import java.util.Scanner; 
 /*
 Given you have a class AutoFactory with two static methods called shutdown and reset.
Neither method has any parameters. The shutdown method may throw a ProductionInProgressException. 

Write some code that invokes the shutdown method. If a ProductionInProgressException is thrown, your code should then invoke the reset method.
 */
 	class ProductionInProgressException extends Exception { 
	  
 	} 
 class AutoFactory { 
  int state; 
  boolean ishutdowned=false; 
  boolean isReset=false; 
 	 void shutdown() throws ProductionInProgressException { 
	ishutdowned=true; 
	if(state==1) 
	throw new ProductionInProgressException(); 
	 
	} 
 	 void reset() { 
	isReset=true; 
	 
	} 
  
 	public static void main(String [] args) { 
	 
	Scanner scanner =new Scanner(System.in); 
	AutoFactory autofactory=new AutoFactory(); 
	System.out.println("Enter the number:"); 
	 
	autofactory.state=scanner.nextInt(); 
	   ///{ 
		//write your code here 
		//start 
try 
{ 
autofactory.shutdown(); 
} 
catch (ProductionInProgressException e ) 
{ 
autofactory.reset(); 
}
 
		//end 
	   ///}  
	System.out.println("is shutdown:"+autofactory.ishutdowned);  	 
	System.out.println("is reset:"+autofactory.isReset);  	 
  
 } 
  
  
 } 
