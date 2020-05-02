/** Char, Byte, Short, Int, Long, Float, Double **/

Float.MaxValue
// res123: Float = 3.4028235E38

Double.MaxValue
// res124: Double = 1.7976931348623157E308

"1".toInt
"5".toLong
val b = BigInt("1")
val b = BigDecimal("3.14159")

val a = Double.PositiveInfinity // Double.NegativeInfinity or Float....
// a: Double = Infinity

Integer.parseInt("A", 16)
// res149: Int = 10

Integer.parseInt("1000", 2)
// res156: Int = 8

implicit class StringToInt(s: String) {
	def toIntRad(radix: Int) = Integer.parseInt(s, radix)
}

"1001".toIntRad(2)

def toInt(s: String):Option[Int] = {
	try {
		Some(s.toInt)
	} catch {
		case e: NumberFormatException => None
	}
}

val aString = "123"
val aString = "123a"

toInt(aString) match {
	case Some(n) => println(n)
	case None => println("Boom! That wasn't a number!")
}


val a = 1d
val a = 1f
val a = 1000L

val a = 0: Byte
val a = 5: Int

val b: Short = 0

val s = "Dave"
// s: String = Dave

val p = s: Object
// p: Object = Dave

class Foo {
	var a: Short = 2 // specify a defalut value
	var b: Short = _ // defaults to 0 if not specified
}

var s = 1 // THIS IS VARIABLE
// Those are methods below
s += 1
s -= 1
s *= 2
s /= 2 // integer division
s /= 2 // mod division


// comparing float numbers with a given precision

def ~=(x: Double, y: Double, precision: Double) = {
	if ((x-y).abs < precision) true else false
}

val a = 0.3
// a: Double = 0.3
val b = 0.1+0.2
// b: Double = 0.30000000000000004

a == b
// res23: Boolean = false
~=(a, b, 0.0001)
//res24: Boolean = true
~=(a, b, 10e-10)
// res27: Boolean = true
~=(a, b, 10e-20)
// res28: Boolean = false

val a = BigInt(1201921929)
// a: scala.math.BigInt = 1201921929
a.isValidShort
//res31: Boolean = false
a.isValidLong
//res32: Boolean = true

val r = scala.util.Random
r.nextInt
r.nextInt(100) // from 0 to 99
r.nextFloat

// setting a seed
val r = new scala.util.Random(100)
r.setSeed(100)

r.nextPrintableChar
// res48: Char = F
// res48: Char = %

// Ranges
val r = 1 to 10 by 2
r.foreach(println) // 1,3,5,7,9

for (i <- 1 to 5) println(i) // 1,2,3,4,5
for (i <- 1 to 5) yield i * 2 // 2, 4, 6, 8, 10

val pi = scala.math.Pi
println(f"$pi%1.5f")

val formatter = java.text.NumberFormat.getCurrencyInstance
println(formatter.format(123.456789))
// 123,46 руб.

val locale = new java.util.Locale("fr", "FR")
var formatter = java.text.NumberFormat.getCurrencyInstance(locale)
println(formatter.format(123.456789))
// 123,46 €

import java.util.{Currency, Locale}
val ru = Currency.getInstance(new Locale("ru", "RU"))
val de = Currency.getInstance(new Locale("de", "DE"))
val us = Currency.getInstance(new Locale("us", "US"))
formatter.setCurrency(us)
println(formatter.format(123456.789))


val locale = new java.util.Locale("ru", "RU")
val formatter = java.text.NumberFormat.getIntegerInstance(locale)
println(formatter.format(12123123.456))

