//
//fun main(args: Array<String>) {
//    val num1 = 10
//    val num2 = 20
//    val result = if (num1 > num2) {
//        println("num1 is greater than num2")
//        "$num1 is greater than $num2"
//    } else {
//        println("num1 is not greater than num2")
//        "$num1 is not greater than $num2"
//    }
//
//    println(result)
//}

//fun main(args: Array<String>) {
//    val num1 = 10
//    val num2 = 5
//    val result = if (num1 > num2) "$num1 is greater than $num2" else "$num1 is not greater than $num2"
//    println(result)
//}


fun main(args: Array<String>) {
    val num = 0
    val result = if (num > 0) {
        "$num is positive"
    } else if (num < 0) {
        "$num is negative"
    } else {
        "$num is zero"
    }
    println(result)
}