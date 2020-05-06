// FUNCTIONS

// Functions allow you to easily re-use and call code segments!

////////////////////
// GENERAL FORMAT //
////////////////////

// def functionName(input1:type,intput2:type): return type = {
//    do stuff
//                     }

def simple(): Unit = {
  println("simple print")
}

simple()


def adder(num1: Int, num2: Int): Int = {
  return num1 + num2
}

adder(4,5)


def greetName(name:String): String = {
  return s"Hello $name!"
}

val fullgreet = greetName("Ella")
println(fullgreet)


def isPrime(numcheck: Int): Boolean = {
  for(n <- Range(2, numcheck)){
    if(numcheck%n == 0){
      return false
    }
  }
  return true
}

println(isPrime(2)) // error, it was a simple check
println(isPrime(10))
println(isPrime(23))


val numbers = List(1,2,3,7)

def check(nums: List[Int]): List[Int] = {
  return nums
}

println(check(numbers))


