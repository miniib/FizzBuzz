using static System.Console;

class FuzzBuzz 
{
	static void doFizzBuzz(int num1, int num2){
		bool fizz;
		bool buzz;
		
		for (int i = 1; i <= 100; i++){
			fizz = (i%num1==0);
			buzz = (i%num2==0);
			
			if(fizz && buzz)
    			WriteLine("FizzBuzz");
    		
			else if(fizz)
    			WriteLine("Fizz");
    		
			else if(buzz)
    			WriteLine("Buzz");
    		
			else 
    			WriteLine(i);
		}
	}
	static void Main() {
		doFizzBuzz(3,5);
	}
}