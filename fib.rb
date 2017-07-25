#!/usr/bin/ruby
 t1,t2,n=gets.chomp.split().map { |e| e.to_i }
  i=3
while i<=n do 
   c=t1+t2*t2 
    t1=t2
    t2=c
   i+=1 
end

  print c
