// FOR LOOPS
// Perform some code for every item in an iterable sequence

//////////////////////
/// GENERAL FORMAT ///
//////////////////////
//  for(item <- iterable_sequence){
//    do something
//  }


for(item <- List(1,2,3)){
  println("Hello")
}

for(item <- Array.range(1,10,3)){
  println(item)
}

for(num <- Range(1,10)){
  if (num%2 == 0){
    println(s"$num is even")
  }else{
    println(s"$num is odd")
  }
}

val names = List("John", "Abe", "Cindy", "Cat")

for(name <- names){
  if(name.startsWith("C")){
    println(s"$name starts with C")
  }else{
    println(s"$name doesn't start with C")
  }
}




// Lists
for(item <- List("a","b","c")){
  println(item)
}

// Range
for(num <- Range(0,3)){
  println(num)
}

for(anything <- Range(0,3)){
  println("hello")
}


// Building it up with Flow Control!
for(num <- Range(0,10)){
  if(num % 2 == 0){
    println(s"$num is even")
  }else{
    println(s"$num is odd")
  }
}

