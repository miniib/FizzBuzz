public class FuzzBuzz {
	
	public static void doFuzzBuzz(int num1, int num2){
	    boolean fizz;
	    boolean buzz;
		for(int i=1; i<101; i++){
    		fizz = (i%num1==0);
    		buzz = (i%num2==0);
    		if(fizz && buzz){
    			System.out.println("fizzbuzz");
    		}
    		else if(fizz){
    			System.out.println("fizz");
    		}
    		else if(buzz){
    			System.out.println("buzz");
    		}
    		else {
    			System.out.println(i);
    		}
		}
	}
    public static void main(String args[]) {
        doFuzzBuzz(3, 5);
    }
}