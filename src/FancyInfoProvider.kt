
class FancyInfoProvider : BasicInfoProvider() {

    override val sessionPrefix: String
        get() = "Fancy Session: Fancy Info Provider"

    override val providerInfo: String
        get() = "Fancy Info Provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("get fancy info....")
    }
}

