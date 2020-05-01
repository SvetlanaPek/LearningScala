val s1 = "Hello"
val s2: String = null
val s3 = "hello"

s1.toUpperCase == s3.toUpperCase
s1.equalsIgnoreCase(s3)

val multi_s = """I want
a three lines
String"""

"hello world".split(" ").foreach(println)
"milk, oranges, cheese, bread".split(",").map(_.trim)

"hello world, this is me".split("[is]+")
// Array[String] = Array(hello world, th, " ", " me")

println(s"""My name is $name and I am $age years old.
And on the 16th of May I'll be ${age+1} years old.""")

print(s"""Am I ${age} y.o.?
${age == 24}""")

case class Student(name: String, age: Int)
val lana = Student("Lana", 24)
println(s"${lana.name} is ${lana.score} y.o.")

scala> println(f"Pi value is equal to $pi%.4f")
// Pi value is equal to 3,1416

scala> println(s"Pi value is equal to ${pi}")
// Pi value is equal to 3.1415926535

val res = f"$name, do you know that Pi value is equal to $pi%.2f."

s"foo\nbar" == f"foo\nbar" // true
raw"foo\nbar" // foo\nbar

val upper = "hello, world".map(c => c.toUpper)
val upper = "hello, world".map(_.toUpper)

"hello, world".filter(_ != 'l').map(_.toUpper)

for (c <- "hello") println(c)

// the same
for (x <- "hello") yield x.toUpper
"hello".map(_.toUpper)

// iterate on each element without returning a result
"hello".foreach(println)


"hello".map{c => (c.toByte+1).toChar}
"hello".map(c => (c.toByte+1).toChar)
"HELLO".map(c => (c.toByte+32).toChar) // "hello"

// the first is a method, the second is a function 
def toLower(c: Char): Char = (c.toByte+32).toChar
val toLower = (c: Char) => (c.toByte+32).toChar

val s = "HELLO"
s.map(toLower)

for (c <- s) yield toLower(c)

"hello".getBytes // Array[Byte]
"hello".map(_.toByte) // scala.collection.immutable.IndexedSeq[Byte]

// Regexp

val numPattern = "[0-9]+".r
// or
import scala.util.matching.Regex
val numPattern = new Regex("[0-9]+")

val address = "18 Main Street 1"

val match1 = numPattern.findFirstIn(address)
val matches = numPattern.findAllIn(address) // return an iterator
matches.foreach(println)

val matches = numPattern.findAllIn(address).toArray // return an array (toList, toSeq, toVector)

val match_first = numPattern.findFirstIn(address2).getOrElse("no match") // match_first: String = no match

numPattern.findAllIn(address).foreach { e =>
	println(e*2)
}

match1 match {
     case Some(s) => println(s"Found: ${s}") // or just s"Found: $s"
     case None =>
     }


val addr = "188 wall street 12".replaceAll("[0-9]+", "x")
//addr: String = x wall street x

val addr = "188 wall street 12".replaceAll("[0-9]", "x")
//addr: String = xxx wall street xx

val addr = "188 wall street 12".replaceFirst("[0-9]", "x")
//addr: String = x88 wall street 12

val addr = "188 wall street 12".replaceFirst("[0-9]+", "x")
//addr: String = x wall street 12


val replaced = myregex.replaceAllIn("456 street 2333", "Y")
//replaced: String = YYY street YYYY

val replaced = myregex.replaceFirstIn("456 street 2333", "Y")
//replaced: String = Y56 street 2333


val pattern = "([0-9]+) ([A-Za-z]+)".r
//pattern: scala.util.matching.Regex = ([0-9]+) ([A-Za-z]+)

val pattern(count, fruit) = "100 bananas"
//count: String = 100
//fruit: String = bananas

//the same
"hello".charAt(1)
"hello"(1)
"hello".apply(1)

// See more details and the proper way to do it on pp. 25-26
//Adding your own methods to the String Class
implicit class StringImprovements(val s: String) {
	def increment: String = s.map(c => (c+1).toChar)
	def decrement: String = s.map(c => (c-1).toChar)
	def hideAll: String = s.replaceAll(".", "*")
	def plusOne: Int = s.toInt + 1
	def asBoolean: Boolean = s match {
		case "0" | "zero" | "" | " " => false
		case _ => true
	}
}
// defined class StringImprovements

"HAL".increment
// res96: String = IBM
"0".decrement
"0".asBoolean









