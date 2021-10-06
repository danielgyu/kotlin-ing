object MySingleton {
    fun printHello() = println( "Hello Singleton!" )
}

object MyProcessors {
    fun numOfProcs() = Runtime.getRuntime().availableProcessors()
}

fun main() {
    val circle = object {
	val x = 10
	val y = 10
    }

    println("circle x in ${circle.x}")

    MySingleton.printHello()
    println(MyProcessors.numOfProcs())
}
