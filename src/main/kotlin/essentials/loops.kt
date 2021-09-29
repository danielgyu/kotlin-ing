fun main() {
    val list = listOf(3, 4, 5)
    for (l in list) { println(l) }

    val mixedList = listOf(3, 'a', "Hello")
    for (l in mixedList) { println(l) }
    
    println(mixedList.get(0))
}
