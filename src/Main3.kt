fun main(args: Array<String>) {
    val num1 = 10
    val num2 = 20
    val num3 = 30
    val result = if (num1 > num2) {
        val max = if (num1 > num3) {
            num1
        } else {
            num3
        }
        "the maximum value is num1, and the num1's value is: " + max
    } else if (num2 > num3) {
        "the maximum value is num2, and the num2's value is: " + num2
    } else {
        "the maximum value is num3, and the num3's value is " + num3
    }
//    println(result)
    println("$result")
}