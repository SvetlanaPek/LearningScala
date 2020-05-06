// WHILE LOOPS

// While loops repeat code while some condition it true

var x = 0

while(x < 5){
	println(s"x is currently $x")
	println(s"x is still less than 5, adding 1 to x\n")
	x += 1
}


import util.control.Breaks._

var y = 0

while(y < 10){
	println(s"y is currently $y")
	println(s"y is still less than 10, add 1 to y\n")
	y += 1
	if(y == 3) break
}


