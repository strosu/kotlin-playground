import java.util.*

fun main() {
    println("A new hero enters the arena. What is your name?")
    val heroName = readln()
    var letterCount = heroName.count { x -> x in 'a'..'z' }

    narrate(heroName)

    changeMood()

    narrate("The hero goes through the woods to pick up something")

    narrate("Some new message here", narrationModifier)

    narrate("teeext") { message -> "$message and then some" }
}

fun playGround() {
    var withItArgument: (String) -> String = {
        it.lowercase(Locale.getDefault())
    }

    var multipleArgs = {
            message: String, counter: Int ->
        message + counter
    }

    var multipleArgs2: (String, Int) -> String = {
            message, counter ->
        message + counter
    }

    "abcd".count { it == 'a' }
}