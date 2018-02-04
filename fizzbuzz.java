public class FizzBuzz {
	
	public static void doFizzBuzz(int num1, int num2){
	    boolean fizz;
	    boolean buzz;
		for(int i=1; i<101; i++){
    		fizz = (i%num1==0);
    		buzz = (i%num2==0);
    		if(fizz && buzz){
    			System.out.println("FizzBuzz");
    		}
    		else if(fizz){
    			System.out.println("Fizz");
    		}
    		else if(buzz){
    			System.out.println("Buzz");
    		}
    		else {
    			System.out.println(i);
    		}
		}
	}
    public static void main(String args[]) {
        doFizzBuzz(3, 5);
    }
}