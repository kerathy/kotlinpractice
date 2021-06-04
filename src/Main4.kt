

//fun getGreeting(): String {
//    return "get greeting function"
//}

//fun getGreeting() = "simplify get greeting function"

//fun sayHello(): Unit {
//    println(getGreeting())
//}

//
//fun sayHello() {
//    println(getGreeting())
//}

//
//fun sayHello(itemToGreet:String) {
//    val message = "hello: " + itemToGreet
////    val message = "hello $itemToGreet"
//    println(message)
//}


//fun sayHello(itemToGreet: String) = println("hello $itemToGreet")
//fun sayHello() {
//    println("say hello");
//}

//fun sayHello2(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")
//
//fun main() {
////    println(getGreeting())
////    println("say Hello Unit")
////    sayHello()
////    sayHello(itemToGreet = "kotlin")
////    sayHello2(greeting="hello: ", itemToGreet = "kotlin")
//
//    val interestingThings = arrayOf("aa", "bb", "cc")
//    println(interestingThings.size)
//    println(interestingThings.get(0))
//
//    for (item in interestingThings) {
//        println(item)
//    }
//
//    println("for each")
//
//    interestingThings.forEach {it
//        println(it)
//    }
//
//    interestingThings.forEach { item ->
//        println(item)
//    }
//
//    println("for each indexed")
//    interestingThings.forEachIndexed { index, s ->
//        println("$s is at index $index")
//    }
//
//
//    val items = listOf("aaa", "bbb", "ccc");
//    println(items[0])
//
//    println("list of....")
//
//    for (item in items) {
//        println(item)
//    }
//
////    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
////    map.forEach{key, value -> println("$key -> $value")}
//    val map2 = mapOf(4 to "value1", 5 to "value2", 6 to "value3")
//    map2.forEach { t, u -> println("$t -> $u") }
//
//
//    println("mutableListof ......")
//    val items2 = mutableListOf("aaaa", "bbbb", "cccc")
//    items2.add("dddd")
//
//    for (item2 in items2) {
//        println(item2)
//    }
//
//    println("mutable map of...")
//    val map3 = mutableMapOf(4 to "value1", 5 to "value2", 6 to "value3")
//    map3.forEach { t, u -> println("$t -> $u") }
//    println("after")
//    map3.put(7, "value4")
//    map3.forEach { t, u -> println("$t -> $u") }
//
//
//
//}


//fun sayHello(greeting:String, itemToGreet:List<String>) {
//    itemToGreet.forEach{ itemToGreet ->
//        println("$greeting $itemToGreet")
//    }
//}

//fun sayHello(greeting:String, vararg itemToGreet:String) {
//    itemToGreet.forEach{ itemToGreet ->
//        println("$greeting $itemToGreet")
//    }
//}



//fun greetPerson(greeting: String ="hello", name: String = "Kotlin") = println("$greeting $name")
fun main() {
//    greetPerson(name = "Kotlin2")
//    greetPerson()

//    val person = Person("firstname2", "lastname2")
//    println(person.firstName)
//    println(person.lastName)

    val person = Person()
//    println(person.firstName)
//    println(person.lastName)
//    person.nickName = "nickName1"
//    person.nickName = "nickName2"
//
//    println(person.nickName)
    person.printInfomation()



}



