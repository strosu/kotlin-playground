import java.text.NumberFormat
import javax.swing.text.NumberFormatter
import kotlin.math.roundToInt

const val PLAYER_NAME = "Ender"

fun main() {
    rawStringDisplay()
    println("Hero level please?")
//    var playerLevelNullChecks = readLine()?.toInt() ?: 0
    var playerLevel = checkNotNull(readLine()) {
        "No input was provided"
    }.toInt()

    require(playerLevel > 0) {
        "Has to be greater than 0"
    }

    println("The hero is called $PLAYER_NAME and is level $playerLevel")
    var quest = getQuest(playerLevel)
    var replaced = quest?.replace("abc", "");

    println("!!!!!!Replace is $replaced")

    println(quest)

    playerLevel += 1
    println(playerLevel)

    var item = forgeItem(itemName = "shield", "iron")
    println(item)

    var itemsList = listOf("sword", "shield")
    println(itemsList[1])

    doBalance()
}

private fun rawStringDisplay() {
    println("""
        |The hero sees the board
        |   and does nothing with it
    """.trimMargin())
}

private fun doBalance() {
    val currentBalance = 112.40;
    val formatter = NumberFormat.getCurrencyInstance()
    println(formatter.format(currentBalance))
    val intPortion = currentBalance.roundToInt()

    var playerLevel : UInt = 5u
    println(playerLevel)
}

private fun forgeItem(
    itemName: String,
    material: String,
    hasJewels: Boolean = false,
    quantity: Int = 1) : String {
    return "$itemName made of $material"
}

private fun getQuest(
    playerLevel: Int,
    hasAngered: Boolean = false) : String? {
    var barbarianFriend = false
    var playerClass = "mage"

    val understandsBarbarians = (barbarianFriend || playerClass == "barbarian") && !hasAngered

    val quest = if (playerLevel == 1) {
        "tutorial"
    } else {
        if (understandsBarbarians) {
            "negotiate"
        } else {
            null
        }
    }

    println(quest)

    val faction = when (playerClass) {
        "barbarian" -> "warrior"
        "paladin" -> "human"
        "mage" -> 123
        else -> "unknown"
    }

    println(faction);

    when (val whenBreaker = 3) {
        3 -> println("three")
        in 2..4 -> println("two")
        5 -> println("five")
        in 6..10 -> println("Level $whenBreaker character")
    }

    return quest
}

private fun increment(value: Integer) {
    println(value)
    return
}
