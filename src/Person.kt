//class Person {
//
//
//
//}

//class Person(_firstName: String, _lastName: String) {
//    val firstName: String
//    val lastName: String
//
//    init {
//        firstName = _firstName
//        lastName = _lastName
//    }
//}

//class Person(val firstName: String, val lastName: String) {
//    init {
//        println("init 1")
//    }
//    constructor(): this("firstNameConstructor", "lastNameConstructor" ) {
//        println("seconday constructor")
//    }
//
//    init {
//        println("init 2")
//    }
//}

class Person(val firstName: String = "defaultFirstName", val lastName: String = "defaultLastName") {
//    init {
//        println("init 1")
//    }
//    constructor(): this("firstNameConstructor", "lastNameConstructor" ) {
//        println("seconday constructor")
//    }
//
//    init {
//        println("init 2")
//    }

    var nickName:String? = null

    set(v) {
        field = v
        println("new nickName's value: $v")
    }

    get() {
        println("the filed's value: $field");
        return field;
    }

    fun printInfomation() {
//        val nickNameToPrint = if (nickName != null) nickName else "no NickName provided"
        val nickNameToPrint = nickName ?: "no NickName provided"
        println("$firstName $lastName $nickNameToPrint")
    }
}