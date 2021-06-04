
var name2: String? = null
var greeting: String? = null

var name3: String? = null


fun main() {
//    println("hello kotlin");
//    var name: String = "aa"
//    name = "resign"
//    println(name)

//    val name: String = "bb"
//    println(name)
//    name2 = "cc2"
//    println(name2)

//    greeting = null
//    println(greeting)
//    if (greeting != null) {
//        println(greeting)
//    } else {
//        println("greeting is null")
//    }

//    greeting = "hello"
//
//    when (greeting) {
//        null -> println("greeting is null")
//        else -> println(greeting)
//    }


//    val greetingToPrint = if(greeting != null) greeting else "Hello"
//    println(greetingToPrint)


//    val greetingToPrint = when(greeting) {
//        null -> "helloToPrint"
//        else -> greeting
//    }
//    println(greetingToPrint)

//    name3 = "name3"
//    if (name3 != null) {
//        println(name3)
//    } else {
//        println("name3 is null")
//    }

    val returnValue = if (greeting != null) {
        println(greeting)
    } else {
        println("returnValue: greeting is null")
    }
}