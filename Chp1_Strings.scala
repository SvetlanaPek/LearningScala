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



