fun main() {
    // val numbers:IntArray = intArrayOf(1,2,3,4,5,6)
    // val numbers = intArrayOf(1,2,3,4,5,6)
    val numbers = arrayOf(1, 2, 3, 4, 5, 6)
    val numbersD: DoubleArray = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0)
    println("initial values ${numbers.contentToString()}")
    numbersD[5] = 4.5 // change value

    val days = arrayOf("sun", "mon", "tues")
    println(days.contentToString())

    val fruits = arrayOf(Fruit("Fraise", 2.99), Fruit("Cocombre", 2.59))
    print(fruits.contentToString())
    for (fruit in fruits) {
        print(" ${fruit.name}")
    }

    for (index in fruits.indices) {
        println("\n  ${fruits[index].name} is in index $index")
    }
}

data class Fruit(val name: String, val price: Double)
