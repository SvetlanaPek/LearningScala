val a = Array("banana", "apple", "orange")
for (e <- a) {
	val s = e.toUpperCase // capitilize
	println(s)
}

val new_a = for (e <- a) yield e.toUpperCase

val new_a2 = for (e <- a) yield {
	val s = e.toUpperCase
	s
}

for (i <- 0 until a.length) {
	println(s"$i is ${a(i)}")
}

// it must be e
for ((e, indx) <- a.zipWithIndex) {
	println(s"$indx is at position $e")
}

1 to 3 // is inclusive (1,2,3)

val names = Map("fname" -> "Robert",
				"lname" -> "Goren")

for ((k,v) <- names) println(s"$k is $v")

a.foreach(e => println(e.toUpperCase))

a.foreach { e =>
	val s = e.toUpperCase
	println(s)
}

1.to(10).foreach(((i) => println(i)))

val nums = List(1,2,3)
for (i <- nums) println(i)
nums.foreach(((i) => println(i)))

// a loop with guards (conditions)
for {
	i <- 1 to 10
	if i % 2 == 0
	if i != 4
} println(i) // 2,6,8,10

for { i <- 1 to 10 } yield i // is translated into
1.to(10).map(((i) => i))

for {
	i <- 1 to 10
	if i % 2 == 0
	if i != 4
} yield i


for (i <- 1 to 4; j <- 1 to 2) println(s"i = $i and j = $j")
for {
	i <- 1 to 4
	j <- 1 to 2
} println(s"i = $i and j = $j")

// Two-dimensional arrays

val two_darray = Array.ofDim[Int](2,2)
two_darray(0)(0) = 0
two_darray(0)(1) = 1
two_darray(1)(0) = 2
two_darray(1)(1) = 3



// ________________________________
import util.control.Breaks._

val searchMe = "peter piper picked a peck of pickled peppers"
var numPs = 0

for (i <- 0 until searchMe.length) {
	breakable {
		if (searchMe.charAt(i) != 'p') {
			break 
		} else {
			numPs += 1
		}
	}
}

println("Found " + numPs + " p's in the string.")
// ________________________________

// To implement a brek
breakable {
	for (x <- xs) {
		if (cond)
			break
	}
}

// To implement a continue
for (x <- xs) {
	breakable {
		if (cond)
			break
	}
}


var cmd = "stop"
def multiMatch(cmd: Any) = cmd match {
	case "start" | "run" | "go" => println("starting")
	case "stop" | "quit" | "exit" => println("stopping")
	case _ => println("doing nothing")
}

multiMatch(cmd)
multiMatch("run")


// Will return the first match
def multiMatch2(cmd: Any): String = cmd match {
	case "start" | "run" | "go" => "starting"
	case "stop" | "quit" | "exit" => "stopping"
	case (a, b) => s"got a tuple of $a and $b"
	case s: String => s"This is a string $s" 
	case _ => "doing nothing"
}

val lst1 = List(1,2,3,4)
val lst2 = 1 :: 2 :: Nil 


def multiply(list: List[Int]): Int = list match {
	case Nil => 1
	case n :: rest => n * multiply(rest)
}


val s = "Foo"
try {
	val i = s.toInt
} catch {
	case e: Exception => e.printStackTrace
}
