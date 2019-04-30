package tuesday;

public class inclass {
	// written on the board 
	
	/*
	 * note: the base case is the first case that will stop the code 

	public static void print(int n) {
		if (n == 0) { // this is the stopper code that will find out when n is 0. It will just print nothing and end the code
			System.out.println();
		}
		
		else {
			System.out.println("*");
			print(n-1); // make sure you have something that eventually gets your else code (recursive case) to lead into the base case (if case)
		}
		
	}
	
	*/
	
	///*
	 // making a factorial 
	 public static int fact(int n) {
		 
		 // to make it a positive number 
		 if(n<0) {
			 return fact(-n);
		 }
		 
		 
		 
		 if (n ==0) {
			 return 1; 
		 }
		 
		 else {
			 return (fact(n-1) * n);
			 
		 }
	 }
	 
	 //*/
	
	

}
