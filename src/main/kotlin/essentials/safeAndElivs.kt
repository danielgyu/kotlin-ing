fun getNickName(name: String?): String {
    if (name == "Lionel") {
	return "Messi"
    }

    return name?.reversed() ?: "Joker"
}

fun main() {
    println(getNickName("Lionel"))
    println(getNickName("Cristiano"))
    println(getNickName(null))
}
