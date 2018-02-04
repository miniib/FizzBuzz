(1..100).each do |i|
    fizz = (i%3==0)
    buzz = (i%5==0)
    if fizz&&buzz
    puts "fizzbuzz"
    elsif fizz
    puts "fizz"
    elsif buzz
    puts "buzz"
    else
    puts i
    end
end
