fun testAny(anything: Any): Any {
    return anything
}

fun testUnit(): Unit {
    return
}

fun testNothing(): Nothing{
    throw RuntimeException("testing Nothing")
}

fun main() {
    println(testAny(1))
    println(testAny(100))
    println("unit:" + testUnit())
    testNothing()
}
