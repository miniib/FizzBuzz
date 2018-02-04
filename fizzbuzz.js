function doFuzzBuzz(num1, num2){
	    var fizz;
	    var buzz;
	for(var i = 1; i < 101; i++){
		fizz = (i%num1==0);
		buzz = (i%num2==0);
		if(fizz && buzz){
			console.log("fizzbuzz");
		}
		else if(fizz){
			console.log("fizz");
		}
		else if(buzz){
			console.log("buzz");
		}
		else {
			console.log(i);
		}
	}
}

doFuzzBuzz(3, 5);
