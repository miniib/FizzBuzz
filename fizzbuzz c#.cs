using System.Console;

class FuzzBuzz 
{
	static void doFuzzBuzz(int num1, int num2){
		bool fizz;
		bool buzz;
		
		for (int i = 1; i <= 100; i++){
			fizz = (i%num1==0);
			buzz = (i%num2==0);
			
			if(fizz && buzz)
    			WriteLine("fizzbuzz");
    		
			else if(fizz)
    			WriteLine("fizz");
    		
			else if(buzz)
    			WriteLine("buzz");
    		
			else 
    			WriteLine(i)
		}
	}
	static void Main() {
		doFuzzBuzz(3,5);
	}
}