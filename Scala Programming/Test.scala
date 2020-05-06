// 1
def singleEven(num: Int): Boolean = {
	return num%2 == 0
}

def checkEven(num:Int) = num%2 == 0
val out = checkEven(5)
println(s"One line function: $out")

println("Exercise 1")
println(singleEven(6))
println(singleEven(3))
println(singleEven(0))

// 2
def evensInList(lst: List[Int]): Boolean = {
	for(num <- lst){
		if(num%2 == 0){
			return true
		}
	}
	return false
}

println("\nExercise 2")
println(evensInList(List(1,3,5,7)))
println(evensInList(List(1,3,4,7)))

// 3
def numSeven(lst: List[Int]): Int = {
	var result = lst.sum
	if(lst.contains(7)){
		var num_sev = lst.count(x => {x==7})
		result += num_sev*7
	}
	return result
}

println("\nExercise 3")
println(numSeven(List(1,2,3))) // 6
println(numSeven(List(1,2,7))) // 17
println(numSeven(List(1,7,2,7))) // 31


// 4
def balance(lst: List[Int]): Boolean = {
	val length = lst.length
	var left = List[Int]()
	var right = List[Int]()
	for(i <- Range(1, length-1)){
		left = lst slice (0, i)
		right = lst slice (i, length)
		if(left.sum == right.sum){
			println(s"left is $left, and right is $right")
			return true
		}
	}
	return false
}

println("\nExercise 4")
println(balance(List(1,5,3,3)))
println(balance(List(7,3,4)))
println(balance(List(1,1,1)))

// 5
def palindrome(s: String): Boolean = {
	return (s == s.reverse) 
}

println("\nExercise 5")
println(palindrome("madam"))
println(palindrome("table"))

