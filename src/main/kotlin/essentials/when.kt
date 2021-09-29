fun isAlive(number: Int) = when {
    number < 80 -> true
    number > 90 -> false
    number < 100 -> true
    else -> false
} 

fun main() {
    val alive: Boolean = isAlive(100)
    println("is it false? $alive")
}
