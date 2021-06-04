interface PersonInfoProvider {
    val providerInfo: String
    fun printInfo(person: Person) {
        println(providerInfo)
//        println("Personinfoprovider interface")
        person.printInfomation()
    }
}

interface SessionInfoProvider {
    fun getSession() : String
}

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "Basic Info Provider: val providerInfo"


    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("override printInfo function........")
    }

    open val sessionPrefix = "Session..."
    override fun getSession(): String {
        println("override get Session function")
        return sessionPrefix
    }
}


//class BasicInfoProvider : PersonInfoProvider {
//    override fun printInfo(person: Person) {
//        println("override method, basic info provider class")
//        person.printInfomation()
//    }
//}

fun main() {
//    val provider =  BasicInfoProvider()

//    val provider = FancyInfoProvider()

    val provider = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "object, personInfo Provider"

        fun getSession() = "get session: object personInfoProvider"
    }
    provider.printInfo(Person())

    provider.getSession()

    checkTypes(provider)


//    println(provider.sessionPrefix)
}

fun checkTypes(infoProvider: PersonInfoProvider) {
    if (infoProvider is SessionInfoProvider) {
        println("is a session info provider")
        infoProvider.getSession()
    } else {
        println("not a session provider")
    }
}