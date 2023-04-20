import kotlin.reflect.typeOf

const val PLAYER_NAME = "Ender"

fun main() {
    var playerLevel = 4

    println("$playerLevel is called $PLAYER_NAME")
    var barbarianFriend = true
    var playerClass = "mage"

    val understandsBarbarians = barbarianFriend || playerClass == "barbarian"

    val quest = if(playerLevel == 1) {
        "tutorial"
    }
    else {
        if (understandsBarbarians) {
            "negotiate"
        }
        else {
            "kill"
        }
    }

    println(quest);

    val faction = when (playerClass) {
        "barbarian" -> "warrior"
        "paladin" -> "human"
        "mage" -> 123
        else -> "unknown"
    }

    println(faction);

    when (val whenBreaker = 3) {
        3 -> print("three")
        in 2..4 -> print("two")
        5 -> print("five")
        in 6..10 -> println("Level $whenBreaker character")
    }

    playerLevel += 1
    println(playerLevel)

    var itemsList = listOf("sword", "shield")
    println(itemsList[1])

    // Challenge1()
}

fun Challenge1() {

    var hasSteed = true;
    var heroGold = 50;
    var pubName = "Unicorn's horn"
    var pubMenu = listOf("meat", "bread", "soufle")

    var reflectedName = PLAYER_NAME.reversed()
    println(reflectedName)
}