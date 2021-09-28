fun tryTest(blowup: Boolean) {
    return try {
	if (blowup) {
	    throw RuntimeException("fail")
	} else {

	}
    } catch (ex: Exception){

    } finally {
	println("bye bye")
    }
}

fun main() {
    val price = 12.25
    println("Price is $price")
    println("Add one to price ${price + 1}")

    println(tryTest(true)) 
    println(tryTest(false))
}
