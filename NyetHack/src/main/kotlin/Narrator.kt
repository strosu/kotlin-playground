import kotlin.random.Random
import kotlin.random.nextInt

var narrationModifier: (String) -> String = {
    message -> message
}

fun narrate(message: String) {
    println(narrationModifier(message))
}

fun narrate(message: String, modifier: (String) -> String) {
    println(modifier(message))
}

fun changeMood() {
    val mood: String
    val modifier: (String) -> String

    when (Random.nextInt(1..4)) {
        1 -> {
            mood = "loud"
            modifier = {
                message ->
                    val counter = 3
                    message.uppercase() + "!".repeat(counter)
            }
        }
        2 -> {
            mood = "tired"
            modifier = {
                message ->
                message.lowercase().replace(" ", "...")
            }
        }
        3 -> {
            mood = "unsure"
            modifier = {
                message ->
                "$message?"
            }
        }
        else -> {
            mood = "professional"
            modifier = {
                message ->
                "$message."
            }
        }
    }

    narrationModifier = modifier
    narrate("The narrator begins to feel $mood")
}

fun narrateTest(message: String) {
    var modifier = {
        val exclamationMarksCount = 3
        message.uppercase() + "!".repeat(exclamationMarksCount)
    }

    println(modifier())

    var withArguments: (String, Boolean) -> String = { input: String, _: Boolean ->
        input.uppercase()
    }
}