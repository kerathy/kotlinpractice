

//fun printFilteredStrings(list: List<String>, predicate: (String) -> Boolean) {
//    list.forEach {
//        if (predicate(it)) {
//            println(it)
//        }
//    }
//}

fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
        if (predicate?.invoke(it) == true) {
            println(it)
        }
    }
}

//val predicate: (String) -> Boolean = {
//    it.startsWith("string")
//}

fun getPredicate(): (String) -> Boolean {
    return {it.startsWith("string2")}
}

fun main() {
    val list = listOf("string1", "string2", "string3")
//    printFilteredStrings(list, {it.startsWith("string1")})
//    printFilteredStrings(list, predicate)

    printFilteredStrings(list, getPredicate())

    println("invoke")
    printFilteredStrings(list, null)

    val list2 = listOf("string1", "str2", "str3", null, null)
    list2.filterNotNull()
        .filter { it.startsWith("s") }
        .forEach{
            println(it)
        }


    list2.filterNotNull()
        .filter { it.startsWith("s") }
        .map{
            it.length
        }
        .forEach{
            println(it)
        }


    println("add take")
    list2.filterNotNull()
        .filter { it.startsWith("s") }
        .take(1)
        .map{
            it.length
        }
        .forEach{
            println(it)
        }

    println("associate     ")
    list2.filterNotNull()
        .filter { it.startsWith("s") }
        .associate { it to it.length }
        .forEach{
            println("${it.key} : ${it.value}")
        }


    val map = list2.filterNotNull().associate { it to it.length }
    val firstStr = list2.first()
    val lastStr = list2.last()
    println(firstStr)
    println(lastStr)

    println("find....")

    val list3 = listOf("string1", "str2", "str3", "str4", null, null)
    val filterStrs = list3.filterNotNull().find{it.startsWith("str")}
    val filterStrs2 = list3.filterNotNull().findLast{it.startsWith("str")}
    val filterStrs3 = list3.filterNotNull().findLast{it.startsWith("a")}.orEmpty()
    println(filterStrs)
    println(filterStrs2)

    if (filterStrs3 == "") {
        println("filterStrs3 is an empty string")
    } else {
        println(filterStrs3)
    }

}
