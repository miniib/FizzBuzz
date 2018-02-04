function doFizzBuzz(num1, num2){
	    var fizz;
	    var buzz;
	for(var i = 1; i < 101; i++){
		fizz = (i%num1==0);
		buzz = (i%num2==0);
		if(fizz && buzz){
			console.log("FizzBuzz");
		}
		else if(fizz){
			console.log("Fizz");
		}
		else if(buzz){
			console.log("Buzz");
		}
		else {
			console.log(i);
		}
	}
}

doFizzBuzz(3, 5);
