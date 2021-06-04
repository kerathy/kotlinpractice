import java.util.*

//interface IdProvider {
//    fun getId(): String
//}
//
//class Entity private constructor(val id: String) {
//    companion object Factory : IdProvider{
//        override fun getId(): String {
//            println("interface idprovider, getId function")
//            return "interface idprovider, getId function"
//        }
//
//        const val id = "id1"
////        fun create() = Entity(id)
//        fun create() = Entity(getId())
//    }
//}
//
//fun main() {
////    val entity = Entity("id1")
//    val entity = Entity.Factory.create()
//    println(Entity.id)
//}

//object EntityFactory {
//    fun create() = Entity("id1", "name1")
//}

enum class EntityType {
    HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityFactory {
//    fun create() : Entity {
//        val id = UUID.randomUUID().toString()
////        return Entity("id1", "name1")
//        return Entity(id, "name1")
//    }

    fun create(type: EntityType) : Entity{
        val id = UUID.randomUUID().toString()
        val name2 = when(type) {
            EntityType.EASY -> "Easy...."
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> type.name
            EntityType.HELP -> Entity.Help
        }

//        return Entity(id, name)

        return when (type) {
            EntityType.EASY -> Entity.Easy(id)
            EntityType.MEDIUM -> Entity.Medium(id)
            EntityType.HARD -> Entity.Hard(id)
            EntityType.HELP -> Entity.Help
//            EntityType.HARD -> Entity.Hard(id, name, multiplier: 2f)
        }
    }
}

sealed class Entity() {
    object Help : Entity() {
        val name = "Help"
    }

//    data class Easy(val id: String, val name: String): Entity()
//    data class Medium(val id: String, val name: String): Entity()
//    data class Hard(val id: String, val name: String, val multiplier: Float): Entity()
//    data class Hard(val id: String, val name: String): Entity()

    data class Easy(val id: String): Entity()
    data class Medium(val id: String): Entity()
    data class Hard(val id: String): Entity()

}

fun Entity.Medium.printInfo() {
    println("Medium class's id: $id")
}

//class Entity (val id: String, val name: String) {
//    override fun toString(): String {
//        return "id:$id name:$name"
//    }
//}

//class Entity private constructor(val id: String) {
//    companion object Factory {
//        fun create() = Entity("id1")
//    }
//}

val Entity.Medium.info: String
    get() = "medium info related"


fun main() {
//    val entity = Entity("id1")
//    val entity = Entity.Factory.create()

//    val entity = EntityFactory.create()
//    println(entity)

//    val entity2 = EntityFactory.create(EntityType.EASY)
//    println(entity2)
//
//    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
//    println(mediumEntity)

//    val entity:Entity = EntityFactory.create(EntityType.EASY)
//
//    val message = when(entity) {
//        Entity.Help -> "help class"
//        is Entity.Easy -> "easy class"
//        is Entity.Medium -> "medium class"
//        is Entity.Hard -> "hard class"
//    }
//
//    println(message)


    val entity1 = EntityFactory.create(EntityType.EASY)
    val entity2 = EntityFactory.create(EntityType.EASY)
    if (entity1 == entity2) {
        println("two entities are the same")
    } else {
        println("they are not the same")
    }

    val entity3 = Entity.Easy("id1")
    val entity4 = Entity.Easy("id1")
    if (entity3 == entity4) {
        println("entity3 and entity4 are equal")
    } else {
        println("entity3 and entity4 are not equal")
    }

    val entity5 = Entity.Easy("id2")
    val entity6 = entity5.copy(id = "id2")

    if (entity5 == entity6) {
        println("entity5 and entity6 are equal")
    } else {
        println("entity5 and entity6 are not equal")
    }

    println("Entity.Medium.PrintInfo Function")
    Entity.Medium("mediumid").printInfo()

    val entity7 = Entity.Easy("entity7id")
    val entity8 = EntityFactory.create(EntityType.MEDIUM)

    if (entity8 is Entity.Medium) {
        entity8.printInfo()
        println(entity8.info)
    }
}