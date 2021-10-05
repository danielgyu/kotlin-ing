fun <T> useandClose(input: T)
    where T: AutoCloseable,
    T: Appendable {
	input.append("here")
	input.close()
    }

fun main() {
    val num: Any = 30
    println(num is Int)
    println(num is Float)

    val numString: Any = "30"
    println(numString as? Int)
}
