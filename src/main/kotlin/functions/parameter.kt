fun describePerson(name: String, age: Int = 30, height: Int): String {
    return "$name $age $height"
}

fun sayHello(name: String): String {
    return name
}

fun findMax(vararg numbers: Int): Int {
    println(numbers)
    return 1
}

fun main() {
    val hello: String = sayHello("lee")
    println(hello)

    val p1: String = describePerson("park", 30, 180)
    println(p1)
}
