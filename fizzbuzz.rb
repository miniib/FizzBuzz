(1..100).each do |i|
    fizz = (i%3==0)
    buzz = (i%5==0)
    if fizz&&buzz
    puts "FizzBuzz"
    elsif fizz
    puts "Fizz"
    elsif buzz
    puts "Buzz"
    else
    puts i
    end
end
